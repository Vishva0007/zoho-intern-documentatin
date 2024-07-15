import java.io.*;
import java.util.*;
class calcu{
 public static int func(int c,int d){
    int result = c+d;
    return result;
 }
}
class cob{
  public static void main(String[] args){
  int a,b;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter two numbers for addition=");
  a=in.nextInt();
  b=in.nextInt();
  calcu s = new calcu();
  System.out.println("The addition of two number is="+s.func(a,b));
   }
 }
