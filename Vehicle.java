/**
* This is the stack.
*
* @author  Yiyun Qin
* @version 1.0
* @since   2022-10-27
*/
public class Vehicle {
    /**
     * The car color.
     */
    private String color;
    /**
     * The car speed.
     */
    private double speedCar;
    /**
     * The car's max speed.
     */
    private final int maxinumSpeed;
    /**
     * The car's tire number.
     */
    private int tireNum;

    /**
    * Constructor.
    *
    * @param color The color of the vehicle
    * @param maxSpeed The max speed the vehicle can have
    * @param tire The tire numbers
    */

    public Vehicle(String color, int maxSpeed, int tire) {
        this.color = color;
        this.maxinumSpeed = maxSpeed;
        this.tireNum = tire;
    }

    /**
    * The getter of status.
    */
    public void status() {
        System.out.println(" -> Speed: " + this.speedCar);
        System.out.println(" -> MaxSpeed: " + this.maxinumSpeed);
        System.out.println(" -> Color: " + this.color);
        System.out.println(" -> Tire Number: " + this.tireNum);
    }

    /**
     * Getter for speed.
     *
     * @return the speed
     */
    public double getSpeed() {
        return this.speedCar;
    }

    /**
     * Getter for color.
     *
     * @return The color.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Set speed.
     *
     * @param speed The speed of the car.
     */
    public void setSpeed(double speed) {
        this.speedCar = speed;
    }

    /**
     * Set the color.
     *
     * @param color The color of the car.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
    * The method of accelerating the car.
    *
    * @param accelerationPower The power applied
    * @param accelerationTime The time accelerated
    */
    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speedCar = accelerationPower * accelerationTime + this.speedCar;
    }

    /**
    * The method of breaking the car.
    *
    * @param breakPower The power applied
    * @param breakTime The power breaked
    */
    public void carBreak(int breakPower, int breakTime) {
        this.speedCar = this.speedCar - breakPower * breakTime;
    }
}
