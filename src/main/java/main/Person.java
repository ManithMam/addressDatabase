package main;


public class Person {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String number;

    public Person(String firstName, String lastName, String email, String number){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
    }
    public String getLastName(){
        return this.lastName;
    }

    @Override
    public String toString(){
        return this.firstName + ", " + this.lastName + ", " + "email: " + this.email + ", phone: " + this.number;
    }
}
