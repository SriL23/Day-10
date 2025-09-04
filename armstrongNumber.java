package com.codegnan.ControlStatements;
import java.util.*;
public class armstrongNumber {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=ob.nextInt();
		int a=n;
		int sum=0;
		int b=n;
		int count=0;
		while(n>0) {
			n/=10;
			count++;
		}while(a!=0) {
			int rem=a%10;
			sum+=Math.pow(rem,count);
			a/=10;
			
		}
		if(b==sum) {
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("Not Armstrong Number");
		
ob.close();
	}

}
