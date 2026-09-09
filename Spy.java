import java.util.*;
public class Spy
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value:");
    int x=sc.nextInt();
    int temp=x;
    int sum=0,mult=1;
    while(temp!=0)
    {
     int r=temp%10;
     sum=sum+r;
     mult=mult*r;
     temp=temp/10;
    }
    if(sum==mult)
    {
      System.out.println("Spy");
    }
    else
    {
      System.out.println("not spy");
    }
  }
}