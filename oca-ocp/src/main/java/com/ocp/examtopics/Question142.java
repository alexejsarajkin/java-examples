package com.ocp.examtopics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question142 {
    public static void main(String[] args) {
        List<Block> blockList = new ArrayList<>();
        blockList.add(new Block("Green", 10));
        blockList.add(new Block("Red", 7));
        blockList.add(new Block("Blue", 12));
        Collections.sort(blockList, new ColorSorted());
        System.out.println(blockList);

    }
}

class Block {
    String color;
    int size;

    public Block(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return color;
    }
}

class ColorSorted implements Comparator<Block> {
    public int compare(Block o1, Block o2) {
        return o1.color.compareTo(o2.color);
    }
}
