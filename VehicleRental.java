interface Rentable {
    void rent(int days);
}
abstract class Vehicle {
    private String model;
    private double rate;

    Vehicle(String model, double rate) {
        this.model = model;
        this.rate = rate;
    }
    public void getModel() {
        System.out.println("Model = " + model);
    }
    public void setDailyRate(double rate) {
        if ( rate > 0) {
            this.rate = rate;
        }
        else {
            System.out.println("Invalid rate");
        }
    }
    public double getDailyRate() {
        System.out.println("Daily rate = " + rate);
        return rate;
    }
}
class Car extends Vehicle implements Rentable {
    Car(String model, double rate) {
        super(model, rate);
    }
    public double getTotalCost() {
        double rate = getDailyRate();
        return rate;
    }
    public void rent(int days) {
        System.out.println("Days of rented car = " + days);
        System.out.println("Total cost of Car = " + days * this.getTotalCost() + "\n");
    }
}
class Bike extends Vehicle implements Rentable {

    Bike(String model, double rate) {
        super(model,rate);
    }
    public double getTotalCost() {
        double rate = getDailyRate();
        return rate;
    }
    public void rent(int days) {
        double totalCost = days * getTotalCost();
        if ( days > 5) {
            double discountedCost = totalCost - ( totalCost * 20/100);  
            System.out.println("Days of rented bike = " + days);       
            System.out.println("Total rate of bike after 5 days = " +  discountedCost);
        }
        else {
            System.out.println("Total rate of bike before 5 days = " + totalCost);
        }
    }
}
public class VehicleRental {
    public static void main(String[] args) {
        Car c = new Car("Top model",1500);
        Bike b = new Bike("Old Model", 1000);
        c.getModel();
        c.setDailyRate(500);
        c.rent(8);
        
        b.getModel();
        b.setDailyRate(1000);
        b.rent(10);

    }
}