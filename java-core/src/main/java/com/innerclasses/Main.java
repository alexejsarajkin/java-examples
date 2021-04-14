package com.innerclasses;

public class Main {

    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Motorola", "XT1575");
        phone.turnOn();
        phone.call("1234567890");


//        Display display = phone.getDisplay();
//        Display.Pixel pixel = display.new Pixel(10234230, 100, Display.Color.RED); // Инициализация объект внутреннего не статического класса
//        Display.Pixel pixel = new Display.Pixel(123,321, Display.Color.BLACK); // Инициализация объект внутреннего статического класса
    }
}
