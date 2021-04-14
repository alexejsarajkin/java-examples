package com.ocp.other;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Resource {
    public static void main(String[] args) {
//		workWithSystemProperties();
//		createOwnProperty();
//		copyOwnProperty();
//		readProperty("myProps1.props");
        readProperty("myTest.props");
    }

    private static void workWithSystemProperties() {
        Properties p = System.getProperties();
        p.setProperty("myProp", "myValue");
        p.list(System.out);
    }

    private static void createOwnProperty() {
        Properties p = new Properties();
        p.setProperty("k1", "v1");
        p.setProperty("k2", "v2");
        p.list(System.out);
        try (FileOutputStream out = new FileOutputStream("myProps1.props");) {
            p.store(out, "test_comment");
        } catch (IOException e) {
            System.out.println("exc 1");
        }
    }

    private static void copyOwnProperty() {
        Properties p = new Properties();
        try (FileInputStream in = new FileInputStream("myProps1.props");
             FileOutputStream out = new FileOutputStream("myProps2.props")) {
            p.load(in);
            p.list(System.out);
            p.setProperty("k3", "v3");
            p.list(System.out);
            p.store(out, "myUpdate");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readProperty(String fileName) {
        Properties p = new Properties();
        try (FileInputStream in = new FileInputStream(fileName)) {
            p.load(in);
            p.list(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
