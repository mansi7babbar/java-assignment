package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

public class FilterCities {

    /**
     * @param cities List of cities.
     * @return sorted list of cities starting with 'C'.
     */
    List<String> getCities(List<String> cities) {
        return cities.stream()
                .filter(city -> city.contains("C") || city.contains(("c")))
                .sorted()
                .collect(Collectors.toList());
    }
}
