package org.example.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Person {
    private final String name;
    private final int age;
    private final List<String> hobbies; // Make sure to handle collections properly

    public Person(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        // Create a new list to ensure immutability (if the input list is mutable)
        this.hobbies = new ArrayList<>(hobbies);
    }

    // Provide only getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return an unmodifiable view of the hobbies list to prevent modifications
    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }
}

