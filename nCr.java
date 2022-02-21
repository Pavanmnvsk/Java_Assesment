package com.org.gen.Assignment;
import java.util.*;

public class nCr {
	static int fact(int n)
	{
		int res = 1;
		for (int i = 2; i <= n; i++)
			res = res * i;
		return res;
	}
     static int caluclatenCr(int n,int r)
    {	
      return fact(n) / (fact(r) *fact(n - r));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int r=sc.nextInt();
         System.out.println(caluclatenCr(n, r));
         sc.close();
	}

}
