package com.ocp.examtopics;

import java.io.IOException;


class Folder implements AutoCloseable {
    public void close() throws IOException {
        System.out.print("Close");
    }

    public void open() {
        System.out.print("Open");
    }
}

public class Question28 {
    public static void main(String[] args) throws Exception {
        try (Folder f = new Folder()) {
            f.open();
        }
    }
}
