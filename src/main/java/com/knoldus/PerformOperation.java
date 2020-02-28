package com.knoldus;

import java.util.stream.Stream;

@FunctionalInterface
interface Operation {
    int performOps(int firstElem, int secondElem, int thirdElem, int fourthElem, int fifthElem);
}

public class PerformOperation {
    Operation ops = (firstElem, secondElem, thirdElem, fourthElem, fifthElem) ->
            Stream.of(firstElem, secondElem, thirdElem, fourthElem, fifthElem).reduce(0, Integer::sum);
}
