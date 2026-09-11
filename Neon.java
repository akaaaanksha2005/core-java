import java.util.*;
public class NeonEx
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter value:");
     int x=sc.nextInt();
     int sqr=x*x;
     int temp=x;
     int sum=0;
      while(sqr!=0)
      {
         int r=sqr%10;
         sum=sum+r ;
         sqr=sqr/10;
      }
      if(temp==sum)
      {
        System.out.println("neon");
      }
      else
      {
        System.out.println("not neon");
      }
  }
}