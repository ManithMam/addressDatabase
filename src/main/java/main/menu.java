package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

    private final ArrayList<Person> arr = new ArrayList<>();

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
                try {
                    arr.remove(deletePerson());
                }
                catch(IndexOutOfBoundsException ex){
                    System.out.println("Input is not in range");
                    System.out.println("Enter 0 - " + (arr.size()-1));
                    arr.remove(deletePerson());
                }

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

    }

    private void listPerson(){
        if(!filterToggle) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.indexOf(arr.get(i)) + ": " + arr.get(i).toString());
            }
        }
        else{
            System.out.println("Active filter: Last name matches: " + filter);
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


            System.out.print("First name: ");
            firstName = input.nextLine();

            System.out.print("Last name: ");
            lastName = input.nextLine();

            System.out.print("Optional input Email: ");
            mail = input.nextLine();
            if(mail.equals("")){
                mail = "-";
            }

            System.out.print("Optional input phone: ");
            phone = input.nextLine();
            if(phone.equals("")){
                phone = "-";
            }


        return new Person(firstName, lastName, mail, phone);

    }

    private int deletePerson(){
        if(arr.size() == 0){
            System.out.println("No Person to delete!");
            ui();
        }
        int index;
        listPerson();
        System.out.print("Index of person's record: ");
        try {
            index = input.nextInt();

            return index;
        }
        catch (InputMismatchException e){
            System.out.println("Input is not an integer");
            System.out.println();
            input.nextLine();
            deletePerson();
        }
        return 0;
    }

    private void filterPerson(){
        if(!filterToggle) {
            filterToggle = true;
            System.out.print("Enter filter expression: ");
            filter = input.nextLine();
        }
        else{
            filterToggle = false;
        }
    }


}
