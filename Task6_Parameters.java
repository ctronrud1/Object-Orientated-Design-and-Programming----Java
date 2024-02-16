// ************************************************************ 
// File Name: Task6_Parameters
// Author: Charlie Tronrud
// Purpose: Task6_Parameters.java contains a program to test the variable length method average as discussed.
// ************************************************************
import java.util.Scanner;

public class Task6_Parameters {

    //-----------------------------------------------
    // Calls the average and minimum methods with
    // different numbers of parameters.
    //-----------------------------------------------
    public static void main(String[] args) {
        double mean1, mean2, mean3;
        mean1 = average(13);
        mean2 = average();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter at most 20 nonnegative integers: ");
        int[] nums = new int[20];
        int count = 0;
        while (in.hasNextInt() && count < 20) {
            int num = in.nextInt();
            if (num < 0) {
                break;
            }
            nums[count] = num;
            count++;
        }
        mean3 = average(nums, count);
        System.out.println("mean1 = " + mean1);
        System.out.println("mean2 = " + mean2);
        System.out.println("mean3 = " + mean3);

        int min1, min2, min3;
        min1 = minimum(42, 69, 37);
        min2 = minimum(35, 43, 93, 23, 40, 21, 75);
        min3 = minimum(nums, count);
        System.out.println("min1 = " + min1);
        System.out.println("min2 = " + min2);
        System.out.println("min3 = " + min3);
    }

    //----------------------------------------------
    // Returns the average of its parameters.
    //----------------------------------------------
    public static double average(int... list) {
        double result = 0.0;
        if (list.length != 0) {
            int sum = 0;
            for (int num : list)
                sum += num;
            result = (double) sum / list.length;
        }
        return result;
    }

    //----------------------------------------------
    // Returns the average of the elements in an array.
    //----------------------------------------------
    public static double average(int[] list, int count) {
        double result = 0.0;
        if (count != 0) {
            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum += list[i];
            }
            result = (double) sum / count;
        }
        return result;
    }

    //----------------------------------------------
    // Returns the minimum of its parameters.
    //----------------------------------------------
    public static int minimum(int... list) {
        int result = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < result) {
                result = num;
            }
        }
        return result;
    }

    //----------------------------------------------
    // Returns the minimum element in an array.
    //----------------------------------------------
    public static int minimum(int[] list, int count) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            if (list[i] < result) {
                result = list[i];
            }
        }
        return result;
    }
}
