import java.util.Scanner;
public class NumberComparision
  {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
int firstNumber=sc.nextInt();
System.out.println("enter second number");
int secondNumber=sc.nextInt();
if(firstNumber!=secondNumber){
  System.out.println(firstNumber+"!="+secondNumber);
}
if(firstNumber<secondNumber){
  System.out.println(firstNumber+"<"+secondNumber);
}
if(firstNumber>secondNumber){
  System.out.println(firstNumber+">"+secondNumber);
}
    }
  }