package com.knoldus.operation;

@FunctionalInterface
public interface Operation {

    /**
     * Contains abstract method which takes five parameters of Integer type.
     *
     * @param firstElem  Integer type parameter.
     * @param secondElem Integer type parameter.
     * @param thirdElem  Integer type parameter.
     * @param fourthElem Integer type parameter.
     * @param fifthElem  Integer type parameter.
     */
    int performOps(int firstElem, int secondElem, int thirdElem, int fourthElem, int fifthElem);
}
