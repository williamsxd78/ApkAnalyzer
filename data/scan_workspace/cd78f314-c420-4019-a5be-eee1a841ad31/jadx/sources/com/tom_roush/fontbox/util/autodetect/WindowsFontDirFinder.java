package com.tom_roush.fontbox.util.autodetect;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.tom_roush.fontbox.util.Charsets;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class WindowsFontDirFinder implements FontDirFinder {
    private String getWinDir(String str) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((str.startsWith("Windows 9") ? runtime.exec("command.com /c echo %windir%") : runtime.exec("cmd.exe /c echo %windir%")).getInputStream(), Charsets.ISO_8859_1));
        String readLine = bufferedReader.readLine();
        bufferedReader.close();
        return readLine;
    }

    @Override // com.tom_roush.fontbox.util.autodetect.FontDirFinder
    public List<File> find() {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            str = System.getProperty("env.windir");
        } catch (SecurityException unused) {
            str = null;
        }
        String property = System.getProperty("os.name");
        if (str == null) {
            try {
                str = getWinDir(property);
            } catch (IOException | SecurityException unused2) {
            }
        }
        if (str == null || str.length() <= 2) {
            String str2 = property.endsWith("NT") ? "WINNT" : "WINDOWS";
            for (char c = 'C'; c <= 'E'; c = (char) (c + 1)) {
                File file = new File(c + ":" + File.separator + str2 + File.separator + "FONTS");
                try {
                    if (file.exists() && file.canRead()) {
                        arrayList.add(file);
                        break;
                    }
                } catch (SecurityException unused3) {
                }
            }
            for (char c2 = 'C'; c2 <= 'E'; c2 = (char) (c2 + 1)) {
                File file2 = new File(c2 + ":" + File.separator + "PSFONTS");
                try {
                    if (file2.exists() && file2.canRead()) {
                        arrayList.add(file2);
                    }
                } catch (SecurityException unused4) {
                }
            }
        } else {
            if (str.endsWith(DomExceptionUtils.SEPARATOR)) {
                str = str.substring(0, str.length() - 1);
            }
            File file3 = new File(str + File.separator + "FONTS");
            if (file3.exists() && file3.canRead()) {
                arrayList.add(file3);
            }
            File file4 = new File(str.substring(0, 2) + File.separator + "PSFONTS");
            if (file4.exists() && file4.canRead()) {
                arrayList.add(file4);
            }
        }
        try {
            String str3 = System.getenv("LOCALAPPDATA");
            if (str3 != null && !str3.isEmpty()) {
                File file5 = new File(str3 + File.separator + "Microsoft" + File.separator + "Windows" + File.separator + "Fonts");
                if (file5.exists() && file5.canRead()) {
                    arrayList.add(file5);
                }
            }
        } catch (SecurityException unused5) {
        }
        return arrayList;
    }
}
