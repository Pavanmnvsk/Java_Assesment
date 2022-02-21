package com.org.gen.Assignment;
import java.util.*;
public class Password {
    static int ValidatePassword(String a)
    {
    	  if (a.length() >= 8) {
    	      if (a.contains("#") || a.contains("@") || a.contains("_")) {
    	        char c = a.charAt(0);
    	        //System.out.println(c);
    	        if (Character.isAlphabetic(c)) {
    	          char dd = a.charAt(a.length() - 1);
    	          
    	          if ((Character.isAlphabetic(dd)) || (Character.isDigit(dd)))

    	          {
    	            if (a.matches(".[0-9]{1,}.")
    	                || a.matches(".[a-zA-Z]{1,}.")) {

    	             return 1;

    	            } else{
    	            	 return -1;
    	            }
    	          } else{
    	        	  return -1;
    	          }
    	        }
    	         else{
    	            return -1;
    	          }
    	      } else{
    	    	  return -1;
    	      }

    	    } else{
    	    	return -1;
    	    }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    String s = sc.next();
		   int r= ValidatePassword(s);
		   System.out.println(r);
		   sc.close();
	}

}
