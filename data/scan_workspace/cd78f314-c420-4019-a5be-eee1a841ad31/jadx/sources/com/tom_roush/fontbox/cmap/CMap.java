package com.tom_roush.fontbox.cmap;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class CMap {
    private static final String SPACE = " ";
    private int maxCodeLength;
    private int wmode = 0;
    private String cmapName = null;
    private String cmapVersion = null;
    private int cmapType = -1;
    private String registry = null;
    private String ordering = null;
    private int supplement = 0;
    private int minCodeLength = 4;
    private final List<CodespaceRange> codespaceRanges = new ArrayList();
    private final Map<Integer, String> charToUnicode = new HashMap();
    private final Map<String, byte[]> unicodeToByteCodes = new HashMap();
    private final Map<Integer, Integer> codeToCid = new HashMap();
    private final List<CIDRange> codeToCidRanges = new ArrayList();
    private int spaceMapping = -1;

    private int getCodeFromArray(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 << 8) | ((bArr[i + i4] + 256) % 256);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int toInt(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 << 8) | (bArr[i3] & 255);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addCIDMapping(int i, int i2) {
        this.codeToCid.put(Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addCIDRange(char c, char c2, int i) {
        CIDRange cIDRange;
        if (this.codeToCidRanges.isEmpty()) {
            cIDRange = null;
        } else {
            cIDRange = this.codeToCidRanges.get(r0.size() - 1);
        }
        if (cIDRange == null || !cIDRange.extend(c, c2, i)) {
            this.codeToCidRanges.add(new CIDRange(c, c2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void addCharMapping(byte[] bArr, String str) {
        this.unicodeToByteCodes.put(str, bArr.clone());
        int codeFromArray = getCodeFromArray(bArr, 0, bArr.length);
        this.charToUnicode.put(Integer.valueOf(codeFromArray), str);
        if (" ".equals(str)) {
            this.spaceMapping = codeFromArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addCodespaceRange(CodespaceRange codespaceRange) {
        this.codespaceRanges.add(codespaceRange);
        this.maxCodeLength = Math.max(this.maxCodeLength, codespaceRange.getCodeLength());
        this.minCodeLength = Math.min(this.minCodeLength, codespaceRange.getCodeLength());
    }

    public byte[] getCodesFromUnicode(String str) {
        return this.unicodeToByteCodes.get(str);
    }

    public String getName() {
        return this.cmapName;
    }

    public String getOrdering() {
        return this.ordering;
    }

    public String getRegistry() {
        return this.registry;
    }

    public int getSpaceMapping() {
        return this.spaceMapping;
    }

    public int getSupplement() {
        return this.supplement;
    }

    public int getType() {
        return this.cmapType;
    }

    public String getVersion() {
        return this.cmapVersion;
    }

    public int getWMode() {
        return this.wmode;
    }

    public boolean hasCIDMappings() {
        return (this.codeToCid.isEmpty() && this.codeToCidRanges.isEmpty()) ? false : true;
    }

    public boolean hasUnicodeMappings() {
        return !this.charToUnicode.isEmpty();
    }

    public int readCode(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[this.maxCodeLength];
        inputStream.read(bArr, 0, this.minCodeLength);
        inputStream.mark(this.maxCodeLength);
        int i = this.minCodeLength - 1;
        while (i < this.maxCodeLength) {
            i++;
            Iterator<CodespaceRange> it = this.codespaceRanges.iterator();
            while (it.hasNext()) {
                if (it.next().isFullMatch(bArr, i)) {
                    return toInt(bArr, i);
                }
            }
            if (i < this.maxCodeLength) {
                bArr[i] = (byte) inputStream.read();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.maxCodeLength; i2++) {
            sb.append(String.format("0x%02X (%04o) ", Byte.valueOf(bArr[i2]), Byte.valueOf(bArr[i2])));
        }
        Log.w("PdfBox-Android", "Invalid character code sequence " + ((Object) sb) + "in CMap " + this.cmapName);
        if (inputStream.markSupported()) {
            inputStream.reset();
        } else {
            StringBuilder sb2 = new StringBuilder("mark() and reset() not supported, ");
            sb2.append(this.maxCodeLength - 1);
            sb2.append(" bytes have been skipped");
            Log.w("PdfBox-Android", sb2.toString());
        }
        return toInt(bArr, this.minCodeLength);
    }

    public void setName(String str) {
        this.cmapName = str;
    }

    public void setOrdering(String str) {
        this.ordering = str;
    }

    public void setRegistry(String str) {
        this.registry = str;
    }

    public void setSupplement(int i) {
        this.supplement = i;
    }

    public void setType(int i) {
        this.cmapType = i;
    }

    public void setVersion(String str) {
        this.cmapVersion = str;
    }

    public void setWMode(int i) {
        this.wmode = i;
    }

    public int toCID(int i) {
        Integer num = this.codeToCid.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        Iterator<CIDRange> it = this.codeToCidRanges.iterator();
        while (it.hasNext()) {
            int map = it.next().map((char) i);
            if (map != -1) {
                return map;
            }
        }
        return 0;
    }

    public String toString() {
        return this.cmapName;
    }

    public String toUnicode(int i) {
        return this.charToUnicode.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void useCmap(CMap cMap) {
        Iterator<CodespaceRange> it = cMap.codespaceRanges.iterator();
        while (it.hasNext()) {
            addCodespaceRange(it.next());
        }
        this.charToUnicode.putAll(cMap.charToUnicode);
        this.codeToCid.putAll(cMap.codeToCid);
        this.codeToCidRanges.addAll(cMap.codeToCidRanges);
    }
}
