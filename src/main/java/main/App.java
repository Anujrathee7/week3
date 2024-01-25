package main;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, name the zoo:");
    
    String zooName = scanner.nextLine();
    Zoo zoo = new Zoo(zooName);
   
   boolean exit = false;
    while (!exit) {
        System.out.println("1) Create a new animal, 2) List all animals, 3) Run animals, 0) End the program");
   
        String stringChoice = scanner.nextLine();
        int choice = Integer.parseInt(stringChoice);
        switch (choice) {
            case 1:
                System.out.println("What species?");            
                String species = scanner.nextLine();
                System.out.println("Enter the name of the animal:");
                String name = scanner.nextLine();
                System.out.println("Enter the age of the animal:");
                String stringAge = scanner.nextLine();
                int age = Integer.parseInt(stringAge);
                zoo.addAnimal(species, name, age);
                break;
            case 2:
                zoo.listAnimal();
                break;
            case 3:
                System.out.println("How many laps?");
                String stringLaps = scanner.nextLine();
                int laps = Integer.parseInt(stringLaps);
                zoo.runAnimal(laps);
                break;
                case 0:
                    exit = true;
                    System.out.println("Thank you for using the program.");
            default:
                System.out.println("Wrong input value");
                break;
        }
    }
    scanner.close();
    }
}
