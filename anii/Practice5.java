package anii;
import java.util.Scanner;

//public class Practice5 {
//
//    public static void main(String[] args) {
//        // A student will not be allowed to sit in exam if his/her attendence is less than 75%
//        
//        Scanner S = new Scanner(System.in);
//        int Ca,Ch;
//        boolean medical;
//        System.out.println("Enter number of class attendend");
//         Ca = S.nextInt();
//        
//        System.out.println("Enter number of class held");
//        Ch = S.nextInt();    
//         System.out.println("Did student have any medical cause \"true or false?\"");
//         medical = S.nextBoolean();
//        
//        if(Ca*75/100 <Ch ) {
//                System.out.println("You are allowed to sit in exam with "+(Ca*100/Ch) +" Percentage of attendence");
//        } else if (medical) {
//            System.out.println("You are allowed to sit in exam with "+(Ca*100/Ch) +" Percentage of attendence");
//        }
//        else {
//            System.out.println("You are not allowed to sit in exam with "+(Ca*100/Ch) + " Percentage of attendance");
//        }
//        
//    }
//
//}\
public class Practice5 {

    public static void main(String[] args) {
        // A student will not be allowed to sit in exam if his/her attendence is less than 75%
        
        Scanner S = new Scanner(System.in);
        
        System.out.println("Enter number of class attendend");
        float Ca = S.nextFloat();
        
        System.out.println("Enter number of class held");
        float Ch = S.nextFloat();
        
        System.out.println("Did student have any medical cause \"true or false?\"");
        boolean medical = S.nextBoolean();
        
        if(Ca/Ch*100 >75 ) {
                System.out.println("You are allowed to sit in exam with "+Ca/Ch*100 +" Percentage of attendence");
        }
        
        else if (medical) {
            System.out.println("You are allowed to sit in exam with "+Ca/Ch*100 +" Percentage of attendence");
        }
        
        else {
            System.out.println("You are not allowed to sit in exam with "+ Ca/Ch*100 + " Percentage of attendance");
        }
        
    }

}