 // ************************************************************ 
// File Name:Task6PaintThings
// Author: Charlie Tronrud
// Purpose: For the purposes of this exercise, the only attribute a shape will have is a name and the method of interest will be one that computes the area of the shape
// ************************************************************
import java.text.DecimalFormat;

public class Task6_PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck = new Rectangle(20, 35, "Deck");
        Sphere bigBall = new Sphere(15, "Big Ball");
        Cylinder tank = new Cylinder(10, 30, "Tank");
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}

