package com.ucsc.automationcc.practical.lambdastream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q6 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tharushi", "Janani", "Lihini", "Piumi");
        List<String> jNames = names.stream().filter(name -> name.startsWith("J")).toList();
        jNames.forEach(System.out::println);
    }
}
