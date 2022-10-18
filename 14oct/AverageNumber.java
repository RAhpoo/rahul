import java.util.Scanner;
public class AverageNumber 
{
    public static void main(String[] args) 
    {
        int number1,number2,number3,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = sc.nextInt();
        System.out.println("Enter the second number:");
        number2 = sc.nextInt();
        System.out.println("Enter the third number:");
        number3 = sc.nextInt();
      sum=number1+number2+number3;
      double avg=sum/3;
      System.out.println("Average of the numbers is "+avg);
 
    }
}