package com.ocp.host.igor.stage3;

import java.util.Optional;

public class Problem46 {
    public static void main(String[] args) {
        Email email = null;
        Optional<Email> contact = Optional.ofNullable(email);
        Customer cust = new Customer(contact);
        String eEmail = (contact.isPresent()) ? contact.get().getEmail() : "N/A";
        System.out.println(eEmail);
    }
}


class Customer {
    Optional<Email> contact;

    Customer(Optional<Email> contact) {
        this.contact = contact;
    }

    public Optional<Email> getContact() {
        return contact;
    }
}

class Email {
    String email = "joe.random@planet.earth";

    public String getEmail() {
        return email;
    }

    public String toString() {
        return email;
    }
}
