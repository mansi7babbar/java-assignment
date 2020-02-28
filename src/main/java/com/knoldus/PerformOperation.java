package com.knoldus;

import java.util.stream.Stream;

@FunctionalInterface
interface Operation {

    /**
     * abstract method which takes five parameters of Integer type.
     *
     * @param firstElem  Integer type parameter.
     * @param secondElem Integer type parameter.
     * @param thirdElem  Integer type parameter.
     * @param fourthElem Integer type parameter.
     * @param fifthElem  Integer type parameter.
     */
    int performOps(int firstElem, int secondElem, int thirdElem, int fourthElem, int fifthElem);
}

/**
 * Contains implementation of abstract method of function interface.
 * Provides sum operation on five integer type parameters.
 */
public class PerformOperation {
    Operation ops = (firstElem, secondElem, thirdElem, fourthElem, fifthElem) ->
            Stream.of(firstElem, secondElem, thirdElem, fourthElem, fifthElem).reduce(0, Integer::sum);
}
