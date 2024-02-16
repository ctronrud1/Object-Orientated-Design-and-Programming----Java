// ****************************************************************
// Task6_Dog.java
//
// A class that holds a dog's name and can make it speak.
//
// ****************************************************************
public abstract class Task6_Dog {
    protected String name;
    protected int weight;
    
    public Task6_Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public abstract String getBreed();
    
    public String getName() {
        return name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
