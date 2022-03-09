package main;

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

    public void setFirstName(){
        this.firstName = firstName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public void setEmail(){
        this.email = email;
    }
    public  void setNumber(){
        this.number = number;
    }

}
