public class Dog {
    // instance variables
    private String name;
    private String breed;
    private int weight;
    
    /**
     * Dog class constructor
     * @param name Name of the dog
     * @param breed Breed of the dog
     * @param weight Weight of the dog as an int
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * Dog class name getter
     * @return Name of the dog
     */
    public String getName() {
        return this.name;
    }

    /** 
     * Dog class breed getter
     * @return Breed of the dog
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * Dog class weight getter
     * @return Weight of the dog as an int
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Dog class name setter
     * @param name New name of the dog
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Dog class breed setter
     * @param breed New breed of the dog
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Dog class weight setter
     * @param weight New weight of the dog as an int
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}