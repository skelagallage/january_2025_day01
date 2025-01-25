package com.ucsc.automationcc.practical.lambdastream;

import java.util.Arrays;
import java.util.List;

public class Q7 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,3, 8, 9, 2);
        List<Integer> squrs = integerList.stream().map(integer -> (int)Math.pow(integer, 2)).toList();
        squrs.forEach(System.out::println);
    }
}
