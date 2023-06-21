/*A company decided to give bonus of 5% to employee if his/her
 year of service is more than 5 years.Ask user for their salary 
 and year of service and print the net bonus amount.
 Date:-22-01-23
*/
package anii;
import java.util.Scanner;
public class Emp{
	public void salry(){
		System.out.println("Enter your salary and year(from howmany year are you working)");
		int salary;
		int year;
		double d;
		Scanner sc = new Scanner(System.in);
		salary = sc.nextInt();
		year = sc.nextInt();
		
		if(year>=5){
			System.out.println("your salary :"+(salary) + 
			"\ncongratulation you got 5% bonus :"+ (salary*0.05) +
			"\ntotal salary :" + (salary + (salary*0.05)));
		//	System.out.println("Enter your year and salary");
		}else {
			System.out.println("your salary :"+ salary + "\nno bonus");
			
		}
		
	}
	
}