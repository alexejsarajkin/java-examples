package com.ocp.other;

import java.io.IOException;

class Bad implements AutoCloseable {
    String name;

    Bad(String name) {
        this.name = name;
    }

    @Override
    public void close() throws IOException {
        throw new IOException("Closing - " + name);
    }
}

public class TryWithResourcesSuppressed {
    public static void main(String[] args) {
        try (Bad b1 = new Bad("1");
             Bad b2 = new Bad("2")) {

        } catch (Exception e) {
            System.err.println(e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.err.println("suppressed: " + t);

            }
        }
    }
}
