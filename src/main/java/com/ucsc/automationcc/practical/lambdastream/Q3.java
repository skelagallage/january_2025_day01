package com.ucsc.automationcc.practical.lambdastream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tharushi", "Janani", "Lihini", "Piumi");
        List<String> uppercaseNames = names.stream().map(String::toUpperCase).toList();
        uppercaseNames.forEach(System.out::println);
    }
}
