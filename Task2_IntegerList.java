// ************************************************************ 
// File Name: Task2_IntegerList
// Author: Charlie Tronrud
// Purpose: Task2 contains a Java class representing a list of integers
// ************************************************************
public class Task2_IntegerList {
    int[] list; //values in the list

    public Task2_IntegerList(int size) {
        list = new int[size];
    }

    public void randomize() {
        for (int i = 0; i < list.length; i++)
            list[i] = (int) (Math.random() * 100) + 1;
    }

    public void print() {
        for (int i = 0; i < list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public int search(int target) {
        int location = -1;
        for (int i = 0; i < list.length && location == -1; i++)
            if (list[i] == target)
                location = i;
        return location;
    }

    public void selectionSort() {
        int minIndex;
        for (int i = 0; i < list.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < list.length; j++)
                if (list[j] < list[minIndex])
                    minIndex = j;
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }

    public void replaceFirst(int oldVal, int newVal) {
        int index = search(oldVal);
        if (index != -1)
            list[index] = newVal;
    }

    public void replaceAll(int oldVal, int newVal) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == oldVal)
                list[i] = newVal;
        }
    }

    public void sortDecreasing() {
        int maxIndex;
        for (int i = 0; i < list.length - 1; i++) {
            maxIndex = i;
            for (int j = i + 1; j < list.length; j++)
                if (list[j] > list[maxIndex])
                    maxIndex = j;
            int temp = list[i];
            list[i] = list[maxIndex];
            list[maxIndex] = temp;
        }
    }

    public int binarySearchD(int target) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (list[mid] == target)
                return mid;
            else if (list[mid] > target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
