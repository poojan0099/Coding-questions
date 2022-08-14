package practice_programs;

import java.util.Scanner;

public class Reverse_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String a;
		
		System.out.println("Enter a String to Reverse it: ");
		a = sc.next();
		split_method(a);
		String new_str = loop_method(a);
		
		//CHECK FOR PALINDROME
		if(new_str.equals(a))
		{
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
		sc.close();

	}
	
	static void split_method(String x)
	{
		String[] arr = x.split("");
		
		for(int i = arr.length-1; i >= 0; i--)
		{
		
			System.out.print(arr[i]);
		}
		System.out.println("");
	}
	
	static String loop_method(String x)
	{
		String reverse_string = "";
		char ch;
		
		for (int i = 0; i < x.length(); i++)
		{
			ch = x.charAt(i);
			reverse_string = ch + reverse_string;
		}
		return reverse_string;
	}

}
