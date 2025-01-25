package com.ucsc.automationcc.practical.lambdastream;

import java.util.Arrays;
import java.util.List;

public class Q2 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,57, 83, 98, 2,8, 83, 994);
        List<Integer> eventNumbers = integerList.stream().filter(integer -> integer%2==0).toList();
        eventNumbers.forEach(System.out::println);
    }
}
