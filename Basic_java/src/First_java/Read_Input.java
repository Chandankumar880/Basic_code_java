package First_java;
import java.util.Scanner;
public class Read_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 , num2 , add;
		System.out.println("Type any two number for Arithmetic operation: ");
	System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter Second number");
		num2 = sc.nextInt();
		add = num1 + num2;
		System.out.println("Concanate of number equal to " + num1+num2);
		System.out.println("Sum of number equal to " + (num1+num2));
		System.out.println("add of number equal to " + add);
		System.out.println("Sum of number equal to " + (num1-num2));
		System.out.println("Sum of number equal to " + (num1*num2));
		System.out.println("Sum of number equal to " + (num1/num2));
		System.out.println("Sum of number equal to " + (num1%num2));

	}

}
