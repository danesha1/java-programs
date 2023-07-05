import java.util.Scanner;
public class Add{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a number");
    int number=sc.nextInt();
    System.out.println("multiplication table for"+number+":");
    for(int i=1;i<=10;i++){
      System.out.println(number + " x " + i + " = " + (number * i));
    }
  }
}