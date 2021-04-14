package com.ocp.examtopics;

import java.util.Optional;

public class Question44 {
    public static void main(String[] args) {
        Address address = null;
        Optional<Address> addrs1 = Optional.ofNullable(address);
        Employee44 e1 = new Employee44(addrs1);
        String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
        System.out.println(eAddress);
    }
}

class Employee44 {
    Optional<Address> address;

    Employee44(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}

class Address {
    String city = "New York";

    public String getCity() {
        return city;
    }

    public String toString() {
        return city;
    }
}
