/*
Program: To understand voting or Sorry, you can't vote now! You can vote after 18  years 
@author: Rahul Jaiswal
@Date: 18 oct 2022  
*/
import java.util.Scanner;

class Voting {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		if(age>18){
			System.out.println("Welcome to vote");
		}else{
			int shortBy = (18 - age);
			System.out.println("Sorry, you can't vote now! You can vote after :"+ shortBy + " years");
		}

	}

}
