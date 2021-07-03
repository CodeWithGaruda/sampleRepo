package Java8.LambdaJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise1SolutionInLambda {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("sanath", "rayala", 23), new Person("subhash", "rayala", 23),
                new Person("srikanth", "rayala", 23), new Person("aparna", "rayala", 23),
                new Person("rahul", "burrburr", 23), new Person("bharadwaj", "purpur", 23));
        Collections.sort(persons, (p1, p2) -> p1.getFirstname().compareTo(p2.getFirstname()));

    }
}