package com.codegnan.ControlStatements;
import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int num=ob.nextInt();
		int count=0;
		while(num!=0) {
			num/=10;
			count++;}
			System.out.println("The Count of Given Number is: "+count);
		ob.close();	

	}

}
