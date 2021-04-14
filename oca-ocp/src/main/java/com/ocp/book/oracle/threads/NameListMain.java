package com.ocp.book.oracle.threads;

public class NameListMain {
    public static void main(String[] args) {
        final NameList nameList = new NameList();
        nameList.add("Ozymandias");

        class NameDropper extends Thread {
            @Override
            public void run() {
                String name = nameList.removeFirst();
                System.out.println(name);
            }
        }

        Thread thread1 = new NameDropper();
        Thread thread2 = new NameDropper();
        thread1.start();
        thread2.start();
    }
}
