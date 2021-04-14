package com.ocp.book.selikoff_boyarsky.review.ch1;

public class Question2 {
    private int ISBN;
    private String title, author;
    private int pageCount;

    public int hashCode() {
        return ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Question2)) {
            return false;
        }
        Question2 other = (Question2) obj;
        return this.ISBN == other.ISBN;
    }
}
