/**
 * Class representing a car, comes with variables for make, model, year, and price
 * @author Richard Gao
 * @version 1.0.0
 */
public class Car {
    //instance variables
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Creates an instance of the car class with given make, model, year, and price
     * @param make a String representing the make of the car
     * @param model a String representing the model of the car
     * @param year an int representing the year of the car
     * @param price a double representing the price of the car
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Gets the make of the car
     * @return a String representing the make of the car
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Gets the model of the car
     * @return a String representing the model of the car
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Gets the year of the car
     * @return an int representing the year of the car
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Gets the price of the car
     * @return a double representing the price of the car
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets the make of the car
     * @param make a String the make of the car is being set to
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Sets the model of the car
     * @param model a String the model of the car is being set to
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Sets the year of the car
     * @param year an int the year of the car is being set to
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Sets the price of the car
     * @param price a double the price of the car is being set to
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
