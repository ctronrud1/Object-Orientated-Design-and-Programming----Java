// ************************************************************ 
// File Name: Task5_Average
// Author: Charlie Tronrud
// Purpose: Write a program Task5_Average.java that just prints the strings that it is given at the command line, one per line
// ************************************************************
public class Task5_Average {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("No arguments");
        } else {
            int sum = 0;
            int count = 0;
            for(String arg: args) {
                boolean isInt = true;
                for(int i = 0; i < arg.length(); i++) {
                    if(!Character.isDigit(arg.charAt(i))) {
                        isInt = false;
                        break;
                    }
                }
                if(isInt) {
                    sum += Integer.parseInt(arg);
                    count++;
                } else 
                {
                    System.out.println("Invalid input: " + arg + " is not an integer.");
                }
            }
            if(count == 0) {
                System.err.println("No valid integers found.");
            } else {
                double average = (double) sum / count;
                System.out.println("Average of " + count + " command line argument is " + average);
            }
        }
    }
}
