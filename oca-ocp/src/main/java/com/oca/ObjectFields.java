package com.oca;

public class ObjectFields {
    int iVar;
    static int cVar;

    void setFields() {
        this.iVar = 22;
        this.cVar = 22;
    }

    public static void main(String[] args) {
        ObjectFields of = new ObjectFields();
        of.iVar = 100;
        ObjectFields.cVar = 200;
//    iVar = 200;
//    cVar = 300;
//    this.iVar = 200;
//    this.cVar = 400;
        of.iVar = 100;
        of.cVar += 200;
        ObjectFields.cVar += 300;
        of.setFields();
        System.out.println("iVar=" + of.iVar + ", cVar=" + of.cVar);
    }
}
