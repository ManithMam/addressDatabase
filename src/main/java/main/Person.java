package main;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String number;



    public Person(String firstName, String lastName, String email, String number){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getNumber(){
        return this.number;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String firstName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public  void setNumber(String number){
        this.number = number;
    }

    @Override
    public String toString(){
        return this.firstName + ", " + this.lastName + ", " + "email: " + this.email + ", phone: " + this.number;
    }




}
