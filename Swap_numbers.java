package practice_programs;

public class Swap_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Methos 1 uing temp variable
		
		int temp;
		int a = 10, b =20;
		System.out.println("Befor Swapping a =  "+a+", b = "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping a = "+a+", b = "+b);
		
		System.out.println();
		
		//Method 2 using addition subtraction
		int x = 100, y = 200;
		System.out.println("Berfore Swapping x = "+x+", y = "+y);
		
		x = x + y;
		y = x - y;
		x = x - y;
			
		System.out.println("After Swapping x = "+x+", y = "+y);
		System.out.println();
		
		//Method 3 using division and multiplication method
		int p = 5, q = 6;
		System.out.println("Berfore Swapping p = "+p+", q = "+q);
		
		p = p * q;
		q = p / q;
		p = p / q;

		System.out.println("After Swapping x = "+p+", y = "+q);
		System.out.println();
		
		//Method 4 using XOR operation
		int m = 88, n = 99;
		System.out.println("Before Swapping m = "+m+", n = "+n);
		
		m = m ^ n;
		n = m ^ n;
		m = m ^ n;
		
		System.out.println("After Swapping m = "+m+", n = "+n);
		System.out.println();
		
		//Method 5 using +,- logic in single statement
		int u = 11, v = 22;
		System.out.println("Before Swapping u = "+u+" v = "+v);
		
		v = u+v-(u=v);
		System.out.println("After Swapping u = "+u+" v = "+v);
	}

}
