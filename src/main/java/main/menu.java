package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

    private ArrayList<Person> arr = new ArrayList<Person>();

    public void ui(){
        System.out.println("Main options:");

        menuOptions[] test = {menuOptions.a, menuOptions.b, menuOptions.c, menuOptions.d, menuOptions.e};

       for(int i = 0; i <= 4; i++){
           System.out.println(test[i].ordinal() + ": " + test[i].option);
       }

        Scanner input = new Scanner(System.in);

        System.out.print("Your choice: ");

        int in = input.nextInt();

        switch(in){
            case 0:
                System.out.println("Current person records:");

                //Anzeigen der Personen Objekte
                listPerson();

                System.out.println("----------------------------");
                ui();
                break;
            case 1:
                break;
            case 2:
                Person x = createPerson();
                arr.add(x);
                ui();
                break;
            case 3:
                arr.remove(deletePerson());
                ui();
            case 4:
                System.out.println("Bye!");
                System.exit(0);
                break;
            default:
                System.out.println("Choice not in range [0...4]");
                ui();
        }
        
        input.close();
    }

    private void addPerson(Person person){
        arr.add(person);
    }

    private void listPerson(){
        for(int i = 0; i <= arr.size(); i++){
            System.out.println(arr.indexOf(arr.get(i)) + ": " + arr.get(i).toString());
        }
    }

    private static Person createPerson(){
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

        input.close();

        return person;

    }

    private int deletePerson(){
        Scanner input = new Scanner(System.in);
        int index;
        listPerson();
        System.out.print("Index of person's record: ");
        try {
            index = input.nextInt();
            input.close();
            return index;
        }
        catch (InputMismatchException e){
            System.out.println("Input is not an integer");
            deletePerson();
            input.close();
        }
        return 0;
    }
}
