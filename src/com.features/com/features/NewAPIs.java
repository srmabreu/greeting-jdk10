package com.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NewAPIs {

    public static void main(String[] args) {
        // copyOf()
        List<String> actors = new ArrayList<>();
        actors.add("Jack Nicholson");
        actors.add("Marlon Brando");
        System.out.println(actors);

        List<String> copyOfActors = List.copyOf(actors);
        System.out.println(copyOfActors);

        // Will generate an UnsupportedOperationException
        // copyOfActors.add("Robert De Niro");

        actors.add("Robert De Niro");
        System.out.println(actors);
        System.out.println(copyOfActors);

        // orElseThrow()
        String str = "";
        Optional<String> name = Optional.ofNullable(str);
        // New API added - is preferred option then get() method
        name.orElseThrow(); // same as name.get()

        // New API added - Collectors.toUnmodifiableList
        List<String> collect = actors.stream().collect(Collectors.toUnmodifiableList());
        // Will generate an UnsupportedOperationException
        // collect.add("Tom Hanks");
    }

}
