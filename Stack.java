/* -----------------------------------------------------------------
Workshop 1
Filename: Stack.java
--------------------------------------------------------------------
Name: Mikhail Frolov
Date: 2020/09/28
ID: 164788184
E-mail: mfrolov@myseneca.ca
--------------------------------------------------------------------*/
//I have done all the coding by myself and only copied the code that
//my professor provided to complete my workshops and assignments.
/*------------------------------------------------------------------*/

public class Stack {
	
	//Character array that holds sequence of characters as its storage.
	private char[] stack;
	
	//A variable to keep track of characters.
	private int topOfStack;
	
	//Constructor that is going to initialize the stack with the length of the arguments in the array.
	public Stack(int length) {
		
		// creating new stack with the given length
		stack = new char[length];
		
		//initializing top of stack
		topOfStack = 0;
	} 

	//Method to pop one character out of the stack.
	public char popOne() {
		return stack[--topOfStack];
	}
	
	//Method to push one character to the stack.
	public void pushOne(char character) {
		stack[topOfStack++] = character;
	}
	

}
