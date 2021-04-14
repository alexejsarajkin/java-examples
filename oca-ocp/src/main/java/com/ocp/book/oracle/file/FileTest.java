package com.ocp.book.oracle.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FileTest {
    public static void main(String[] args) throws IOException {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(1970, 1, 1, 10, 0, 0, 0, ZoneId.of("US/Pacific"));

        File file = new File("file");
        file.createNewFile();
        file.setLastModified(zonedDateTime.toInstant().getEpochSecond() * 1000);
        System.out.println(ZonedDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.of("US/Pacific")));
        file.delete();

        Path path = Paths.get("file2");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(zonedDateTime.toInstant());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        Files.delete(path);
    }
}
