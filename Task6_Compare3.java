// ************************************************************ 
// File Name: Task6_Compare
// Author: Charlie Tronrud
// Purpose: Write a class Task6_Compare3.java that provides a static method largest
// ************************************************************
public class Task6_Compare3 {
    public static <T extends Comparable<T>> T largest(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
