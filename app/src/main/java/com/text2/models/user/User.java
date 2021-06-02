package com.text2.models.user;

public class User {
    private String name = "Petr";
    private String family = "Smirnov";
    private int age = 24;
    private String address = "Moscow";

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }
}
