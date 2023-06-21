/*5.
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade
*/
package grading; 
import java.util.Scanner;
public class Grad{
public void ing(){
int marks;
System.out.println("Enter Your Marks");
Scanner m = new Scanner(System.in);
marks =m.nextInt();
if(marks>80){
System.out.println("Grade is A :"+" "+marks +" %"+"Pass" );
}
else if((marks<80)&&(marks>60)){
System.out.println("Grade is B :"+" "+marks +"%"+"Pass" );
}
else if((marks<60)&&(marks>50)){
System.out.println("Grade is C :"+" "+marks +" %"+"Pass" );
}
else if((marks<50)&&(marks>45)){
System.out.println("Grade is D :"+" "+marks+"%"+"Pass" );
}
else if((marks<45)&&(marks>=33)){
System.out.println("Grade is E :"+" "+marks +"%"+"Pass" );
}
else{System.out.println("Grade is F :"+" "+marks +" %"+"\nYour are Failed" );
}
}	
}