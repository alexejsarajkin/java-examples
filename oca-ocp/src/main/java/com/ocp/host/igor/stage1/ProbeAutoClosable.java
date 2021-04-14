package com.ocp.host.igor.stage1;

public class ProbeAutoClosable {
    static void run() {
        System.out.println("in run");
        throw new RuntimeException("RTE from run");
    }

    public static void main(String[] args) {
        try (
                Probe p1 = new Probe(1);
                Probe p2 = new Probe(2);     // t1
        ) {
            run();
            throw new RuntimeException("RTE from try");
        } catch (RuntimeException rte) {
            int s = rte.getSuppressed().length;
            System.out.println("Number of suppressed com.exceptions: " + s);
            if (s != 0) for (Throwable t : rte.getSuppressed()) System.out.println(t.getMessage());
            System.out.println(rte.getMessage());
        }
    }
}

class Probe implements AutoCloseable {
    int id = 0;

    Probe(int id) {
        this.id = id;
    }

    public void close() {
        System.out.println("closing Probe #" + this.id);
        throw new RuntimeException("RTE from closing Probe #" + this.id);
    }
}
