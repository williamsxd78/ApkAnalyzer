package MCOFeQ;

import com.airbnb.paris.R2;
import com.google.common.base.Ascii;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import kotlin.io.encoding.Base64;

/* loaded from: classes.dex */
class DmmOBX {
    private static final int DnrBJ = 3;
    private static final int IEltn = 4;
    public static int MND = 2239;
    private static final int MfziWN = 48;
    private static final int TfnbBH = 128;
    private static final int VuRGej = 12;
    public static int WnL = 3812;
    private static final int bljTW = 2;
    private static final int dDzmuT = 49;
    private static final int gMIvb = 5;
    static final byte[] jlmKRr = {6, 8, 42, -122, 72, -50, Base64.padSymbol, 4, 3, 2};
    static final byte[] XYHjEK = {6, 9, 42, -122, 72, -122, -9, Ascii.CR, 1, 1, Ascii.VT};
    static final byte[] NdXpDf = {6, 3, 85, 4, 3};
    static final byte[] GNuaWg = {6, 9, 42, -122, 72, -122, -9, Ascii.CR, 1, 9, 4};
    static final byte[] RcIdrK = {6, 10, 42, -122, 72, -122, -9, Ascii.CR, 1, 9, Ascii.EM, 3};
    static final byte[] VbeDgK = {6, 9, 42, -122, 72, -122, -9, Ascii.CR, 1, 9, 3};
    static final byte[] lWTkWY = {6, 9, 42, -122, 72, -122, -9, Ascii.CR, 1, 9, Ascii.NAK};
    static final byte[] KhAise = {6, 9, 42, -122, 72, -122, -9, Ascii.CR, 1, 7, 1};
    static final byte[] VBGpxd = {6, 9, 42, -122, 72, -122, -9, Ascii.CR, 1, 7, 2};
    static final byte[] RACxqq = {6, 9, 96, -122, 72, 1, 101, 3, 4, 2, 1};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class dmmOBX implements Comparator {
        public static int dEU = 4512;
        public static int wfw = 8637;

        dmmOBX() {
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:111:0x01a4 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x019e -> B:70:0x016a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x00c9 -> B:79:0x0097). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x00cf -> B:79:0x0097). Please report as a decompilation issue!!! */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int compare(byte[] r8, byte[] r9) {
            /*
                Method dump skipped, instructions count: 428
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.DmmOBX.dmmOBX.compare(byte[], byte[]):int");
        }
    }

    private DmmOBX() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        r6 = MCOFeQ.DmmOBX.MND;
        r7 = r6 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r7 == 33) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r7 == 192) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r7 == 331) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        r6 = ((MCOFeQ.DmmOBX.MND ^ 3635) >> 18) % 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        MCOFeQ.DmmOBX.MND = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r6 >> 83) >> 60) >> 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        r6 = ((r6 >> 2) * 71) % 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (MCOFeQ.DmmOBX.MND <= 2238) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        r6 = MCOFeQ.DmmOBX.MND;
        r7 = r6 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r7 == 6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r7 == 132) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        if (r7 == 278) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
    
        if (r7 == 342) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND ^ 2677) >> 33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0099, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND % 26) % 92) >> 44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0094, code lost:
    
        MCOFeQ.DmmOBX.MND = (r6 ^ 5382) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a8, code lost:
    
        MCOFeQ.DmmOBX.MND = (r6 + r6) >> 104;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006d -> B:32:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int GQFpCJ(int r6, @javax.annotation.Nullable byte[] r7, byte[] r8, int r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.DmmOBX.GQFpCJ(int, byte[], byte[], int):int");
    }

    private static int GvEMHq(BigInteger bigInteger, @Nullable byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        byte[] byteArray = bigInteger.toByteArray();
        if (MND > 2238) {
            return GQFpCJ(2, byteArray, bArr, i);
        }
        do {
            i2 = MND;
            i3 = i2 + 13;
            if (i3 != 70) {
                if (i3 == 115) {
                    i4 = ((i2 + i2) + i2) ^ R2.styleable.CompoundButton_buttonTint;
                } else if (i3 == 213) {
                    i4 = (i2 ^ R2.style.Theme_AppCompat_DayNight_DarkActionBar) % 54;
                }
                MND = i4;
            }
            while (true) {
                MND = ((MND * 96) + i2) ^ 1743;
            }
        } while (i3 != 330);
        while (true) {
            MND = (MND + i2) % 44;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nonnull
    public static byte[] KJSJUB(@Nullable Object obj, byte b, byte b2) {
        byte[] bArr = new byte[KXVWAn(obj, null, -1)];
        KXVWAn(obj, bArr, 0);
        bArr[0] = (byte) ((b << 6) | 32 | b2);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0146, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND >> 77) ^ 1701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0080, code lost:
    
        r10 = MCOFeQ.DmmOBX.WnL % 107;
        r0 = MCOFeQ.DmmOBX.MND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0088, code lost:
    
        if ((r0 ^ 2239) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b0, code lost:
    
        MCOFeQ.DmmOBX.WnL = r10 ^ 4023;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (r0 > 2238) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
    
        r10 = MCOFeQ.DmmOBX.MND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        if ((r10 + 78) == 49) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bf, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r10 + r10) * 43) ^ 3467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x008a, code lost:
    
        r10 = MCOFeQ.DmmOBX.MND;
        r0 = r10 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0090, code lost:
    
        if (r0 == 47) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0094, code lost:
    
        if (r0 == 194) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0098, code lost:
    
        if (r0 == 205) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009f, code lost:
    
        MCOFeQ.DmmOBX.MND *= com.airbnb.paris.R2.color.primary_dark_material_dark;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ad, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND % 100) * 31) % 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x009f, code lost:
    
        MCOFeQ.DmmOBX.MND = (r10 + r10) ^ 3188;
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] KVjwcN(@javax.annotation.Nullable byte[] r10) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.DmmOBX.KVjwcN(byte[]):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x012c, code lost:
    
        MCOFeQ.DmmOBX.MND = (r0 + r0) * 118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0137, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND ^ 3365) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0137, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND >> 50) + r0) * 69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0141, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r0 % 1) % 65) * 41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00f1, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) != 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00fc, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00fe, code lost:
    
        r1 = MCOFeQ.DmmOBX.MND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0102, code lost:
    
        if ((r1 + com.airbnb.paris.R2.attr.windowFixedHeightMajor) == 35) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4 == 244) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0105, code lost:
    
        MCOFeQ.DmmOBX.MND = (r1 % 70) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0165, code lost:
    
        if (MCOFeQ.DmmOBX.WnL <= 3811) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0167, code lost:
    
        r1 = MCOFeQ.DmmOBX.WnL;
        r2 = r1 + 156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x016d, code lost:
    
        if (r2 == 16) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0171, code lost:
    
        if (r2 == 19) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0175, code lost:
    
        if (r2 == 24) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        MCOFeQ.DmmOBX.MND = (r9 % 38) ^ 2232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x017d, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((MCOFeQ.DmmOBX.WnL >> 65) + r1) >> 35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0187, code lost:
    
        if (MCOFeQ.DmmOBX.MND > 2238) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0189, code lost:
    
        r9 = MCOFeQ.DmmOBX.MND;
        r10 = r9 + com.airbnb.paris.R2.color.material_grey_50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x018d, code lost:
    
        if (r10 == 66) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0191, code lost:
    
        if (r10 == 167) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0195, code lost:
    
        if (r10 == 336) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01a4, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND + r9) % 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0198, code lost:
    
        MCOFeQ.DmmOBX.MND = (r9 + r9) * 125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x019e, code lost:
    
        MCOFeQ.DmmOBX.MND = (r9 % 6) >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0178, code lost:
    
        MCOFeQ.DmmOBX.WnL = (r1 ^ com.airbnb.paris.R2.styleable.SearchView_searchHintIcon) * 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01ac, code lost:
    
        MCOFeQ.DmmOBX.WnL = r1 * com.airbnb.paris.R2.dimen.abc_text_size_medium_material;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01b4, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01b6, code lost:
    
        r9 = MCOFeQ.DmmOBX.MND;
        r10 = r9 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01ba, code lost:
    
        if (r10 == 38) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND * 69) ^ 4441) + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01be, code lost:
    
        if (r10 == 191) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01d0, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND % 103) * 75) >> 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01c8, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r9 >> 107) * 105) % 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01db, code lost:
    
        return RkXdgE(java.lang.String.valueOf(r9), r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01f0, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) != 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01f6, code lost:
    
        if ((MCOFeQ.DmmOBX.MND + 169) == 53) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01f9, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND >> 25) ^ com.airbnb.paris.R2.styleable.TextAppearance_android_textStyle;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0201, code lost:
    
        r0 = MCOFeQ.DmmOBX.WnL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0205, code lost:
    
        if ((r0 + 169) == 10) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0208, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((r0 >> 3) ^ 3143) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0211, code lost:
    
        if (MCOFeQ.DmmOBX.MND > 2238) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0213, code lost:
    
        r0 = MCOFeQ.DmmOBX.MND;
        r9 = r0 + 156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0219, code lost:
    
        if (r9 == 46) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND >> 59) + r9) + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x021d, code lost:
    
        if (r9 == 114) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0224, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r0 * 42) ^ com.airbnb.paris.R2.styleable.CompoundButton_buttonTint) >> 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0221, code lost:
    
        if (r9 == 124) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0233, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND ^ com.airbnb.paris.R2.drawable.abc_text_select_handle_middle_mtrl_dark) >> 53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x022d, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND % 35) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0233, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND ^ com.airbnb.paris.R2.drawable.abc_text_select_handle_middle_mtrl_dark) >> 53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r10[r11] = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (MCOFeQ.DmmOBX.MND > 2238) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r9 = MCOFeQ.DmmOBX.MND;
        r0 = r9 + com.airbnb.paris.R2.color.switch_thumb_normal_material_dark;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r0 == 36) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r0 == 43) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r0 == 228) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r0 == 328) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        MCOFeQ.DmmOBX.MND = (r9 >> 24) * 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        MCOFeQ.DmmOBX.MND *= 139284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r9 + r9) ^ 4186) * 88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND + r9) % 64) ^ 2468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
    
        r10[r11 + 1] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007b, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        r9 = MCOFeQ.DmmOBX.MND;
        r4 = r9 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 == 57) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0115, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) != 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0117, code lost:
    
        r0 = MCOFeQ.DmmOBX.MND;
        r1 = r0 + com.airbnb.paris.R2.color.abc_secondary_text_material_dark;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011d, code lost:
    
        if (r1 == 14) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0121, code lost:
    
        if (r1 == 87) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0125, code lost:
    
        if (r1 == 247) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0129, code lost:
    
        if (r1 == 321) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r4 == 204) goto L178;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int KXVWAn(@javax.annotation.Nullable java.lang.Object r9, @javax.annotation.Nullable byte[] r10, int r11) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.DmmOBX.KXVWAn(java.lang.Object, byte[], int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nonnull
    public static byte[] KXVWAn(@Nullable Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) ((byte[]) obj).clone();
        }
        byte[] bArr = new byte[KXVWAn(obj, null, -1)];
        KXVWAn(obj, bArr, 0);
        return bArr;
    }

    private static int QFWwG(Set set, @Nullable byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (bArr != null) {
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                byte[] KXVWAn = KXVWAn(it.next());
                arrayList.add(KXVWAn);
                i9 += KXVWAn.length;
                if (WnL <= 3811) {
                    do {
                        i3 = WnL;
                    } while (i3 + 65 != 24);
                    while (true) {
                        WnL = (WnL + i3) % 126;
                        if ((MND ^ 2239) != 0) {
                            do {
                                i4 = MND;
                            } while (i4 + 208 != 79);
                            MND = (i4 ^ 3873) * 14;
                        }
                    }
                }
            }
            int VSsDxd = VSsDxd(i9, null, -1);
            int i10 = VSsDxd + 1 + i9;
            if (bArr.length >= i10) {
                Collections.sort(arrayList, new dmmOBX());
                int i11 = i + 1;
                bArr[i] = 49;
                VSsDxd(i9, bArr, i11);
                int i12 = i11 + VSsDxd;
                for (byte[] bArr2 : arrayList) {
                    System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
                    i12 += bArr2.length;
                    if (WnL <= 3811) {
                        if ((MND ^ 2239) == 0) {
                            while (true) {
                                int i13 = WnL;
                                if (i13 + 91 == 61) {
                                    WnL = (i13 + i13) * 112;
                                    if ((MND ^ 2239) != 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        while (true) {
                            i2 = MND;
                            int i14 = i2 + 143;
                            if (i14 == 92) {
                                break;
                            }
                            if (i14 != 138) {
                                if (i14 == 180) {
                                    MND = ((MND + i2) % 79) >> 60;
                                    break;
                                }
                            } else {
                                while (true) {
                                    MND = ((MND + i2) % 25) >> 104;
                                }
                            }
                        }
                        while (true) {
                            MND = (MND >> 17) >> 29;
                            MND = ((MND + i2) % 79) >> 60;
                        }
                    }
                }
            }
            return i10;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if ((WnL ^ 3812) != 0) {
                while (true) {
                    int i15 = WnL;
                    int i16 = i15 + 104;
                    if (i16 == 9) {
                        WnL = ((i15 >> 108) + i15) % 70;
                        if ((MND ^ 2239) != 0) {
                            while (true) {
                                i6 = MND;
                                int i17 = i6 + 52;
                                if (i17 == 40) {
                                    break;
                                }
                                if (i17 == 197) {
                                    MND = (MND ^ R2.styleable.AppCompatTheme_textAppearanceSearchResultTitle) + i6;
                                    break;
                                }
                            }
                            while (true) {
                                MND = (MND * 114) ^ 5252;
                                MND = (MND ^ R2.styleable.AppCompatTheme_textAppearanceSearchResultTitle) + i6;
                            }
                        }
                    } else if (i16 == 93) {
                        while (true) {
                            WnL = ((WnL >> 24) + i15) * 112;
                            if (MND <= 2238) {
                                do {
                                    i5 = MND;
                                } while (i5 + 182 != 14);
                                MND = (i5 >> 70) % 71;
                            }
                        }
                    }
                }
            } else {
                i8 += KXVWAn(it2.next(), null, -1);
                if ((MND ^ 2239) != 0) {
                    do {
                        i7 = MND;
                    } while (i7 + 156 != 22);
                    MND = ((i7 >> 126) + i7) % 88;
                }
            }
        }
        int VSsDxd2 = VSsDxd(i8, null, -1);
        if (MND > 2238) {
            return VSsDxd2 + 1 + i8;
        }
        while (true) {
            int i18 = MND;
            int i19 = i18 + 65;
            if (i19 == 20) {
                MND = (i18 + i18) ^ 3197;
                break;
            }
            if (i19 != 158) {
                if (i19 == 244) {
                    break;
                }
            } else {
                while (true) {
                    MND = (MND >> 99) + i18;
                }
            }
        }
        while (true) {
            MND = ((MND >> 70) % 10) % 100;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        MCOFeQ.DmmOBX.WnL = (MCOFeQ.DmmOBX.WnL ^ 5043) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        if (MCOFeQ.DmmOBX.MND > 2238) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        r10 = MCOFeQ.DmmOBX.MND;
        r0 = r10 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
    
        if (r0 == 29) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        MCOFeQ.DmmOBX.MND = (r10 % 43) * 59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0065, code lost:
    
        if (r0 == 61) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007f, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r10 % 79) * 48) + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0069, code lost:
    
        if (r0 == 250) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006d, code lost:
    
        if (r0 == 422) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0070, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND % 4) * 62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0078, code lost:
    
        MCOFeQ.DmmOBX.MND *= 14396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cd, code lost:
    
        if ((r4 ^ 2239) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cf, code lost:
    
        r2 = MCOFeQ.DmmOBX.MND;
        r10 = r2 + 130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d5, code lost:
    
        if (r10 == 24) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d9, code lost:
    
        if (r10 == 114) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00dc, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND ^ 4668) * 83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e5, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND >> 86) >> 79) + r2;
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] RMSXAN(@javax.annotation.Nullable byte[] r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.DmmOBX.RMSXAN(byte[]):byte[]");
    }

    private static int RdrNQH(byte[] bArr, @Nullable byte[] bArr2, int i) {
        if (bArr2 != null) {
            System.arraycopy(bArr, 0, bArr2, i, bArr.length);
        }
        return bArr.length;
    }

    private static int RkXdgE(String str, @Nullable byte[] bArr, int i) {
        return GQFpCJ(12, str.getBytes(StandardCharsets.UTF_8), bArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0127, code lost:
    
        if (r13 == 100) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x012b, code lost:
    
        if (r13 == 254) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0136, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND % 74) * 113) + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013f, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND % 76) >> 89) ^ 2818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x012e, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r12 >> 81) % 93) ^ 3493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x005d, code lost:
    
        r12 = MCOFeQ.DmmOBX.WnL;
        r13 = r12 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (r13 == 43) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00a1, code lost:
    
        if (MCOFeQ.DmmOBX.MND > 2238) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00a3, code lost:
    
        r13 = MCOFeQ.DmmOBX.MND;
        r14 = r13 + com.airbnb.paris.R2.dimen.abc_list_item_height_large_material;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00a7, code lost:
    
        if (r14 == 89) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00ab, code lost:
    
        if (r14 == 153) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00af, code lost:
    
        if (r14 == 193) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00bd, code lost:
    
        MCOFeQ.DmmOBX.MND = (r13 + r13) * 112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00b3, code lost:
    
        if (r14 == 365) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00b6, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r13 % 41) + r13) + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00c3, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r13 + r13) ^ com.airbnb.paris.R2.styleable.AppCompatTheme_textColorAlertDialogListItem) * 82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00ca, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND * 85) >> 123) ^ 4045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00d4, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((r12 % 62) % 4) + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0067, code lost:
    
        if (r13 == 66) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x006b, code lost:
    
        if (r13 == 169) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0076, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((MCOFeQ.DmmOBX.WnL ^ 2863) * 93) >> 102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0084, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x006e, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((MCOFeQ.DmmOBX.WnL + r12) * 3) + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0086, code lost:
    
        r13 = MCOFeQ.DmmOBX.MND;
        r12 = r13 + 247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x008c, code lost:
    
        if (r12 == 54) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0090, code lost:
    
        if (r12 == 115) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0097, code lost:
    
        MCOFeQ.DmmOBX.MND = (r13 ^ 3428) >> 75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0097, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND % 92) + r13) + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0076, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((MCOFeQ.DmmOBX.WnL + r12) * 3) + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01c5, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01c7, code lost:
    
        r3 = MCOFeQ.DmmOBX.MND;
        r9 = r3 + com.airbnb.paris.R2.dimen.abc_text_size_subhead_material;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01cb, code lost:
    
        if (r9 == 25) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r3 = MCOFeQ.DmmOBX.MND;
        r10 = r3 + com.airbnb.paris.R2.dimen.abc_text_size_body_2_material;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01cf, code lost:
    
        if (r9 == 195) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01d3, code lost:
    
        if (r9 == 352) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01d6, code lost:
    
        MCOFeQ.DmmOBX.MND = (r3 >> 125) ^ org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine.KyberQ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01dc, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND ^ com.airbnb.paris.R2.styleable.GradientColor_android_startY) * 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r10 == 56) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01e5, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND * 46) >> 118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01f1, code lost:
    
        if (MCOFeQ.DmmOBX.WnL > 3811) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01f3, code lost:
    
        r3 = MCOFeQ.DmmOBX.WnL;
        r12 = r3 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01f9, code lost:
    
        if (r12 == 57) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x01fb, code lost:
    
        if (r12 == 89) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x01ff, code lost:
    
        if (r12 == 131) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x024f, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((MCOFeQ.DmmOBX.WnL ^ 4224) + r3) ^ 3305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x025c, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) == 0) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x025e, code lost:
    
        r12 = MCOFeQ.DmmOBX.MND;
        r13 = r12 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0262, code lost:
    
        if (r13 == 92) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0266, code lost:
    
        if (r13 == 272) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r10 == 250) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0269, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r12 % 9) >> 111) + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0270, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND + r12) >> 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x024f, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND + r12) >> 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0202, code lost:
    
        MCOFeQ.DmmOBX.WnL = (MCOFeQ.DmmOBX.WnL ^ 2511) % 59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x020b, code lost:
    
        r12 = MCOFeQ.DmmOBX.MND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x020d, code lost:
    
        if (r12 > 2238) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x020f, code lost:
    
        r13 = MCOFeQ.DmmOBX.MND;
        r12 = r13 + com.airbnb.paris.R2.dimen.abc_dialog_min_width_minor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0215, code lost:
    
        if (r12 == 88) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0219, code lost:
    
        if (r12 == 201) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x021d, code lost:
    
        if (r12 == 397) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0221, code lost:
    
        if (r12 == 584) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        MCOFeQ.DmmOBX.MND = (r3 % 30) * 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x023b, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND ^ 2188) + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0224, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND % 93) % 51) >> 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x023d, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND % 113) * 102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x022f, code lost:
    
        MCOFeQ.DmmOBX.MND = (r13 + r13) * 98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0243, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((r3 >> 106) % 89) ^ 2050;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x024c, code lost:
    
        if ((r12 ^ 2239) == 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0278, code lost:
    
        r3 = r14 + 2;
        r4 = MCOFeQ.DmmOBX.MND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x027c, code lost:
    
        if (r4 > 2238) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0284, code lost:
    
        if ((MCOFeQ.DmmOBX.MND + 416) == 81) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0287, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND * 11) ^ 1917;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0290, code lost:
    
        r12 = (r12 + r14) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0294, code lost:
    
        if ((r4 ^ 2239) == 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0296, code lost:
    
        r12 = MCOFeQ.DmmOBX.MND;
        r13 = r12 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x029c, code lost:
    
        if (r13 == 75) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x02a0, code lost:
    
        if (r13 == 179) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r3 + r3) + r3) % 33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x02a4, code lost:
    
        if (r13 == 314) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x02a8, code lost:
    
        if (r13 == 422) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x02ab, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r12 * 4) % 53) >> 124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x02ba, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND ^ 2439) + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x02c1, code lost:
    
        r12 = ((MCOFeQ.DmmOBX.MND % 76) * 52) ^ 5035;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x02c9, code lost:
    
        MCOFeQ.DmmOBX.MND = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02b4, code lost:
    
        r12 = ((r12 % 45) + r12) >> 33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02cc, code lost:
    
        java.lang.System.arraycopy(r13, r3, r13, r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if ((MCOFeQ.DmmOBX.WnL ^ 3812) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        r3 = KXVWAn(r12.next(), r13, r0);
        r1 = r1 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e5, code lost:
    
        if (r13 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        r0 = r0 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        if ((MCOFeQ.DmmOBX.WnL ^ 3812) == 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f2, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f6, code lost:
    
        r3 = MCOFeQ.DmmOBX.WnL;
        r4 = r3 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fc, code lost:
    
        if (r4 == 77) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0173, code lost:
    
        MCOFeQ.DmmOBX.WnL = (r3 % 59) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x017a, code lost:
    
        if (MCOFeQ.DmmOBX.MND > 2238) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017c, code lost:
    
        r12 = MCOFeQ.DmmOBX.MND;
        r13 = r12 + 143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0180, code lost:
    
        if (r13 == 46) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0184, code lost:
    
        if (r13 == 219) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0188, code lost:
    
        if (r13 == 380) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018c, code lost:
    
        if (r13 == 388) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018f, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND + r12) >> 79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a0, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND ^ 4636) * 25) ^ 4375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0197, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND + r12) % 34) ^ 1869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a0, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND ^ 4636) * 25) ^ 4375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01aa, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND % 95) ^ 3925;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (r4 == 257) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0104, code lost:
    
        if (r4 == 357) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0108, code lost:
    
        if (r4 == 399) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
    
        MCOFeQ.DmmOBX.WnL = (MCOFeQ.DmmOBX.WnL >> 5) * 60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0155, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) == 0) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0157, code lost:
    
        r3 = MCOFeQ.DmmOBX.MND;
        r4 = r3 + com.airbnb.paris.R2.color.primary_text_default_material_light;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015b, code lost:
    
        if (r4 == 14) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016b, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r3 ^ 2912) * 62) >> 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015f, code lost:
    
        if (r4 == 152) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0162, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r3 ^ com.airbnb.paris.R2.styleable.SwitchCompat_showText) + r3) * 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x010b, code lost:
    
        MCOFeQ.DmmOBX.WnL = (r3 >> 122) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0110, code lost:
    
        MCOFeQ.DmmOBX.WnL = (MCOFeQ.DmmOBX.WnL % 45) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011b, code lost:
    
        if ((MCOFeQ.DmmOBX.MND ^ 2239) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x011d, code lost:
    
        r12 = MCOFeQ.DmmOBX.MND;
        r13 = r12 + 195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0123, code lost:
    
        if (r13 == 38) goto L237;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int THSAHd(java.util.List r12, @javax.annotation.Nullable byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.DmmOBX.THSAHd(java.util.List, byte[], int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0222, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND ^ 5283) % 106) % 103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022d, code lost:
    
        r5 = MCOFeQ.DmmOBX.WnL;
        r8 = r5 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0235, code lost:
    
        if (r8 == 77) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0237, code lost:
    
        if (r8 == 110) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023b, code lost:
    
        if (r8 == 189) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0249, code lost:
    
        r8 = MCOFeQ.DmmOBX.WnL * 32;
        r10 = MCOFeQ.DmmOBX.MND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x024f, code lost:
    
        if (r10 > 2238) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0264, code lost:
    
        MCOFeQ.DmmOBX.WnL = (r8 >> 110) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026a, code lost:
    
        if ((r10 ^ 2239) == 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x026c, code lost:
    
        r5 = MCOFeQ.DmmOBX.MND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0271, code lost:
    
        if ((r5 + com.airbnb.paris.R2.color.primary_text_default_material_light) == 5) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0274, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND >> 42) + r5) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        r5 = MCOFeQ.DmmOBX.WnL;
        r6 = r5 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0251, code lost:
    
        r11 = MCOFeQ.DmmOBX.MND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0257, code lost:
    
        if ((r11 + 208) == 92) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025a, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND % 47) + r11) * 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        if (r6 == 65) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x023e, code lost:
    
        r8 = (r5 ^ 3848) >> 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0247, code lost:
    
        MCOFeQ.DmmOBX.WnL = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0242, code lost:
    
        r8 = ((r5 * 25) + r5) % 76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r6 == 119) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((r5 >> 40) * 9) % 69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0139, code lost:
    
        r1 = MCOFeQ.DmmOBX.WnL >> 109;
        r2 = MCOFeQ.DmmOBX.MND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0141, code lost:
    
        if ((r2 ^ 2239) == 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0153, code lost:
    
        MCOFeQ.DmmOBX.WnL = (r1 % 48) * 60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x015b, code lost:
    
        if ((r2 ^ 2239) == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0170, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((MCOFeQ.DmmOBX.WnL * 20) ^ 4211) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x015d, code lost:
    
        r1 = MCOFeQ.DmmOBX.MND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0163, code lost:
    
        if ((r1 + com.airbnb.paris.R2.attr.textAppearanceSearchResultTitle) == 93) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0166, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND * 112) + r1) ^ 2438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0147, code lost:
    
        if ((MCOFeQ.DmmOBX.MND + com.airbnb.paris.R2.attr.tint) == 26) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x014a, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND ^ 5179) % 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r6 == 165) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        MCOFeQ.DmmOBX.WnL = (r5 ^ 5000) >> 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (MCOFeQ.DmmOBX.MND > 2238) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0036, code lost:
    
        r0 = ((MCOFeQ.DmmOBX.MND ^ 5301) % 70) % 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (MCOFeQ.DmmOBX.MND > 2238) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        r6 = MCOFeQ.DmmOBX.MND;
        r8 = r6 + com.airbnb.paris.R2.color.background_material_light;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r8 == 73) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r8 == 234) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        MCOFeQ.DmmOBX.MND = (r6 + r6) >> 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND ^ 1801) * 54) >> 113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        MCOFeQ.DmmOBX.WnL = ((r5 + r5) >> 9) % 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006d, code lost:
    
        r5 = MCOFeQ.DmmOBX.MND;
        r6 = r5 + com.airbnb.paris.R2.attr.toolbarStyle;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0071, code lost:
    
        if (r6 == 99) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r5 + r5) % 11) * 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r6 == 290) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0078, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r5 % 56) * 64) ^ 5131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f4, code lost:
    
        if ((r14 ^ 2239) != 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f6, code lost:
    
        r5 = MCOFeQ.DmmOBX.MND;
        r8 = r5 + 143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fa, code lost:
    
        if (r8 == 69) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fe, code lost:
    
        if (r8 == 143) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0202, code lost:
    
        if (r8 == 334) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0206, code lost:
    
        if (r8 == 420) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0210, code lost:
    
        MCOFeQ.DmmOBX.MND = (MCOFeQ.DmmOBX.MND ^ 3459) * 105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0209, code lost:
    
        MCOFeQ.DmmOBX.MND = ((r5 ^ 4328) + r5) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0219, code lost:
    
        MCOFeQ.DmmOBX.MND = ((MCOFeQ.DmmOBX.MND ^ 1909) + r5) % 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if ((r6 ^ 2239) != 0) goto L202;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0078 -> B:23:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int VSsDxd(int r16, @javax.annotation.Nullable byte[] r17, int r18) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.DmmOBX.VSsDxd(int, byte[], int):int");
    }
}
