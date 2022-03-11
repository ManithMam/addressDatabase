package main;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String number;

    private ArrayList<Person> arr = new ArrayList<Person>();

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
        return this.firstName + " " + this.lastName + ", " + "email: " + this.email + ", phone: " + this.number;
    }

    private void createPerson(){
        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        String mail;
        String phone;

        try {
            System.out.print("First name: ");
            firstName = input.nextLine();
        }
        catch(InputMismatchException e){
            int numeric = input.nextInt();
            firstName = String.valueOf(numeric);
        }

        try {
            System.out.print("Last name: ");
            lastName = input.nextLine();
        }
        catch(InputMismatchException e){
            int numeric = input.nextInt();
            lastName = String.valueOf(numeric);
        }

        try {
            System.out.print("Optional input Email: ");
            mail = input.nextLine();
        }
        catch(InputMismatchException e){
            int numeric = input.nextInt();
            mail = String.valueOf(numeric);
        }

        try {
            System.out.print("Optional input phone: ");
            phone = input.nextLine();
        }
        catch(InputMismatchException e){
            int numeric = input.nextInt();
            phone = String.valueOf(numeric);
        }

        Person person = new Person(firstName, lastName, phone, mail);

        arr.add(person);

        input.close();
    }

    private void listPerson(){
        for(int i = 0; i <= arr.size(); i++){
            System.out.println(arr.indexOf(arr.get(i)) + ": " + arr.get(i).hashCode());
        }
    }

    private void deletePerson(){
        Scanner input = new Scanner(System.in);
        int index;
        listPerson();
        System.out.print("Index of person's record: ");
        try {
            index = input.nextInt();
            arr.remove(index);
        }
        catch (InputMismatchException e){
            System.out.println("Input is not an integer");
            deletePerson();
        }
    }
}
