public class Car {
    //instance variables
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Car class constructor
     * @param make Make of the car
     * @param model Model of the car
     * @param year Year of the car as an int
     * @param price Price of the car as a double
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Car make getter
     * @return Make of the car
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Car model getter
     * @return Model of the car
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Car year getter
     * @return Year of the car as an int
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Car price getter
     * @return Price of the car as a double
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Car make setter
     * @param make New make of the car
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Car model setter
     * @param model New model of the car
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Car year setter
     * @param year New year of the car as an int
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Car price setter
     * @param price New price of the car as a double
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
