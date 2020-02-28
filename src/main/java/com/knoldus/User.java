package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    int id;
    String name;
    String city;
    int age;

    public User(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}

class UserOps {
    List<List<User>> performUserOps(List<User> users) {
        List<User> query1 = users.stream().filter(user -> user.age > 18 && user.city.equals("Delhi")).collect(Collectors.toList());
        List<User> query2 = users.stream().filter(user -> user.id > 10 && user.age < 20).collect(Collectors.toList());
        List<User> query3 = users.stream().filter(user -> user.age % 2 == 0).collect(Collectors.toList());
        List<User> query4 = users.stream().filter(user -> user.age == 18 && user.city.equals("Delhi")).collect(Collectors.toList());
        return Arrays.asList(query1, query2, query3, query4);
    }
}
