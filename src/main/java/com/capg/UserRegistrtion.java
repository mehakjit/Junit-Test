package com.capg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrtion {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Wizard");
		Scanner sc =  new Scanner(System.in);
		
		int i = 0;
		while(i==0) {	
			System.out.println("Enter First name ");
			String firstName = sc.nextLine();
			Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			Matcher matcher = pattern.matcher(firstName);
			boolean matchfound = matcher.find();
			if(matchfound) {
				System.out.println("Valid First Name");
				i=1;
			}
			else {
				System.out.println("Incorrect name " + "\n" + "Correct name should start with Capital letter and should have min 3 charcaters and all in small.");
			}		
		}
		
		while(i!=0) {
			System.out.println("Enter Last name ");
			String lastName = sc.nextLine();
			Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			Matcher matcher = pattern.matcher(lastName);
			boolean matchfound = matcher.find();
			if(matchfound) {
				System.out.println("Valid Last Name");
				i=0;
				}
			else {
				System.out.println("Incorrect name " + "\n" + "Correct name should start with Capital letter and should have min 3 charcaters and all in small.");
			}		
		}
		
		sc.close();
	}
}

