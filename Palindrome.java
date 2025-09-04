package com.codegnan.ControlStatements;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=ob.nextInt();
		int a=num;
		int res=0;
		while(num>0) {
		 int num1=num%10;
		 res=res*10+num1;
			num/=10;
		}
		if(res==a) {
			System.out.println("Palindrome Number");
		}
		else 
			System.out.println("Not Palindrome Number");
		ob.close();

	}

}
