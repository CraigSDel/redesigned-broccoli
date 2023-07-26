package org.example.enums;

import java.util.ArrayList;

public class Example {

    public static void main(String[] args) {
        ArrayList<Toppings> toppings = new ArrayList<>();
        toppings.add(Toppings.CHEESE);
        toppings.add(Toppings.LETTUCE);
        toppings.add(Toppings.PINEAPPLE);
        toppings.add(Toppings.TOMATO);

        Burger burger = new Burger();
        burger.setBun(Bun.SESAME_SEED);
        burger.setToppingsList(toppings);

        System.out.println(burger);
    }
}
