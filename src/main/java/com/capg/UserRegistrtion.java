package com.capg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrtion {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Wizard");
		Scanner sc =  new Scanner(System.in);
		
			for(int i = 0;i<1;) {	
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
			
			for(int i = 0;i<1;) {
				System.out.println("Enter Last name ");
				String lastName = sc.nextLine();
				Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
				Matcher matcher = pattern.matcher(lastName);
				boolean matchfound = matcher.find();
				if(matchfound) {
					System.out.println("Valid Last Name");
					i=1;
					}
				else {
					System.out.println("Incorrect name " + "\n" + "Correct name should start with Capital letter and should have min 3 charcaters and all in small.");
				}		
			}
			
			for(int i = 0;i<1;) {	
				System.out.println("Enter E-mail Id ");
				String firstName = sc.nextLine();
				Pattern pattern =Pattern.compile("^[a-z]{3,}([-+-.]{1}[a-zA-Z0-9]{3})?@[a-z]{2,}\\.[a-z]{2,4}(\\.[a-z]{2})?$");
				Matcher matcher = pattern.matcher(firstName);
				boolean matchfound = matcher.find();
				if(matchfound) {
					System.out.println("Valid Email Id");
					i=1;
				}
				else {
					System.out.println("Incorrect Email Id " + "\n" + "Correct Email Id should contain" + "\n" + 
										"1. All Lower case " + "\n" + "2. Proper TLD" + "3. Special Chracters like"
										+ " +,-,.,_ can only be added after 3 lower case chracter");
				}		
			}
			for(int i = 0;i<1;) {	
				System.out.println("Enter Mobile No ");
				String firstName = sc.nextLine();
				Pattern pattern =Pattern.compile("^[0-9]{2}\\s[1-9]{1}[0-9]{9}$");
				Matcher matcher = pattern.matcher(firstName);
				boolean matchfound = matcher.find();
				if(matchfound) {
					System.out.println("Valid Mobile Id");
					i=1;
				}
				else {
					System.out.println("Incorrect Mobile No " + "\n" + "Correct Mobile no should be like 91 9494949494 ie country code + space + 10 digit mobile no");
				}		
			}
			
			for(int i = 0;i<1;) {	
				System.out.println("Enter password of your choice: ");
				String firstName = sc.nextLine();
				Pattern pattern =Pattern.compile("^[0-9a-zA-Z]{8,}");
				Matcher matcher = pattern.matcher(firstName);
				boolean matchfound = matcher.find();
				if(matchfound) {
					System.out.println("Valid Mobile Id");
					i=1;
				}
				else {
					System.out.println("Incorrect Password ");
				}		
			}
			sc.close();
		}
	}