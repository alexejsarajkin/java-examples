package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem43 {
    public static void main(String[] args) {
        List<Band> bands = Arrays.asList(
                new Band("Yes", "Prog Rock", "UK"),
                new Band("Boney M", "Euro Disco", "Germany"),
                new Band("ELP", "Prog Rock", "UK"));

        bands.stream()
                .collect(Collectors.groupingBy(Band::getStyle))
                .forEach((x, y) -> System.out.println(y));

//		bands.stream()
//				.collect(Collectors.groupingBy(Band::getStyle))
//				.forEach( (String x, List<Band> y) -> System.out.println(x) );

//
//		bands.stream()
//				.collect(Collectors.groupingBy(
//						Band::getStyle,
//						HashMap<String, List<Band>>::new,
//						Collectors.toList()
//				))
//				.forEach((x, y) -> System.out.println(x));

//
//		bands.stream()
//				.collect(Collectors.groupingBy(
//						Band::getStyle,
//						() -> new TreeMap<String, List<Band>>(
//								Comparator.<String>reverseOrder()),
//						Collectors.toList()
//				))
//				.forEach( (String x, List<Band>y) -> System.out.println(x) );  // Prog Rock  \n  Euro Disco
    }
}


class Band {
    String name, style, country;

    public Band(String name, String style, String country) {
        this.style = style;
        this.name = name;
        this.country = country;
    }

    public String getStyle() {
        return style;
    }

    public String toString() {
        return style + " : " + name + " : " + country;
    }
}
