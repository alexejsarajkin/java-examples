package com.ocp.host.igor.stage3;

public class Problem55 {
    AccessKey grantAccess(String user, String pass) {
        return new AccessKey();
    }

    public static void main(String[] args) {
        Problem55 dba = new Problem55();
        AccessKey key = dba.grantAccess("Bill", "1234");
    }
}


class AccessKey {
    String user;
    String pass;
}
