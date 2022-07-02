package com.ironhack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println(productFormatter("Botella de Agua", "18/12/2022"));

    }
    public static String productFormatter(String name, String date) {
        name = name.trim().replace(' ', '_');
        String newString = name + date;
        return (newString.toUpperCase());
        ArrayList<int> numbers = new ArrayList<int>();

        numbers.forEach();
    }
}