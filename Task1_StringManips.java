// ************************************************************ 
// File Name: Task1_StringManips
// Author: Charlie Tronrud
// Purpose: Study the output and make sure you understand the relationship between the code and what is printed then modify the code
// ************************************************************ 
	import java.util.Scanner;

	public class Task1_StringManips {
		public static void main (String[] args) {
			String phrase = new String("Java is a Pure Object-Oriented Programming Language");
			int phraseLength; // number of characters in the phrase String
			int middleIndex; // index of the middle character in the String
			String firstHalf; // first half of the phrase String
			String secondHalf; // second half of the phrase String
			String switchedPhrase; // a new phrase with original halves switched
			
			// compute the length and middle index of the phrase
			phraseLength = phrase.length();
			middleIndex = phraseLength / 2;

			// get the substring for each half of the phrase
			firstHalf = phrase.substring(0, middleIndex);
			secondHalf = phrase.substring(middleIndex, phraseLength);

			// concatenate the firstHalf at the end of the secondHalf
			switchedPhrase = secondHalf.concat(firstHalf);

			// print information about the phrase
			System.out.println("Original phrase: " + phrase);
			System.out.println("Length of the phrase: " + phraseLength + " characters");
			System.out.println("Index of the middle: " + middleIndex);
			System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));
			
			// create a string consisting of the middle three characters of phrase
			String middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
			System.out.println("Middle three characters: " + middle3);
				
			// replace all blank characters in switchedPhrase with asterisks
			System.out.println("Switched phrase (original): " + switchedPhrase);
			switchedPhrase = switchedPhrase.replaceAll("\\s", "*");
			System.out.println("Switched phrase (after replacing blanks): " + switchedPhrase);
			System.out.println("Switched phrase after replacing blanks : " + switchedPhrase );
			// prompt the user to enter their hometown (city and state) and create a new string
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your hometown (city):");
			String city = input.nextLine();
			System.out.println("Enter your hometown (state):");
			String state = input.nextLine();

			String newString = state.toUpperCase() + " " + city.toLowerCase() + " " + state.toUpperCase();
			System.out.println("New string: " + newString);
		}
	}

