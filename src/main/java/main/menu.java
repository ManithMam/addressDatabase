package main;

import java.util.Scanner;

public class menu {
    public void ui(){
        System.out.println("Current person records:");

        //Anzeigen der Personen Objekte

        System.out.println("----------------------------");
        System.out.println("Main options:");

        menuOptions[] test = {menuOptions.a, menuOptions.b, menuOptions.c, menuOptions.d, menuOptions.e};

       for(int i = 0; i <= 4; i++){
           System.out.println(test[i].ordinal() + ": " + test[i].option);
       }

        Scanner input = new Scanner(System.in);

        System.out.print("Your choice: ");

        int in = input.nextInt();
    }
}
