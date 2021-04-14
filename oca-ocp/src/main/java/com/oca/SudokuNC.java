package com.oca;

public class SudokuNC {
    static int[][] game;

    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
//    game[3][3] = "X";
        System.out.println(game[3][3]);
    }
}
