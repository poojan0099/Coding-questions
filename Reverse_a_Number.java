package practice_programs;

import java.util.Scanner;

public class Reverse_a_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter a Number to Reverse it: ");
		num = sc.nextInt();
		int check_num = num;
		
		int rem;
		int sum = 0;
		
		while(num>0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num/10;
		}
		
		System.out.println("Reversed Number is :"+sum);
	
		if(sum == check_num)
		{
			System.out.println("IT IS A PALINDROME");
		}
		else {
			System.out.println("IT IS NOT A PALINDROME");
		}
		sc.close();

	}

}
