/* -----------------------------------------------------------------
Workshop 1
Filename: Palindrome.java
--------------------------------------------------------------------
Name: Mikhail Frolov
Date: 2020/09/28
ID: 164788184
E-mail: mfrolov@myseneca.ca
--------------------------------------------------------------------*/
//I have done all the coding by myself and only copied the code that
//my professor provided to complete my workshops and assignments.
/*------------------------------------------------------------------*/

public class Palindrome {
	
	// Boolean that returns true if the string that is provided is Palindrome, otherwise returns false.
	private static boolean isItPalindrome(String string) {
		
		//the value that is going to be returned
		boolean palindrome = true;
		
		//Creating a new stack with the size of the length of the given string.
		Stack stack = new Stack(string.length());
		
		//Populating the stack character-by-character
		for ( int i = 0; i < string.length(); i++ )
			stack.pushOne(string.charAt(i));
		
		
		//Checking if the first character is the same as the last one and breaking out of the loop if it is not the same.
		for( int j = 0; j < string.length(); j++ ) {
			
			if ( palindrome == true ) {
				
				if ( stack.popOne() != string.charAt(j) ) {
					palindrome = false;		
				}
			
			}
		}
		
		
		return palindrome;
	}

	//Main method
	public static void main(String[] args) {
		
		
		//Word, phrase or a number to be checked if Palindrome from CLA.
		String string = args[0];
		
		if ( isItPalindrome(string) ) {
			System.out.println(string + " is Palindrome.");
		} else {
			System.out.println(string + " is not Palindrome.");
		}
		
	}
	
}