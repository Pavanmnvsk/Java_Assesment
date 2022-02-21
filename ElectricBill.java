package com.org.gen.Assignment;
import java.util.*;
public class ElectricBill {
	public static int CaluclateElectricitybil(String s1, String s2, int e) {
	    int n1 = Integer.parseInt(s1.substring(5, s1.length()));
	    int n2 = Integer.parseInt(s2.substring(5, s2.length()));
	    int n = Math.abs((n2 - n1) * e);
	    return n;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		    Scanner sc = new Scanner(System.in);
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    int n = sc.nextInt();
		    int c = CaluclateElectricitybil(s1, s2, n);
		    System.out.println(c);
		    sc.close();
	}

}
