package com.string;

public class StringBufferVsStringBuilderTestPerformance {

    public static void main(String[] args) {
        int loop = 100000;
        long start = 0;

        // String
        start = System.currentTimeMillis();
        String string = null;
        for (int i = 1; i <= loop; i++) {
            string += i + "test";
        }
        System.out.println("String - " + (System.currentTimeMillis() - start) + " ms");

        // String buffer
        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= loop; i++) {
            stringBuffer.append(i).append("test");
        }

        System.out.println("String Buffer - " + (System.currentTimeMillis() - start) + " ms");

        // String builder
        start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= loop; i++) {
            stringBuilder.append(i).append("test");
        }
        System.out.println("String Builder - " + (System.currentTimeMillis() - start) + " ms");
    }
}
