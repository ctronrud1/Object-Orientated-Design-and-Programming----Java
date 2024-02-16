// ************************************************************ 
// File Name: Task3 HomeAppliances
// Author: Charlie Tronrud
// Purpose: Learn to implement inheritance.
// ************************************************************
public abstract class Task3_HomeAppliances extends Task_Electronics {
	
	public Task3_HomeAppliances (String manufacturers, double cost, double weight) {
		super(manufacturers, cost, weight);
	}
	
	public abstract String room ();
}
