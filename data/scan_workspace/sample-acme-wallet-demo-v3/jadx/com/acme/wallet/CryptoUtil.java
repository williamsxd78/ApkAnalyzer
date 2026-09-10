package com.acme.wallet;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;

public class CryptoUtil {

    private static final byte[] IV = new byte[16];
    private static final String KEY = "hardcoded_aes_key_1234567890abcd";

    public byte[] weakHash(String data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        return md.digest(data.getBytes());
    }

    public byte[] legacyHash(String data) throws Exception {
        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        return sha.digest(data.getBytes());
    }

    public byte[] encrypt(byte[] plain) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKeySpec spec = new SecretKeySpec(KEY.getBytes(), "AES");
        IvParameterSpec iv = new IvParameterSpec(IV);
        cipher.init(Cipher.ENCRYPT_MODE, spec, iv);
        return cipher.doFinal(plain);
    }

    public byte[] legacyEncrypt(byte[] plain) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        return cipher.doFinal(plain);
    }
}
