package org.example;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public class JwtSecretKeyGenerator {

    private static final int KEY_SIZE = 256; // 256-bit key

    public static void main(String[] args) {
        byte[] keyBytes = new byte[KEY_SIZE / 8]; // 256 bits / 8 = 32 bytes
        SecureRandom random = new SecureRandom();
        random.nextBytes(keyBytes);

        SecretKey secretKey = new SecretKeySpec(keyBytes, "BASE64");
        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());

        System.out.println("Generated JWT Secret Key: " + encodedKey);
    }
}

