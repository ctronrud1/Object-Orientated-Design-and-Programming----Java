// ************************************************************ 
// File Name: Task1_Day
// Author: Charlie Tronrud
// Purpose:Write a program Task1_Day.java that prompts the user to enter an integer for today’s day of the
//...week (Sunday is 0, Monday is 1, . . . and Saturday is 6)
// ************************************************************
import java.util.Scanner;

public class Task1_Day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter today's day of the week
        System.out.print("Enter today's day (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int today = input.nextInt();

        // Prompt the user to enter the number of days elapsed since today
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        // Calculate the future day
        int futureDay = (today + elapsed) % 7;
        
        // Display the results
        String todayString = "";
        String futureDayString = "";
        switch (today) {
            case 0:
                todayString = "Sunday";
                break;
            case 1:
                todayString = "Monday";
                break;
            case 2:
                todayString = "Tuesday";
                break;
            case 3:
                todayString = "Wednesday";
                break;
            case 4:
                todayString = "Thursday";
                break;
            case 5:
                todayString = "Friday";
                break;
            case 6:
                todayString = "Saturday";
                break;
        }
        switch (futureDay) {
            case 0:
                futureDayString = "Sunday";
                break;
            case 1:
                futureDayString = "Monday";
                break;
            case 2:
                futureDayString = "Tuesday";
                break;
            case 3:
                futureDayString = "Wednesday";
                break;
            case 4:
                futureDayString = "Thursday";
                break;
            case 5:
                futureDayString = "Friday";
                break;
            case 6:
                futureDayString = "Saturday";
                break;
        }
        System.out.println("Today is " + todayString + " and the future day is " + futureDayString);
    }
}
