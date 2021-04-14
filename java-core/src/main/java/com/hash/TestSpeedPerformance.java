package com.hash;

import java.security.Security;
import java.util.UUID;

public class TestSpeedPerformance {

    private static final int TIMES = 1_000_000;
    private static final String UUID_STRING = UUID.randomUUID().toString();

    public static void main(String[] args) {
        long start = 0;

        for (String algorithm : Security.getAlgorithms("MessageDigest")) {
            start = System.currentTimeMillis();

            for (int i = 0; i < TIMES; i++) {
                Main.getHash(UUID_STRING.getBytes(), algorithm);
            }

            System.out.println("Algorithm: " + algorithm + " Value: " + Main.getHash(UUID_STRING.getBytes(), algorithm));
            System.out.println("Algorithm: " + algorithm + " calculate time " + (System.currentTimeMillis() - start) + " ms");
        }
    }
}

// Hash sizes
// MD5 produces 32 chars hash – 5f3a47d4c0f703c5d83265c3669f95e6
// SHA-1 produces 40 chars hash – 2c5a70165585bd4409aedeea289628fa6074e17e
// SHA-256 produces 64 chars hash – b6ba4d0a53ddc447b25cb32b154c47f33770d479869be794ccc94dffa1698cd0
// SHA-512 produces 128 chars hash – 54cdb8ee95fa7264b7eca84766ecccde7fd9e3e00c8b8bf518e9fcff52ad061ad28cae49ec3a09144ee8f342666462743718b5a73215bee373ed6f3120d30351