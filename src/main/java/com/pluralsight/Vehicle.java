package com.pluralsight;

//import java.util.Scanner;

public class Vehicle {
    //Scanner reader = new Scanner(System.in);
    public long vehicleId; // ex: 101121
    public String makeModel; // ex: Ford Explorer
    public String color; // ex: Red
    public int odometerReading; // ex: 32775
    public float price; // ex: 12250.00 (no lambos here!)

    // Constructor
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
    public long getvehicleId() {
            return vehicleId;
    }
    public void setvehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getMakeModel() {
        return makeModel;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getOdometerReading() {
        return odometerReading;
    }
    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
@Override
public String toString() {
    return String.format("Vehicle [ID: %d, Model: %s, Color: %s, Odometer: %d, Price: $%.2f]",
            vehicleId, makeModel, color, odometerReading, price);


   /* public void listAllVehicleInfo() {
            //System.out.println("Here are all the vehicles: ");
            System.out.println(makeModel + color + price);
    }

    public void listAllMakeModelInfo() {
            //System.out.println("What make/model would you like to search for? ");
          //  listAllMakeModelInfo = reader.nextLine();
            System.out.println("Here are all the make/models: ");
    }
    public void listAllVehiclePriceInfo() {
             System.out.println("Listing all prices available: ");
    }
    public void listAllVehicleColorinfo() {
            System.out.println();
    }
    public void addAVehicle() {
        System.out.println();
    } }



    private void Vehicleinfo() {
           }

    */


}}