package com.ocp.book.oracle.inner_class;

public class LocalClass {
    private String x = "Outer";

    public static void main(String[] args) {
        LocalClass mo = new LocalClass();
        mo.doStuff();
    }

    private void doStuff() {
        String z = "Local variable";
        class MyInner {
            private void seeOuter() {
//				z = ""; Won't compile

                System.out.println(x);
                System.out.println(z);
                System.out.println(this);
                System.out.println(LocalClass.this);
            }
        }
        x = "Changing outer";

        MyInner mi = new MyInner();
        mi.seeOuter();
    }
}
