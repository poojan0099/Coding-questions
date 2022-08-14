package practice_programs;

import java.util.Scanner;

public class Count_Zeros_Ones_AnyDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to count zero's and one's inside it: ");
		long a = sc.nextInt();
		int zero = 0;
		int one = 0;
		
		while(a != 0)
		{
			long rem = a % 10;
			if(rem == 0)
			{
				zero++;
			}
			if(rem == 1)
			{
				one++;
			}
			a = a / 10;
		}
		System.out.println("Number of one's :"+one);
		System.out.println("Number of zero's :"+zero);
		sc.close();

	}

}
