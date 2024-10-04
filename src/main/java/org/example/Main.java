package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person=new Person( "John", "Doe",  20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("Lastname: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("Hobbies: " + person.getHobbies());

        System.out.println("****************");

        Person secondPerson=new Person("emrah","kızıltan",30, 1000, Boolean.TRUE, new String[]{"camping","reading"});

        System.out.println("Firstname: " + secondPerson.getFirstName());

        System.out.println("Lastname: " + secondPerson.getLastName());

        System.out.println("Age: " + secondPerson.getAge());

        System.out.println("Hobbies: " + Arrays.toString(secondPerson.getHobbies()));
    }
}
