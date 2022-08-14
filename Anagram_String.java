package practice_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String x, y;
		
		System.out.println("Enter String 1: ");
		x = sc.next();
		System.out.println("Enter String 2: ");
		y = sc.next();
		
		char[] arr_x = x.toCharArray();
		char[] arr_y = y.toCharArray();
		
		int length_x = arr_x.length;
		int length_y = arr_y.length;
		
		if(length_x != length_y)
		{
			System.out.println("Not Anagram");
		}
		
		Arrays.sort(arr_x);
		Arrays.sort(arr_y);
		
		boolean check_anagram = false;
		for (int i = 0; i < arr_y.length; i++) {
			if(arr_y[i] == arr_x[i])
			{
				check_anagram = true;
			}
			else {
				check_anagram = false;
			}
		}
		if(check_anagram)
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}
