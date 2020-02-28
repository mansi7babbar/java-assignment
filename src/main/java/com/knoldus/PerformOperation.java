package com.knoldus;

import java.util.stream.Stream;

/**
 * Contains implementation of abstract method of function interface.
 * Provides sum operation on five integer type parameters.
 */
public class PerformOperation {
    public Operation ops = (firstElem, secondElem, thirdElem, fourthElem, fifthElem) ->
            Stream.of(firstElem, secondElem, thirdElem, fourthElem, fifthElem).reduce(0, Integer::sum);
}
