package lambdaexpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private int age;
    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void printPerson() {
        System.out.println(name);
    }

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> roster = new ArrayList<>();
        roster.add(new Person(12, "john"));
        roster.add(new Person(23, "Kevin"));
        roster.add(new Person(35, "bob"));
        printPersons(
                roster,
                (Person p) -> p.getAge() <= 25
        );
    }
}
