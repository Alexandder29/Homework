package Coding2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Programmer ion = new Programmer("Java", "Ion", "Popescu",
                LocalDateTime.parse("1980-04-20T10:14:14"),
                "Brasov, str. Zambilelor, nr. 20", "Advanced Java programmer",
                LocalDateTime.of(2022, 4, 19, 10, 15, 12));
        System.out.println(ion.getLanguage());
        System.out.println(ion.getPosition());

        Employee george = new Employee("George", "Hora", LocalDateTime.parse("2000-07-20T14:18:50"),
                "Timisoara, str. Rozelor, nr. 2", "Java beginner",
                LocalDateTime.of(2022, 5, 2, 14, 10, 0));
        System.out.println(george.getAddress());

        DatabaseAdmin alex = new DatabaseAdmin("IT", "Alex", "Solomun", LocalDateTime.parse("1995-03-09T10:00:16"),
                "Satu Mare, aleea Prahovei, nr. 42", "Database beginner", LocalDateTime.of(2020, 5, 20, 12, 0, 0));

        System.out.println("===== Programmer =====");
        System.out.println(getFullName(ion) + " is " + getAge(ion) + " years old and he is " + ion.position);

        System.out.println("===== Employee =====");
        System.out.println(getFullName(george) + " is " + getAge(george) + " years old and he is " + george.position);

        System.out.println("===== DatabaseAdmin =====");
        System.out.println(getFullName(alex) + " is " + getAge(alex) + " years old and he is " + alex.position);
    }

    private static String getFullName(Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }

    private static int getAge(Person person) {
        LocalDateTime birthDate = person.getBirthday();
        LocalDateTime currentDate = LocalDateTime.now();
        return currentDate.getYear() - birthDate.getYear();
    }
}