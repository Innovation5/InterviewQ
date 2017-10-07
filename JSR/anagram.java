import java.io.*;
import java.util.*;
//check the two str anagram
public class anagram {

	static boolean A(char[] a1, char[] a2){		
		int[] c1 = new int[256];
		for (int i = 0;i<a1.length && i < a2.length; i++ ) {
			c1[a1[i]]++;
			c1[a2[i]]--;
		}
		for (int i = 0;i < 256; i++) {
			if (c1[i] != 0) {
			 	return false;
			} 
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listrn";
		char[] a1 = s1.toCharArray();	
	    char[] a2 = s2.toCharArray();
	    if (a1.length == a2.length && A(a1,a2) ) {
	    	System.out.println("Yes It is");	    	
	    }
	    else{
	    	System.out.println("No they are not anagram");
	    }
	}
} 