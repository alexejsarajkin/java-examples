package com.ocp.host.igor.stage3;

import java.io.IOException;

public class Problem9 {
    public static void main(String[] args) throws Exception {
        try (Mouth f = new Mouth()) {
            f.open();
        }
    }

    static class Mouth implements AutoCloseable {
        public void open() {
            System.out.print("Open ");
        }

        @Override
        public void close() throws IOException {
            System.out.print("Close");
        }
    }
}

