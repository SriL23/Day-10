package com.codegnan.ControlStatements;
import java.util.Scanner;
public class SumofDigits {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a Digit: ");
		int num=ob.nextInt();
		int num1=0;
		int sum=0;
		while(num!=0) {
			num1=num%10;
			sum+=num1;
			num/=10;
		}
		System.out.println("Sum of a Digit is : "+sum);
        ob.close();
	}

}
