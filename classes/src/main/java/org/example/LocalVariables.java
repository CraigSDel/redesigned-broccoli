package org.example;

import java.util.ArrayList;
import java.util.List;

public class LocalVariables {

    public static void main(String... args) {
        List<String> names = new ArrayList<>();  // Inferred as ArrayList<String>
        var age = 25; // Inferred as int

        System.out.println("List<String> names = new ArrayList<>();     Type -> " + names.getClass());
        System.out.println("var age = 25;   Type -> " + ((Object) age).getClass());
    }
}
