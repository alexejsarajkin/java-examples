package com.ocp.host.igor.stage1;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    /* 1ST APPROACH
     * Will create multiple instances if several threads access this method at the same time
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /* 2ND APPROACH
     * Thread-safe and creates only one instance of Singleton even in a concurrent environment
     * but can be too expensive due to cost of synchronization at every call
     */
    synchronized public static Singleton getInstanceThreadSafe() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /* 3RD APPROACH
     * Also known as Double Checked Locking.
     * Minimizes cost of synchronization and improves performance by locking only critical section of code
     * (that is, where instance of Singleton class gets created).
     */
    public static Singleton getInstanceDoubleCheckedLocking() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
