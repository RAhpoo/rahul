/*
Program: To understand data types
@author: Rahul Jaiswal
@Date: 18 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class ASCII
{
	public static void main(String args[])
	{
		//creating Scanner Object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		
		//taking the character input 
		char charValue = sc.next().charAt(0);
		
		//converting char to asciiValue
		int asciiValue= charValue;
	    // print ASCii Value
		System.out.println("The Ascii value of "+ charValue + " is: "+asciiValue );
		
		
			
	}
		
	
	// end of main
}
// end of class 