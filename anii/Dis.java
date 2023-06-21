
package anii;
import java.util.Scanner;
public class Dis{
public  void display() {
int a ;
System.out.println("Quantity of purchased");

Scanner x =new Scanner(System.in);
a= x.nextInt();
if((a*200)>2000){
	//System.out.println("Congratulation you got 20% discount : "+  (.1*a*200)
	//+" your total cost is  : " + (a*200-(.1*a*200)));	
	System.out.println("your total cost is:  "+ a*200 );
	System.out.println("Congratulation you got 20% discount : "+  (.1*a*200));
	System.out.println("After discount your total cost is  : " + (a*200-(.1*a*200)));	;
}
else{
	System.out.println("No Discount");

}
}

}
