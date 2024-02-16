// ************************************************************ 
// File Name: Task4_Box
// Author: Charlie Tronrud
// Purpose: Write a class that contains instance data that represents the height, width, and depth  of  the  box. While using the guidelines given. 
// ************************************************************
public class Task4_Box {
	//These are the private variables
    private double height;
    private double width;
    private double depth;
    private boolean full;

    public Task4_Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
    }
    // These are the getter and setter methods
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public String toString() {
        return "Box with dimensions " + height + " x " + width + " x " + depth + ", full = " + full;
    }
}


