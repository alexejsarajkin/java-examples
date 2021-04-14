package com.ocp.host.igor.stage3;

import java.util.function.Supplier;

public class Problem42 {
    public static void main(String[] args) {
        surf(() -> new Browser());
        surf(Tor::new);
    }

    static void surf(Supplier<Browser> browser) {
        browser.get().surf();
    }
}

class Browser {
    public void surf() {
        System.out.print("See me surf!");
    }
}

class Tor extends Browser {
    public void surf() {
        System.out.print("Stealth mode engaged.");
    }
}