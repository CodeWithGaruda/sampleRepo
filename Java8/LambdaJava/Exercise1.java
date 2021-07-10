package Java8.LambdaJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("sanath", "rayala", 23), new Person("subhash", "rayala", 23),
                new Person("srikanth", "rayala", 23), new Person("aparna", "rayala", 23),
                new Person("rahul", "burrburr", 23), new Person("bharadwaj", "purpur", 23));
        // sort this list according to last names
        Collections.sort(persons, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));
        // create a method that prints all the elements
        printNameThatBeginWithC(persons, p -> true);
        // create method that prints all people that have first name beginning with s
        printNameThatBeginWithC(persons, p -> p.getFirstname().startsWith("s"));
    }

    public static void printAll(List persons) {
        System.out.println("--------------------------------------");
        for (Object object : persons) {
            System.out.println(object);
        }
    }

    public static void printNameThatBeginWithC(List<Person> persons, Condition c) {
        System.out.println("--------------------------------------");
        for (Object object : persons) {
            if (c.test((Person) object))
                System.out.println(object);
        }
    }
}
