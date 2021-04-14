package com.ocp.book.selikoff_boyarsky.review.ch2;

public class Question2 {
}

interface CanClimb {
    public abstract void climb();
}

interface CanClimbTrees extends CanClimb {
}

abstract class Chipmunk implements CanClimbTrees {
    public abstract void chew();
}

class EasternChipmunk extends Chipmunk {
    public void chew() {
        System.out.println("Eastern Chipmunk is Chewing");
    }

    @Override
    public void climb() {

    }
}
