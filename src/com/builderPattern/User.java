package com.builderPattern;

/**
 * This class will only have the getter methods to provide immutability
 */

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private  String address;
    private String phoneNumber;

    public User(String firstName, String lastName, int age, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
            + ", age=" + age + ", address='" + address + '\'' + ", phoneNumber='" + phoneNumber
            + '\'' + '}';
    }
}
