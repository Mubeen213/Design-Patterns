package com.builderPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
      User user = new User("Md","Mubeen",12,"qwes","1233");

      User mubeen = new UserBuilder()
          .setFirstName(user.getFirstName())
          .setLastName(user.getLastName())
          .setAge(user.getAge())
          .setAddress(user.getAddress())
          .setPhoneNumber(user.getPhoneNumber())
          .build();
        System.out.println(mubeen);
    }
}
