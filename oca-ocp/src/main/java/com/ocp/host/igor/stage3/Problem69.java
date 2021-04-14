package com.ocp.host.igor.stage3;

public class Problem69 {
    public static void main(String[] args) {
        Puzzler obj = new Puzzler();
        System.out.println("Left " + obj.tally);
        obj.doStuff(4);
        System.out.println("Middle " + obj.tally);
        obj.doStuff(5);
        System.out.println("Right " + obj.tally);
    }
}

class Puzzler {

    int tally = 0;

    public void doStuff(int val) {
//		if (val % 2 == 0) {
//			break ;
//		} else {
//			for (int i = 0; i < val; i++) {
//				tally += i;
//			}
//		}

        test:
        if (val % 2 == 0) {
            break test;
        } else {
            for (int i = 0; i < val; i++) {
                tally += i;
            }
        }
    }


}