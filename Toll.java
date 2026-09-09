import java.util.Scanner;

abstract class Vehicle {
   protected String vehicleNumber;
   public abstract double calculateToll(double weight);

   public Vehicle(String vehicleNumber){
         this.vehicleNumber = vehicleNumber;
   }
   public String getVehicleNumber(){
         return vehicleNumber;
   }
}
class Car extends Vehicle {
 
   public Car(String vehicleNumber) {
        super(vehicleNumber);
   }
   @Override
   public double calculateToll(double weight){
        return 100.0;
   }
}
class Truck extends Vehicle{
   
   public Truck(String vehicleNumber){
        super(vehicleNumber);
   }
   @Override
   public double calculateToll(double weight) {
        return 200.0 + (weight * 20);
   }
}

public class Toll {
   public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice(1 for Car or Enter 2 for Truck) = ");
        int option =  sc.nextInt();
        sc.nextLine();

        System.out.print("Vehicle Number = ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Weight of vehicle = ");
        double weight = sc.nextDouble();

        Vehicle vehicle = null;

        if( option == 1) {
             vehicle = new Car(vehicleNumber);
        }
        else if(option == 2){
             vehicle = new Truck(vehicleNumber);
        }
        else{
              System.out.print("Invalid option");
              sc.close();
              return;
        }
   
       double tollFee = vehicle.calculateToll(weight);

       System.out.println("Vehicle Number = " + vehicle.getVehicleNumber());
       System.out.println("Weight = " + weight + " tons ");
       System.out.println("Total Fee = " + tollFee); 
   }
}