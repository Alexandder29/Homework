package Coding2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Programmer person = new Programmer("Java", "Ion", "Popescu",
                LocalDateTime.parse("1943-04-20T10:14:14"),
                "Brasov, str. Zambilelor, nr. 20", "Advanced",
                LocalDateTime.of(2022, 4, 19, 10, 15, 12));
        System.out.println(person.getLanguage());
        System.out.println(person.getPosition());
        System.out.println(person.getFirstName());

        Employee george = new DatabaseAdmin("Tehnology", "George", "Hora",
                LocalDateTime.parse("1950-07-20T14:18:50"),
                "Timisoara, str. Rozelor, nr. 2", "Beginner",
                LocalDateTime.of(2022, 5, 2, 14, 10, 0));
        System.out.println(george.getAddress());

        //In progress >>>> Create an object that will receive any person (from ex 2) and will have methods to return person related data:
        // - fullName
        // - age ( you need to calculate the number of years between two LocalDateTime variables

    }
}