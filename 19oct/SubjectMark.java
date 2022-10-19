/*
Program: To understand PositiveOrNegative
@author: Rahul Jaiswal
@Date: 19 oct 2022  
*/
import java.util.Scanner;
public class SubjectMark {
public static void main(String[] args) 
{ 	
// Create an object of Scanner class to take input.
   Scanner sc = new Scanner(System.in);
   
  System.out.println("Enter the marks of Physics ");
   int phyMarks = sc.nextInt();
  System.out.println("Enter the marks of Chemistry ");
   int chemMarks = sc.nextInt();
  System.out.println("Enter the marks of Maths ");
   int mathsMarks = sc.nextInt();
 
System.out.println("Enter the marks of English ");
 int engMarks = sc.nextInt();
System.out.println("Enter the marks of Computer ");
 int compMarks = sc.nextInt();
 
float totalMarks = phyMarks + chemMarks + mathsMarks + engMarks + compMarks;
System.out.println("Total marks in five subjects: " +totalMarks);
float myPer = totalMarks /5;
System.out.println("My percentage: " +myPer);

if(myPer >= 80) { // Checking percentage to find grade using if else statement.
 System.out.println("Grade A");	
}
else {
  System.out.println("Grade B");	
}
 }
}