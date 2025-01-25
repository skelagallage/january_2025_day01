package com.ucsc.automationcc.practical.lambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q8 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,57, 83, 98, 2,8, 83, 994);
        Optional<Integer> max = integerList.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
