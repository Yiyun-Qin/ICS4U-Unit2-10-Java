/**
 * This is the stack.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-10-27
 */
class Truck extends Vehicle {
    /**
     * The license.
     */
    private final String licensePlateNumber;

    /**
    * Constructor.
    *
    * @param color The color of the truck
    * @param speed The speed of the truck
    * @param tire The number of tires
    * @param license The license plate number
    */
    Truck(String color, int speed, int tire, String license) {
        super(color, speed, tire);
        this.licensePlateNumber = license;
    }

    /**
    * The getter of the status.
    */
    public void status() {
        super.status();
        System.out.println(" -> License Plate: " + this.licensePlateNumber);
    }

    /**
    * The method of applying air.
    *
    * @param airPressure The applied air pressure
    */
    public void applyAir(double airPressure) {
        double speed = getSpeed();
        speed = speed - airPressure / 2;
        setSpeed(speed);
    }

    /**
     * The method of breaking.
     *
     * @param breakPower The power.
     * @param breakTime The time.
     * @param airPressure The air pressure.
     */
    public void carBreak(int breakPower, int breakTime, int airPressure) {
        double speed = getSpeed();
        speed = speed - (breakPower * breakTime)
                - (airPressure * breakTime);
        if (speed < 0) {
            speed = 0;
        }
        setSpeed(speed);
    }
}
