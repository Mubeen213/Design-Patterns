package com.builderPattern;

public  class UserBuilder {

    private   String firstName;
    private String lastName;
    private int age;
    private  String address;
    private String phoneNumber;

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public UserBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public User build() {
        User user = new User(firstName, lastName, age, address,phoneNumber);
        validateUserObject(user);
        return  user;
    }

    private void validateUserObject(User user) {
        //Do some basic validations to check
        //if user object does not break any assumption of system
    }
}
