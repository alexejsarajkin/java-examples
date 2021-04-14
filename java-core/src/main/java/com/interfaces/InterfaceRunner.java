package com.interfaces;

public class InterfaceRunner {

    public static void main(String[] args) {

//        Deliverable[] deliverables = new Deliverable[];

        Priceable pizza = new Pizza("Neapolitana", 1, 20, Size.L);
        Priceable phone = new CellPhone("Motorola", "XT1575", 1, 250);
        Priceable fridge = new Fridge("LG", "E9090", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Priceable pricable) {
        System.out.println("Delivery prise " + pricable.calcDeliveryPrice());
        System.out.println("Order prise " + pricable.calcOrderPrice());
    }
}
