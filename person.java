package assesment;

import java.util.Scanner;

public class person {
    
//Creating variables
    private String personName;
    private int personAge;
    private double address;

    public person(String v1, int v2, double v3) {
        this.personName = v1;
        this.personAge = v2;
        this.address = v3;
    }


    //displaying person details

    public void display() {
        System.out.println("Person Name: " + personName);
        System.out.println("Person Age: " + personAge);
        System.out.println("Address: " + address);
    }

    public void details(person person) {
        person.display();
    }

    //Printing current instance.
    public void printInstance() {
        details(this);
    }

    public static void main(String[] args) {
        System.out.println("Provide the asked information");

        Scanner ask = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String v1 = ask.nextLine();
        
        System.out.println("Enter your age:");
        int v2 = ask.nextInt();
        
        System.out.println("Enter your address:");
        double v3 = ask.nextDouble();
        
        // Create a Person object 
        person person = new person(v1, v2, v3);
        
        // Print the details of the created person
        person.printInstance();
        
        ask.close(); // Close the Scanner
    }
}
