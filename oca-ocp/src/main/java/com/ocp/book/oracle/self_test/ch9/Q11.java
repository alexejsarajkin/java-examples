package com.ocp.book.oracle.self_test.ch9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Q11 {
    String location;
    Double temp;

    public static void main(String[] args) {
        List<Q11> julyAvg = new ArrayList<>();
        julyAvg.add(new Q11("Location 1", 12.3));
        julyAvg.add(new Q11("Location 2", 45.6));

        Comparator<Q11> comparator = ((t1, t2) -> t1.getTemp().compareTo(t2.getTemp()));
        Optional<Q11> max = julyAvg.stream().max(comparator);
    }

    public Q11(String location, Double temp) {
        this.location = location;
        this.temp = temp;
    }

    public String getLocation() {
        return location;
    }

    public Double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "Q11{" +
                "location='" + location + '\'' +
                ", temp=" + temp +
                '}';
    }
}

