/*
Program: To understand PositiveOrNegative
@author: Rahul Jaiswal
@Date: 18 oct 2022  
*/
class PositiveOrNegative
{  
public static void main(String[] args)   
{  
//number to be check  
int num=912;  
//checks the number is greater than 0 or not  
if(num>0)  
{  
System.out.println("The number is positive.");  
}  
//checks the number is less than 0 or not  
else if(num<0)  
{  
System.out.println("The number is negative.");  
}  
//executes when the above two conditions return false  
else  
{  
System.out.println("The number is zero.");  
}  
}  
}  