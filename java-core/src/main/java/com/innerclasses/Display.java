package com.innerclasses;

public class Display {

    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIDTH = 1280;
    private int x;

    public Display() {
        Pixel pixel = new Pixel(10, 10, Color.BLUE);
    }

    //    public class Pixel {  Можно и так
//    public static class Pixel { Можно и так
    private class Pixel {
        private int x;
        private int y;
        private Color color;

        private Pixel(int x, int y, Color color) {
            if (0 <= x && x <= DISPLAY_WIDTH && 0 <= y && y <= DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println(toString());
            } else {
                throw new IllegalArgumentException("Wrong pixels");
            }
        }

        @Override
        public String toString() {
            return "Pixel{" +
                    "x=" + x +
                    ", y=" + y +
                    ", color=" + color +
                    '}';
        }

    }

    public enum Color {
        RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW, BLACK
    }

}
