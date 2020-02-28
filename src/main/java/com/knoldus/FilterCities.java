package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

public class FilterCities {
    List<String> getCities(List<String> cities) {
        return cities.stream()
                .filter(city -> city.contains("C") || city.contains(("c")))
                .sorted()
                .collect(Collectors.toList());
    }
}
