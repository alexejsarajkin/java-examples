package com.ocp.book.selikoff_boyarsky.review.ch9;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

public class Question12 {
    public static void main(String[] args) throws URISyntaxException {
//		new Path("jaguar.txt");
        FileSystems.getDefault().getPath("puma.txt");
        Paths.get(new URI("cheetah.txt"));
        Paths.get("cats", "lynx.txt");
        new java.io.File("tiger.txt").toPath();
//		new FileSystem().getPath("leopard");
        Paths.get("ocelot.txt");
    }
}
