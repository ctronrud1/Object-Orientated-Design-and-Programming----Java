// ************************************************************ 
// File Name: Task2_Print
// Author: Charlie Tronrud
// Purpose: Use escape sequences (tab, backslash, new line characters) to align the given text
// ************************************************************ 
	public class Task2_Print {
		   public static void main(String[] args) {
		      // Border on the top
		      System.out.println(" ///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		      System.out.println(" ==\t  Student Points\t    ==");
		      System.out.println(" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
		      
		      // Student names and points
		      System.out.println("\n    Name\tLab \tBonus \tTotal");
		      System.out.println("    ----\t----\t----\t----");
		      System.out.println("    John\t 82\t 12\t " + (82+12));
		      System.out.println("    Jane\t 75\t 19\t " + (75+19));
		      System.out.println("    Jim\t\t 88\t 7\t " + (88+7));
		      System.out.println("    Joan\t 70\t 20\t " + (70+20));
		      System.out.println("    Jake\t 60\t 30\t " + (60+30));
		   }
		}


