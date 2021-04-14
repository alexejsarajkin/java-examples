package com.hash;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Security;

public class FileToHash {

    public static void main(String[] args) {
        try {
            byte[] imageBytes = Files.readAllBytes(Paths.get("README.md"));

            for (String algorithm : Security.getAlgorithms("MessageDigest")) {
                System.out.println("Algorithm: " + algorithm + " Value: " + Main.getHash(imageBytes, algorithm));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
