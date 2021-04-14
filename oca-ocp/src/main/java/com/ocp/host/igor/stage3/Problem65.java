package com.ocp.host.igor.stage3;

import java.util.Arrays;

public class Problem65 {
    public static void main(String[] args) {
        String[] strArr = new String[]{"Sitrep", "Over", "Out", "Roger"};

        Arrays.sort(strArr, CommCodes::checkLengthV1);

        Arrays.sort(strArr, (new CommCodes())::checkLengthV2);

        for (String s : strArr) {
            System.out.print(s + " ");
        }
    }
}

class CommCodes {
    public static int checkLengthV1(String str1, String str2) {
        return str2.length() - str1.length();
    }

    public int checkLengthV2(String str1, String str2) {
        return str2.length() - str1.length();
    }
}