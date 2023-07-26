package org.example.immutable;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> hobbies = Arrays.asList("Reading", "Cooking", "Traveling");
        Person person = new Person("Alice", 30, hobbies);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Hobbies: " + person.getHobbies());

        // Attempt to modify the object (should not be possible)
        // person.setName("Bob"); // Error: setName method is not available

        // Attempt to modify the hobbies list (should not be possible)
        // person.getHobbies().add("Gardening"); // Error: UnsupportedOperationException
    }
}
