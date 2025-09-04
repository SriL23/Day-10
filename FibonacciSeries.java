package com.codegnan.ControlStatements;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=ob.nextInt();
		int a=0;
		int b=1;
		System.out.print(a + " " + b +" ");
		for(int i=2;i<num;i++) {
			int c=a+b;
				System.out.print(c + " ");
			a=b;
			b=c;
		}
		ob.close();

	}

}
