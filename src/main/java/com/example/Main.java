package com.example;

public class Main {
    public static void main(String[] args) {
        // Tworzenie użytkownika przez konstruktor
        User jan = new User("jankowlaski", "Jan", "Kowalski", 30);

        //Tworzenie użytkownika przez builder - nie muszę podawać wszystkich pól
        User anna =  new UserBuilder()
                .setFirstName("Anna")
                .setLastName("Kowalska")
                .setAge(27).build();

        System.out.println(jan);
        System.out.println(anna);
    }
}
