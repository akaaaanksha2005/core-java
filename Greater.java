import java.util.*;
class Input
{
  protected int x,y;
  public void accept(int x,int y)
  {
    this.x=x;
    this.y=y;
  }
}
class GreaterNo extends Input
{
  public void isGreater()
  {
     if(x>y)
     {
       System.out.println("x is greater");
     }
     else
     {
       System.out.println("y is greater");
     }
  }
}
public class Greater
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first value:");
     int x=sc.nextInt();
     System.out.println("enter second value:");
     int y=sc.nextInt();
     GreaterNo obj=new GreaterNo();
     obj.accept(x,y);
     obj.isGreater();
   }
}