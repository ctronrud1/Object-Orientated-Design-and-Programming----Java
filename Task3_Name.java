// ************************************************************ 
// File Name: Task3_Name
// Author: Charlie Tronrud
// Purpose: Write a class Task3_Name that stores a person’s first, middle, and last names and provides the given methods: 
// ************************************************************
public class Task3_Name {
    private String first;
    private String middle;
    private String last;

    public Task3_Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String firstMiddleLast() {
        return first + " " + middle + " " + last;
    }

    public String lastFirstMiddle() {
        return last + ", " + first + " " + middle;
    }

    public boolean equals(Task3_Name otherName) {
        return this.first.equalsIgnoreCase(otherName.first) && 
               this.middle.equalsIgnoreCase(otherName.middle) && 
               this.last.equalsIgnoreCase(otherName.last);
    }

    public String initials() {
        return ("" + first.charAt(0) + middle.charAt(0) + last.charAt(0)).toUpperCase();
    }

    public int length() {
        return first.length() + middle.length() + last.length();
    }
}
