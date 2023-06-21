package anii;

public class Main {

	  public static void main(String[] args) {

	    // year to be checked
	    int year = 2000;
	    int yea = 2004;
	    int ye = 1900;
	    boolean leap = false;
	      // if the year is divided by 4
	    if (year % 4 == 0) {
	    	leap=false;
	    	
	    	 // if the year is not century
		   

	      // if the year is century
	      if (year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      else
		        leap = true;
	      
	    }
	    
	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	   ////////////////////////////////////////////////////////////// 
	    
	    if (yea % 4 == 0) {

		      // if the year is century
		      if (yea % 100 == 0) {

		        // if year is divided by 400
		        // then it is a leap year
		        if (yea % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      
		      // if the year is not century
		      else
		        leap = true;
		    }
		    
		    else
		      leap = false;

		    if (leap)
		      System.out.println(yea + " is a leap year.");
		    else
		      System.out.println(yea + " is not a leap year.");
		    
		    
		    /////////////////////////////////////////////////
		    if (ye % 4 == 0) {

			      // if the year is century
			      if (ye % 100 == 0) {

			        // if year is divided by 400
			        // then it is a leap year
			        if (ye % 400 == 0)
			          leap = true;
			        else
			          leap = false;
			      }
			      
			      // if the year is not century
			      else
			        leap = true;
			    }
			    
			    else
			      leap = false;

			    if (leap)
			      System.out.println(ye + " is a leap year.");
			    else
			      System.out.println(ye + " is not a leap year.");
//	    if(((year%400==0)&&(year%100==0))||((year%4==0)&&(year%100!=0))){
//	    	System.out.println("THIS YEAR IS LEAP YEAR :"+year);
//	    	}else
//	    	{
//	    	System.out.println("THIS YEAR IS NOT LEAP YEAR :"+year);
//	    	}
//	    if(((yea%400==0)&&(yea%100==0))||((yea%4==0)&&(yea%100!=0))){
//	    	System.out.println("THIS YEAR IS LEAP YEAR :"+yea);
//	    	}else
//	    	{
//	    	System.out.println("THIS YEAR IS NOT LEAP YEAR :"+yea);
//	    	}
//	    if(((ye%400==0)&&(ye%100==0))||((ye%4==0)&&(ye%100!=0))){
//	    	System.out.println("THIS YEAR IS LEAP YEAR :"+ye);
//	    	}else
//	    	{
//	    	System.out.println("THIS YEAR IS NOT LEAP YEAR :"+ye);
//	    	}

	    
	  }
	}
