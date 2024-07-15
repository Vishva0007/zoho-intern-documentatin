import java.util.*;
class Calculator{
 int result;
 public int add(int m,int n){
   result=m+n;
   return result;
 }
 public int sub(int m,int n){
   result=m-n;
   return result;
 }
 public int mul(int m,int n){
   result=m*n;
   return result;
 }
 public int div(int m,int n){
   result=m/n;
   return result;
 }
 public int mod(int m,int n){
   result =m%n;
   return result;
 } 

}
class Demo{
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  Calculator calc = new Calculator();
  int a,b;
  System.out.println("Enter any two number for calculation");
  a=in.nextInt();
  b=in.nextInt();
  int choice;
  System.out.println("Enter the choice:");
  System.out.println("1.Add,2.Subtract,3.Multiplication,4.Division,5.Modulous");
  choice =in.nextInt();
  switch(choice){
   case 1:
    int ad = calc.add(a,b);
    System.out.println("The Addition of two number is ="+ad);
    break;
   case 2:
    int su = calc.sub(a,b);
    System.out.println("The Subtraction of two number is ="+su);
    break;
   case 3:
    int mu = calc.mul(a,b);
    System.out.println("The Multiplication of two number is ="+mu);
    break;
   case 4:
    int di = calc.div(a,b);
    System.out.println("The Divison of two number is ="+di);
    break;
   case 5:
    int mo = calc.mod(a,b);
    System.out.println("The Modolous of two number is ="+mo);
    break;
   default:
    System.out.println("Invalid choice");
  }
    
 }
}
