package com.capg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrtion {
	public static void main(String[] args) {System.out.println("Welcome to User Registration Wizard");
	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter First name ");
	String firstName = sc.nextLine();
	Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	Matcher matcher = pattern.matcher(firstName);
	boolean matchfound = matcher.find();
	
	if(matchfound) {
		System.out.println("Match found");
	}
	else {
		System.out.println("Incorrect name " + "\n" + "Correct name should start with Capital letter and should have min 3 charcatersall in small.");
	}		
	sc.close();}
}
	
