package com.ocp.book.oracle.inner_class;

public class InnerClass {
    private String x = "Outer";

    public static void main(String[] args) {
        InnerClass mo = new InnerClass();
        mo.makeInner();

        InnerClass.MyInner mi = mo.new MyInner();
        mi.seeOuter();

        InnerClass.MyInner mi2 = new InnerClass().new MyInner();
        mi2.seeOuter();
    }

    private void makeInner() {
        MyInner mi = new MyInner();
        mi.seeOuter();
    }

    class MyInner {
        private void seeOuter() {
            System.out.println(x);
            System.out.println(this);
            System.out.println(InnerClass.this);
        }
    }
}
