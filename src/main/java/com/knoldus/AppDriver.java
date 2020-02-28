package com.knoldus;

import com.knoldus.operation.PerformOperation;
import com.knoldus.user.User;
import com.knoldus.user.UserOps;

import java.util.Arrays;
import java.util.List;

public class AppDriver {
    public static void main(String[] args) {
        PerformOperation performOperation = new PerformOperation();
        System.out.println(performOperation.ops.performOps(10, 15, 30, 25, 40));

        FilterCities filterCities = new FilterCities();
        List<String> cities = Arrays.asList("Chandigarh", "mumbai", "Delhi", "calcutta", "Goa", "chennai");
        System.out.println(filterCities.getCities(cities));

        MultiplyLists multiplyLists = new MultiplyLists();
        List<Integer> firstList = Arrays.asList(2, 4, 6, 8);
        List<Integer> secondList = Arrays.asList(3, 6, 9, 12, 15);
        System.out.println(multiplyLists.performMultiplication(firstList, secondList));

        UserOps userOps = new UserOps();
        User firstUser = new User(1, "Mansi", "Delhi", 18);
        User secondUser = new User(2, "Riya", "Chennai", 23);
        User thirdUser = new User(3, "Krish", "Goa", 24);
        List<User> users = Arrays.asList(firstUser, secondUser, thirdUser);
        System.out.println(userOps.performUserOps(users));
    }
}
