package com.ocp.host.igor.stage2;

public class Problem14 {
    public static void main(String[] args) {
//		System.out.println(new BlueChipStock() instanceof Object);
        System.out.println(new IBM() instanceof BlueChipStock);
//		System.out.println(new ExxonMobil() instanceof Option);
//		System.out.println(new Option() instanceof Object);
        System.out.println(new Put() instanceof Option);
//		System.out.println(new Call() instanceof BlueChipStock);
    }
}

abstract class BlueChipStock {
}

class IBM extends BlueChipStock {
}

class ExxonMobil extends BlueChipStock {
}

abstract class Option {
}

class Put extends Option {
}

class Call extends Option {
}
