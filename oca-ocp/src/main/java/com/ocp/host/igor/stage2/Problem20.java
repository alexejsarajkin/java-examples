package com.ocp.host.igor.stage2;

public class Problem20 {
    public static void main(String[] args) {
        String str = "Powers of 2";
        int a = 8, b = 256;
        StringBuilder sb = new StringBuilder(str);

        sb.append(a);           // n1
        sb.append(b);           // n2
        sb.append(a > b);       // n3
        sb.append(a < b);       // n4
        sb.insert(a, "" + a);   // n5
        sb.insert(b, "" + b);   // n6
    }
}
