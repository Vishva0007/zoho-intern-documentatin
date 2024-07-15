/*class swi{
 public static void main(String[] args){
   int n =1;
   switch(n){
    case 1:
     System.out.println("This is Monday");
     break;
    case 2:
     System.out.println("This is Tuesday");
     break;
    case 3:
     System.out.println("This is Wednesday");
     break;
    case 4:
     System.out.println("This is Thursday");
     break;
    case 5:
     System.out.println("This is Friday");
     break;
    case 6:
     System.out.println("This is Saturday");
     break;
    default:
     System.out.println("This is Sunady");
     break;        
     
     } 
  }
 }*/
 import java.util.*;
 import java.io,*;
 class swi{
    public static void main(String[] args){
       int n,m,result;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter two numbers=");
       n=in.nextInt();
       m=in.nextInt();
       int choice;
       System.out.println("'Enter the choice='\n'1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulous'");
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
           System.out,println("The Modulous of two number is-"+result);
           break;
          default:
           System.out.println("Invalid cases");
         
        }
       
       
       
     }
    }
