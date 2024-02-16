// ************************************************************ 
// File Name: Task3_CharacterList
// Author: Charlie Tronrud
// Purpose: File Task3_CharacterListTest.java contains a Java program that provides menu-driven testing for the Task3_CharacterList class. 
// ************************************************************
public class Task3_CharacterList {

    private char[] list;
    private int size;
    private int numElements;

    public Task3_CharacterList(int initialSize) {
        size = initialSize;
        numElements = 0;
        list = new char[size];
    }

    public void randomize() {
        for (int i = 0; i < numElements; i++) {
            list[i] = (char) ((Math.random() * 100) + 1);
        }
    }

    public void print() {
        for (int i = 0; i < numElements; i++) {
            System.out.println(i + ": " + list[i]);
        }
    }

    public void addElement(char newVal) {
        if (numElements == size) {
            increaseSize();
        }
        list[numElements] = newVal;
        numElements++;
    }

    public boolean removeFirst(char newVal) {
        int index = -1;
        for (int i = 0; i < numElements; i++) {
            if (list[i] == newVal) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < numElements - 1; i++) {
                list[i] = list[i + 1];
            }
            numElements--;
        }
		return false;
    }

    public int removeAll(char newVal) {
        for (int i = 0; i < numElements; i++) {
            if (list[i] == newVal) {
                for (int j = i; j < numElements - 1; j++) {
                    list[j] = list[j + 1];
                }
                numElements--;
                i--;
            }
        }
		return newVal;
    }

    private void increaseSize() {
        size *= 2;
        char[] newList = new char[size];
        for (int i = 0; i < numElements; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }
}
