// ****************************************************************
// Task4_IntList.java
//Charlie Tronrud
// An (unsorted) integer list class with a method to add an
// integer to the list and a toString method that returns the contents
// of the list with indices.
//
// ****************************************************************
public class Task4_IntList
{
	protected int[] list;
	protected int numElements = 0;
	//-------------------------------------------------------------
	// Constructor -- creates an integer list of a given size.
	//-------------------------------------------------------------
	public Task4_IntList(int size)
	{
		list = new int[size];
	}
	//------------------------------------------------------------
	// Adds an integer to the list. If the list is full,
	// prints a message and does nothing.
	//------------------------------------------------------------
	public void add(int value)
	{
		if (numElements == list.length)
			System.out.println("Can't add, list is full");
		else
		{
			list[numElements] = value;
			numElements++;
		}
	}
	//-------------------------------------------------------------
	// Returns a string containing the elements of the list with their
	// indices.
	//-------------------------------------------------------------
	public String toString()
	{
		String returnString = "";
		for (int i=0; i<numElements; i++)
			returnString += i + ": " + list[i] + "\n";
		return returnString;
	}
}
