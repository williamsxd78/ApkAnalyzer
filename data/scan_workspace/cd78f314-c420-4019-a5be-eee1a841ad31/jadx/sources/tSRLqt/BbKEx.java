package tSRLqt;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.media3.common.C;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class BbKEx {
    private static final String WYbZcq = "CYFSigUtils";
    static String klNIl;

    static {
        WCA(false);
    }

    public static /* synthetic */ void WCA(boolean z) {
        if (z) {
            WCA(false);
        }
        klNIl = WnFOdL.rva("rUY");
    }

    private static String WPSHnB(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static List<String> getApplicationSignature(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
            int i = 0;
            if (signingInfo.hasMultipleSigners()) {
                Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                int length = apkContentsSigners.length;
                while (i < length) {
                    arrayList.add(getSignatureHash(apkContentsSigners[i]));
                    i++;
                }
            } else {
                Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                int length2 = signingCertificateHistory.length;
                while (i < length2) {
                    arrayList.add(getSignatureHash(signingCertificateHistory[i]));
                    i++;
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return new ArrayList();
        }
    }

    public static String getSignatureHash(Signature signature) {
        MessageDigest messageDigest = MessageDigest.getInstance(klNIl);
        messageDigest.update(signature.toByteArray());
        return WPSHnB(messageDigest.digest());
    }
}
