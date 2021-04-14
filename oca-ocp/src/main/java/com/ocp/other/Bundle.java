package com.ocp.other;

import java.util.ListResourceBundle;

public class Bundle extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"123", 123}};
    }
}
