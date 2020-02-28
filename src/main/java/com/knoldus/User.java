package com.knoldus;

/**
 * Contains elements id, name, city, age.
 * Overrides toString method.
 */
class User {
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
        return "User{" + "id=" + id
                + ", name='" + name + '\''
                + ", city='" + city + '\''
                + ", age=" + age
                + '}';
    }
}
