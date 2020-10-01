package com.capg;

import org.junit.*;

public class JunitTest {
	
	@Test
	public void firstName_Is_True_Return_Type_Happy(){
		try {
			UserRegistrtion obj =new UserRegistrtion();
			String result = obj.firstName("Mehakjit");
			Assert.assertEquals("Valid", result);
		}catch(CoustomException e)  {
	    	Assert.assertEquals("Please enter proper firstname", e.getMessage());
		}
	}
	
	@Test
	public void firstName_Is_False_Return_Type_Sad(){
		try {
			UserRegistrtion obj =new UserRegistrtion();
			String result = obj.firstName("mehakjit");
			Assert.assertEquals("Invalid", result);
		}catch(CoustomException e)  {
	    	Assert.assertEquals("Please enter proper firstname", e.getMessage());
		}
	}
	
	@Test
	public void lastName_Is_True_Return_Type_Happy(){
		try {
			UserRegistrtion obj =new UserRegistrtion();
			String result = obj.lastName("Singh");
			Assert.assertEquals("Valid", result);
		}catch(CoustomException e)  {
			Assert.assertEquals("Please enter proper Lastname", e.getMessage());
		}
	}
	
	@Test
	public void lastName_Is_False_Return_Type_Sad(){
		try {
			UserRegistrtion obj =new UserRegistrtion();
			String result = obj.lastName("singh");
			Assert.assertEquals("Valid", result);
		}catch(CoustomException e)  {
			Assert.assertEquals("Please enter proper Lastname", e.getMessage());
		}
	}
	
	@Test
	public void emailId_Is_True_Return_Type_Happy(){
		try{
			UserRegistrtion obj =new UserRegistrtion();
			String result = obj.emailID("abc@gmail.com");
			Assert.assertEquals("Valid", result);
		}catch(CoustomException e)  {
			Assert.assertEquals("Please enter email", e.getMessage());
		}
	}
	
	@Test
	public void emailId_Is_False_Return_Type_Sad(){
		try{
			UserRegistrtion obj =new UserRegistrtion();
			String result = obj.emailID("ab@c@gma.il.com");
			Assert.assertEquals("Valid", result);
		}catch(CoustomException e)  {
			Assert.assertEquals("Please enter email", e.getMessage());
		}
	}
	
	@Test
	public void mobileNo_Is_True_Return_Type_Happy(){
		try{
			UserRegistrtion obj =new UserRegistrtion();
			String result = obj.mobileNo("91 9041924692");
			Assert.assertEquals("Valid", result);
		}catch(CoustomException e)  {
			Assert.assertEquals("Please valid phone No", e.getMessage());
		}
	}
	
	@Test
	public void mobileNo_Is_False_Return_Type_Sad(){
		try{
			UserRegistrtion obj =new UserRegistrtion();
			String result = obj.mobileNo("91 904192574692");
			Assert.assertEquals("Valid", result);
		}catch(CoustomException e)  {
			Assert.assertEquals("Please valid phone No", e.getMessage());
		}
	}
	
	@Test
	public void password_Is_True_Return_Type_Happy(){
		try{
			UserRegistrtion obj =new UserRegistrtion();
			String result = obj.password("Mehak@123");
			Assert.assertEquals("Valid", result);
		}catch(CoustomException e)  {
			Assert.assertEquals("Password", e.getMessage());
		}
	}
	
	@Test
	public void password_Is_False_Return_Type_Sad(){
		try{
			UserRegistrtion obj =new UserRegistrtion();
			String result = obj.password("mehak@123");
			Assert.assertEquals("Valid", result);
		}catch(CoustomException e)  {
			Assert.assertEquals("Password", e.getMessage());
	}
	}
}
