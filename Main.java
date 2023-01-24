/*
* This program is a vehicle class.
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
*/
public class Main {
    // main program
    public static void main(String[] args) {
        Bike bmx = new Bike("Red", 40, 2);

        System.out.println("Created Bmx bike.\nStatus:\n");
        bmx.status();

        System.out.println("Set the cadense to 10\n");
        bmx.setCadense(10);
        bmx.status();

        System.out.println("\nAccelerate by 15:");
        bmx.accelerate(15);
        bmx.status();

        System.out.println("\nBrake by 5 for 5 seconds:");
        bmx.carBreak(5, 5);
        bmx.status();    

        System.out.println("\nRing bell.");
        bmx.ringBell();

        Truck bigTruck = new Truck("Grey", 200, 4, "HGC-3456F");

        System.out.println("Created a Truck.\nStatus:\n");
        bigTruck.status();

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        bigTruck.accelerate(10, 10);
        System.out.println("New speed: " + bigTruck.getSpeed());

        System.out.println("\nApplyed air pressure of 10:");
        bigTruck.applyAir(10);
        System.out.println("New speed: " + bigTruck.getSpeed());

        System.out.println("\nBreaking, 5 of power for 5 sec.");
        bigTruck.carBreak(10, 10, 10);
        System.out.println("New speed: " + bigTruck.getSpeed());

        System.out.println("\nDone.");

        // this will not work, so when actually run, I delete this
        // Vehicle newVehicle = new Vehicle();
        // newVehicle.carBreak(5, 5);
    }
}
