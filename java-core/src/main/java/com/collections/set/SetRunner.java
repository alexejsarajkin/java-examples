package com.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

    public static void main(String[] args) {

//        String[] cars = {"Mini", "Mercedes - Benz", "Audi", "VW", "Smart", "Toyota", "Porsche"};
//        String[] otherCars = {"Audi", "Ford", "GMC", "Toyota", "Chevrolet"};
//
//        Set<String> carSet = new HashSet<>(Arrays.asList(cars));
//
//        Set<String> otherCarSet = new HashSet<>(Arrays.asList(otherCars));
//
//        Set<String> uniqueCars = new HashSet<>(carSet);
//        uniqueCars.addAll(otherCarSet); // Добавляет только уникальные елементы
//
//        print(uniqueCars);

        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("VW", "Golf", 45));
        sixCars.add(new Car("Audi", "A3", 60));
        sixCars.add(new Car("VW", "Polo", 25));
        sixCars.add(new Car("BMW", "Z4", 120));
        sixCars.add(new Car("BMW", "440i", 200));

        Set<Car> europaCars = new HashSet<>();
        europaCars.add(new Car("Toyota", "Auris", 40));
        europaCars.add(new Car("Reno", "Clio", 30));
        europaCars.add(new Car("Reno", "Megan", 50));
        europaCars.add(new Car("VW", "Golf", 45));
        europaCars.add(new Car("VW", "Polo", 35));

//      UNION - объеденение 2-х массивов
//        Set<Car> uniqueCars = new HashSet<>(sixCars);
//        uniqueCars.addAll(europaCars);
//
//        print(uniqueCars);

//        sixCars.removeAll(europaCars);
//        europaCars.removeAll(sixCars);

//        Intersection - Найти одинаковые
//        sixCars.retainAll(europaCars);
//        europaCars.retainAll(sixCars);

//        ExclusiveOR  - удалить одинаковое из 2-х сетов
//        sixCars.retainAll(europaCars);
//        uniqueCars.removeAll(sixCars);

//        System.out.println("-----------------------------");

//        print(sixCars);


        Set<Car> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(europaCars);

        print(uniqueCars);


    }

    private static void print(Set<Car> cars) {
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per day");
        for (Car car : cars) {
            System.out.printf("%-20s %-20s %-20s \n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
    }
}
