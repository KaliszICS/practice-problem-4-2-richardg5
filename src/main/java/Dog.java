/**
 * Class representing a dog, comes with variables for name, breed, and weight
 * @author Richard Gao
 * @version 1.0.0
 */
public class Dog {
    // instance variables
    private String name;
    private String breed;
    private int weight;
    
    /**
     * Creates an instance of the dog class with given name, breed, weight
     * @param name a String representing the name of the dog
     * @param breed a String representing the breed of the dog
     * @param weight an int representing the weight of the dog
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * Gets the name of the dog
     * @return a String representing the name of the dog
     */
    public String getName() {
        return this.name;
    }

    /** 
     * Gets the breed of the dog
     * @return a Stirng representing the breed of the dog
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * Gets the weight of the dog
     * @return an int representing the weight of the dog
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Sets the name of the dog
     * @param name a String the name of the dog is being set to
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the breed of the dog
     * @param breed a String the breed of the dog is being set to
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Sets the weight of the dog
     * @param weight an int the weight of the dog is being set to
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}