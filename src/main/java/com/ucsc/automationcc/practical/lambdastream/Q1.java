package com.ucsc.automationcc.practical.lambdastream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tharushi", "Janani", "Lihini", "Piumi");
        names.forEach(System.out::println);
        System.out.println("-------------------");
        Collections.reverse(names);
        names.forEach(System.out::println);
    }
}
