import java.util.*;
 import java.io.*;
 class calc{
    public static void main(String[] args){
       int n,m,result;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter two numbers=");
       n=in.nextInt();
       m=in.nextInt();
       int choice;
       System.out.println("'1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulous'\nEnter your choice=");
       choice = in.nextInt();
       switch(choice){
        case 1:
          result=n+m;
          System.out.println("The Addition of two number is ="+result);
          break;
        case 2:
          result=n-m;
          System.out.println("The Subtraction of two number is ="+result);
          break;
         case 3:
          result=n*m;
          System.out.println("The Multiplication of two number is="+result);
          break;
         case 4:
           result=n/m;
           System.out.println("The Division of two number is="+result);
           break;
          case 5:
           result=n%m;
           System.out.println("The Modulous of two number is-"+result);
           break;
          default:
           System.out.println("Invalid cases");
         
        }
       }
    }
    
