package com.ocp.book.oracle.file;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorTest extends SimpleFileVisitor<Path> {
    public static void main(String[] args) throws IOException {
        FileVisitorTest fileVisitorTest = new FileVisitorTest();
        Files.walkFileTree(Paths.get("/"), fileVisitorTest);
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println(dir);
        return super.preVisitDirectory(dir, attrs);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file);
        return super.visitFile(file, attrs);
    }
}
