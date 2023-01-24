/**
 * This is the stack.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-10-27
 */
class Bike extends Vehicle {
    /**
    * The variable.
    */
    private double cadense;

    /**
    * Constructor.
    *
    * @param color The color of the bike
    * @param maxSpeed The max speed the bike can have
    * @param tire The number of tires
    */
    Bike(String color, int maxSpeed, int tire) {
        super(color, maxSpeed, tire);
    }

    /**
    * Getters about the status.
    */
    public void status() {
        double speed = getSpeed();
        speed = cadense * 2;
        setSpeed(speed);
        super.status();
        System.out.println(" -> Cadense: " + this.cadense);
    }

    /**
    * Getters about ringing bell.
    */
    public void ringBell() {
        System.out.println("Ding ding!\n");
    }

    /**
     * Getter for cadense.
     *
     * @return The cadense.
     */
    public double getCadense() {
        return this.cadense;
    }

    /**
     * Setter for cadense.
     *
     * @param cadense Set the cadense.
     */
    public void setCadense(double cadense) {
        this.cadense = cadense;
    }

    /**
    * Method about changing the speed.
    *
    * @param appliedPower The power the bicycle gets
    */
    public void accelerate(int appliedPower) {
        double speed = getSpeed();
        this.cadense = this.cadense + appliedPower;
        speed = this.cadense * 2;
        setSpeed(speed);
    }

    /**
     * Breaking method.
     *
     * @param breakPower The power.
     * @param breakTime The time.
     */
    public void carBreak(int breakPower, int breakTime) {
        final double speed = getSpeed();
        super.carBreak(breakPower, breakTime);
        this.cadense = speed / 2.00;
    }
}
