package finserv.dayfour.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", "Smith"),
            new Person("Jane", "Doe"),
            new Person("Bob", "Johnson")
        );

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        for (Person p : people) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }
    }
}
