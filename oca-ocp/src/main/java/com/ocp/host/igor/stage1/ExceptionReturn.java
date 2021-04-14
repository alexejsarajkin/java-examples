package com.ocp.host.igor.stage1;

import java.io.IOException;

public class ExceptionReturn {
    void run() {
        try {
            throw new RuntimeException("RTE");
        } catch (RuntimeException e) {
            throw new IOException("IOE");
        } finally {
            return;
        }
    }

    public static void main(String[] args) {
        new ExceptionReturn().run();
    }

//	it prints nothing, though. And remember: placing return in finally
//	is ALWAYS unadvisable as it will discard unhandled com.exceptions in try
//	and/or catch. Also note that in this particular case removing return
//	renders the code uncompilable.
}
