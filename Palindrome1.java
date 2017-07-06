# re3
import java.io.*;
import java.util.*;
public class Palindrome1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,num,temp=0;
    System.out.println("Enter the number:");
    num=sc.nextInt();
    b=num;
    while(num>0)
    {
      a=num%10;
      num=num/10;
      temp=temp*10+a;
    }
    if(temp==b)
    {
      System.out.println("palindrome");
    }
    else
    {
      System.out.println("Not palindrome");
    }
  }
}

