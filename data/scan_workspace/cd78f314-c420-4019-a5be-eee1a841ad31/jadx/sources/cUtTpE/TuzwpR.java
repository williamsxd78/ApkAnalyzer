package cUtTpE;

import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes13.dex */
public class TuzwpR {
    static int ExRkJb;
    static short rgngMP;

    /* loaded from: classes13.dex */
    private static class tuzwpR extends Exception {
        public tuzwpR(Throwable th) {
            super(th);
        }
    }

    static {
        HbIRuG.k_x = 6646;
        HbIRuG.tvY = 8279;
        rvq(false);
    }

    private static RSAPublicKey ZBYRBr(String str) {
        try {
            return (RSAPublicKey) KeyFactory.getInstance(ExRkJb).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new tuzwpR(e);
        }
    }

    private static byte[] ZQCiYB(byte[] bArr, RSAPublicKey rSAPublicKey) {
        try {
            Cipher cipher = Cipher.getInstance(rgngMP);
            cipher.init(1, rSAPublicKey);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new tuzwpR(e);
        }
    }

    public static /* synthetic */ void rvq(boolean z) {
        if (z) {
            rvq(false);
        }
        ExRkJb = HbIRuG.tTx("Ril");
        rgngMP = HbIRuG.tTx("Ril9gGB.T@E^9WKMXjAb");
    }
}
