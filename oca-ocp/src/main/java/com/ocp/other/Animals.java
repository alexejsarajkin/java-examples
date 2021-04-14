package com.ocp.other;

import java.io.Closeable;
import java.io.IOException;

public class Animals {
    class Lamb implements Closeable {
        @Override
        public void close() throws IOException {
            throw new RuntimeException("a");
        }
    }

    public static void main(String[] args) {
        new Animals().run();
    }

    private void run() {
        try (Lamb lamb = new Lamb()) {
            throw new IOException();
        } catch (Exception e) {
            throw new RuntimeException("c");
        }
    }
}
