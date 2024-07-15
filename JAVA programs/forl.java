import java.util.*;
public class forl {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the Start of Morning=");
  int morningStart = in.nextInt();
  System.out.println("Enter the interval of Morning=");
  int morningIntervals = in.nextInt();
  System.out.println("Enter the Start of Afternoon=");
  int afternoonStart = in.nextInt();
  System.out.println("Enter the interval for Afternoon=");
  int afternoonIntervals = in.nextInt();
  int maxHour=12;
   for (int i=1;i<=5;i++) {
     System.out.println("DAY-"+i);
     for (int j=0;j<morningIntervals+afternoonIntervals;j++){
       if(j<morningIntervals){
         int morningStartTime=morningStart+j;
         int morningEndTime=morningStartTime+1;
        System.out.println(morningStartTime+"-"+morningEndTime);
      }
      else{
         int afternoonStartTime=(afternoonStart+(j-morningIntervals))%maxHour;
	 int afternoonEndTime=(afternoonStartTime+1)%maxHour;
	if(afternoonStartTime==0)
	afternoonStartTime=12;
	if(afternoonEndTime==0)
	afternoonEndTime=12;
	System.out.println(afternoonStartTime+"-"+afternoonEndTime);
	}
       }
     }
  }
}
