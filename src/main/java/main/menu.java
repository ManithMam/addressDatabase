package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

    private ArrayList<Person> arr = new ArrayList<Person>();

    public static final Scanner input = new Scanner(System.in);

    private boolean filterToggle = false;

    private String filter;

    public void ui(){
        System.out.println("Main options:");

        menuOptions[] test = {menuOptions.a, menuOptions.b, menuOptions.c, menuOptions.d, menuOptions.e};

       for(int i = 0; i <= 4; i++){
           System.out.println(test[i].ordinal() + ": " + test[i].option);
       }

        System.out.print("Your choice: ");

        int in = input.nextInt();
        input.nextLine();

        switch(in){
            case 0:
                System.out.println("Current person records:");
                listPerson();
                System.out.println("----------------------------");
                ui();
                break;
            case 1:
                filterPerson();
                ui();
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
                input.close();
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
        if(!filterToggle) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.indexOf(arr.get(i)) + ": " + arr.get(i).toString());
            }
        }
        else{
            System.out.println("Active filter: Last name matches " + filter);
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i).getLastName().matches(filter)) {
                    System.out.println(arr.indexOf(arr.get(i)) + ": " + arr.get(i).toString());
                }
            }
        }
    }

    private static Person createPerson(){

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
            input.nextLine();
            firstName = String.valueOf(numeric);
        }

        try {
            System.out.print("Last name: ");
            lastName = input.nextLine();
        }
        catch(InputMismatchException e){
            int numeric = input.nextInt();
            input.nextLine();
            lastName = String.valueOf(numeric);
        }

        try {
            System.out.print("Optional input Email: ");
            mail = input.nextLine();
            if(mail.equals("")){
                mail = "-";
            }
        }
        catch(InputMismatchException e){
            int numeric = input.nextInt();
            input.nextLine();
            mail = String.valueOf(numeric);
        }

        try {
            System.out.print("Optional input phone: ");
            phone = input.nextLine();
            if(phone.equals("")){
                phone = "-";
            }
        }
        catch(InputMismatchException e){
            int numeric = input.nextInt();
            input.nextLine();
            phone = String.valueOf(numeric);
        }

        Person person = new Person(firstName, lastName, mail, phone);
        return person;

    }

    private int deletePerson(){
        int index;
        listPerson();
        System.out.print("Index of person's record: ");
        try {
            index = input.nextInt();
            return index;
        }
        catch (InputMismatchException e){
            System.out.println("Input is not an integer");
            deletePerson();
        }

        return 0;
    }

    private String filterPerson(){
        if(!filterToggle) {
            filterToggle = true;
            System.out.print("Enter filter expression: ");
            filter = input.nextLine();
            return filter;
        }
        else{
            filterToggle = false;
            return "";
        }
    }


}
