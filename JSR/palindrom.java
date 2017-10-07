import java.io.*;
import java.util.*;
//check the two str anagram
public class palindrom {
	static boolean A(char[] a1){		
		int[] c1 = new int[256];

		for (int i = 0;i < a1.length; i++ ) {
			c1[a1[i]]++;
		}
		int count = 0;

		for (int i = 0;i < 256; i++) {
			if (c1[i]%2 !=0) {
			 	count++;
			} 
		}
		if (count > 1) {
			return false;			
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "geekforgeek";

		char[] a1 = s1.toCharArray();	
	    if (A(a1)) {
	    	System.out.println("Yes It is");	    	
	    }
	    else{
	    	System.out.println("No they are not anagram");
	    }
	}
} 