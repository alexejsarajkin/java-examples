package com.ocp.book.selikoff_boyarsky.review.ch1;

public class Question4 {
    private String city, mascot;
    private int numberOfPlayers;

    public boolean equals(Object obj) {
        if (!(obj instanceof Question4)) return false;
        Question4 other = (Question4) obj;
        return (city.equals(other.city) && mascot.equals(other.mascot));
    }

    public int hashCode() {
        return numberOfPlayers;
    }

}
