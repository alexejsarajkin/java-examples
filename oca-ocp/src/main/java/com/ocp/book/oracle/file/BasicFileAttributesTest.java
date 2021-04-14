package com.ocp.book.oracle.file;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("myProps1.props");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(basicFileAttributes.creationTime());
        System.out.println(basicFileAttributes.lastAccessTime());
        System.out.println(basicFileAttributes.lastModifiedTime());
        System.out.println(basicFileAttributes.isDirectory());


    }
}
