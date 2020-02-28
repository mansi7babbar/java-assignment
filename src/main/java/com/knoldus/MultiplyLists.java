package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.min;

public class MultiplyLists {
    List<Integer> performMultiplication(List<Integer> firstList, List<Integer> secondList) {
        return IntStream.range(0, min(firstList.size(), secondList.size()))
                .map(number -> firstList.get(number) * secondList.get(number))
                .boxed().collect(Collectors.toList());
    }
}
