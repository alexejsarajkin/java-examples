package com.interfaces;

public interface Priceable extends Deliverable, Orderable {

    default int calPrice() {
        return calcOrderPrice() + calcDeliveryPrice();
    }

    static void doSmth() {
        System.out.println("doSmth");
    }

}
