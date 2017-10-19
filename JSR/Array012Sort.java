// 0 1 2 number contains array sorted in order of O(n)
import java.util.*;

public class Array012Sort {
	public static void main(String[] args) {
		int []a = {1,0,1,2,0,1,0};
		sort(a);
		for (int i =0;i <a.length ;i++ ) {
			System.out.print(a[i] +" ");
		}
	}


	static void sort(int[] a) {
		int l = 0;
		int m = 0;
		int h = a.length-1;
		while(m < h) {
			switch(a[m]) {
				case 0:
				{	int temp = a[m];
					a[m] = a[l];
					a[l] = temp;
					l++;
					m++;
					break;
				}	
				
				case 1 :
					m++;
					break;

				case 2: 
				{
					int temp = a[m];
					a[m] = a[h];
					a[h] = temp;
					h--;
					break;
				}
			}
		}
	}
}