package com.tom_roush.pdfbox.util;

import com.tom_roush.pdfbox.io.IOUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class Version {
    private static final String PDFBOX_VERSION_PROPERTIES = "/com/tom_roush/pdfbox/resources/version.properties";

    private Version() {
    }

    public static String getVersion() {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(Version.class.getResourceAsStream(PDFBOX_VERSION_PROPERTIES));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                String property = properties.getProperty("pdfbox.version", null);
                IOUtils.closeQuietly(bufferedInputStream);
                return property;
            } catch (IOException unused) {
                IOUtils.closeQuietly(bufferedInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(bufferedInputStream);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedInputStream = null;
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
        }
    }
}
