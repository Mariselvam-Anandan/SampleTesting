package com.org.demo;

import java.util.Scanner;

public class Democlass {

	public static void main(String[] args) {

		System.out.println("Enter your gender:");
		System.out.println("1.Male");
		System.out.println("2.Female");
		System.out.println("3.Other");
		
		Scanner gend = new Scanner(System.in);
		int gd =gend.nextInt();

		if(gd==1|| gd==2 || gd==3)
		{
			if(gd==1)
				System.out.println("Your selected gender as Male");
			else if(gd==2)
				System.out.println("your selected gender as Female");
			else if(gd==3)
				System.out.println("Your selected gender as Others");

			System.out.println("Enter your age:");
			Scanner ag=new Scanner(System.in);
			int as=ag.nextInt();
			if(as>=18) {
				System.out.println("Eligible for vote");
			}
			else if(as<=18) {
				System.out.println("Not eligible for vote");
			}
			else {
				System.out.println("Incorrect value");
			}

		}else {
			System.out.println("Incorrect value");
		}


	}
}
