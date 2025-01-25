package com.ucsc.automationcc.practical.lambdastream;

import java.util.Arrays;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tharushi", "Janani", "Lihini", "Piumi");
        System.out.println(String.join("-", names));
    }
}
