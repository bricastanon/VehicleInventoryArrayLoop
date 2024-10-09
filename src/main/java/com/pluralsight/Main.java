package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Vehicle[] Vehicle = new Vehicle[20];
        Vehicle[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        Vehicle[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        Vehicle[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        Vehicle[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        Vehicle[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        Vehicle[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        int vehicleCount = 6;
        while (true) {
            System.out.println("What do you want to do? ");
            System.out.println("1 - List all the vehicles ");
            System.out.println("2 - Search by make/model ");
            System.out.println("3 - Search by price range ");
            System.out.println("4 - Search by color ");
            System.out.println("5 - Add a vehicle ");
            System.out.println("6 - Quit ");
            System.out.println("Enter your command: ");

            int command = reader.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Listing all vehicles: ");
                    for (int i = 0; i < vehicleCount; i++) {
                        System.out.println(Vehicle[i]);
                    }
                    break;
                case 2:
                    System.out.println("Enter make/model to search: ");
                    reader.nextLine();
                    String searchModel = reader.nextLine();
                    System.out.println("Searching: " + searchModel);
                    break;
                case 3:
                    System.out.print("Enter minimum price: ");
                    float minPrice = reader.nextFloat();
                    System.out.print("Enter maximum price: ");
                    float maxPrice = reader.nextFloat();
                    System.out.println("Searching for prices between $" + minPrice + " and $" + maxPrice);
                    // Add price range search functionality here
                    break;
                case 4:
                    System.out.print("Enter color to search: ");
                    reader.nextLine(); // Consume the newline
                    String searchColor = reader.nextLine();
                    System.out.println("Searching for color: " + searchColor);
                    // Add color search functionality here
                    break;
                case 5:
                    System.out.println("Adding a vehicle: ");
                    // Implement vehicle addition logic here
                    break;
                case 6:
                    System.out.println("Quitting ");
                    reader.close();
                    return; // Exit the loop and program
                default:
                    System.out.println("Invalid. Please try again. ");
            }
        }


    }}





