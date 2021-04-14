package com.innerclasses;

public class CellPhone {

    private String make;
    private String model;
    private Display display;
    private RadioModule gsm;
    private AbstractPhoneButton button;

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public interface AbstractPhoneButton {
        void click();
    }

    public void initButton() {
        button = new AbstractPhoneButton() { // Анонимный класс
            @Override
            public void click() {
                System.out.println("Button click");
            }
        };
    }

    public void turnOn() {
        initDisplay();
        gsm = new RadioModule();
        initButton();
    }

    private void initDisplay() {
        display = new Display();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }

    public void call(String phoneNumber) {
        button.click();
        gsm.call(phoneNumber);
    }
}
