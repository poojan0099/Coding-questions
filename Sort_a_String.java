package practice_programs;

import java.util.Arrays;

public class Sort_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "ZYXCBA";
		String b = a.toLowerCase();
		
		char[] aa = b.toCharArray();
		
		char temp;
		int i = 0;
		for ( i = 0; i < aa.length; i++) {
			for(int j = i+1; j < aa.length; j++)
			{
				if(aa[i] > aa[j]) {
					temp = aa[j];
					aa[j] = aa[i];
					aa[i] = temp;
			}
		}
		
		}
		System.out.println(Arrays.toString(aa));
	}

}
