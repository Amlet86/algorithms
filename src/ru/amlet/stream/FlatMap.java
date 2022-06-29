package ru.amlet.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class FlatMap {

    public static void main(String[] args) {
        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));

        System.out.println(flatMap(humans));
    }

    public static String flatMap(List<Human> humans) {
        return humans.stream()
//                .flatMap(human -> human.getPets().stream())
                .map(human -> human.getPets())
                .flatMap(pets -> pets.stream())
                .collect(Collectors.joining(", "));
    }

}
