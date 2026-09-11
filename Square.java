import java.util.Scanner;
public class Square
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter side:");
     int s=sc.nextInt();
     int ans=s*s;
     System.out.println("Area of squre is:"+ans);
  }
}