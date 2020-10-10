package com.capgemini.UserRegistrationProject;
import java.util.*;
@FunctionalInterface
interface NewUserValidationInterface
	{
		boolean validate(String userInput);
	}
public class UserRegistration 
{
	NewUserValidationInterface checkFirstName = firstName -> firstName.matches("^[A-Z][a-z]{2,}");
	NewUserValidationInterface checkLastName = lastName -> lastName.matches("^[A-Z][a-z]{2,}");
	NewUserValidationInterface checkEmail = emailId -> emailId.matches("^[0-9a-zA-Z]+([+._-]{1}[0-9a-zA-Z]+)?@[0-9a-zA-Z]+[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-z]{2,3})?$");
	NewUserValidationInterface checkMobileNumber = mobileNo -> mobileNo.matches("^(\\d{2})\\s{1}\\d{10}");
	NewUserValidationInterface checkPassword = password -> password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9 ]).{8,}");
	public boolean checkFirstName(String firstName) throws UserRegistrationException
	{
		if(checkFirstName.validate(firstName))
			return true;
		else
			throw new UserRegistrationException("Invalid First name");
	}
	public boolean checkLastName(String lastName) throws UserRegistrationException
	{
		if(checkLastName.validate(lastName))
			return true;
		else
			throw new UserRegistrationException("Invalid Last Name");
	}
	public boolean checkMobileNumber(String MobileNumber) throws UserRegistrationException
	{
		if(checkMobileNumber.validate(MobileNumber))
			return true;
		else
			throw new UserRegistrationException("Invalid Mobile Number");
	}
	public boolean checkPassword(String password) throws UserRegistrationException
	{
		if(checkPassword.validate(password))
			return true;
		else
			throw new UserRegistrationException("Invalid PassWord ! Re-Enter");
	}
    public boolean checkEmail(String emailId) throws UserRegistrationException
    {
    	if(checkEmail.validate(emailId))
			return true;
		else
			throw new UserRegistrationException("Invalid EmailId");
    }
    public boolean checkMultipleEmail(String email)
    {
    	return email.matches("^[0-9a-zA-Z]+([+._-]{1}[0-9a-zA-Z]+)?@[0-9a-zA-Z]+[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-z]{2,3})?$");
    }
    public static void main( String[] args ) 
    {
		UserRegistration obj = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name: ");
		String firstName=sc.nextLine();
		try {
			if(obj.checkFirstName(firstName))
				System.out.println("Valid First Name");
		}
		catch(UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Last Name: ");
		String lastName=sc.nextLine();
		try {
			if(obj.checkLastName(lastName))
				System.out.println("Valid Last Name");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Email ID: ");
		String emailId=sc.nextLine();
		try 
		{
			if(obj.checkEmail(emailId))
				System.out.println("Valid Email Id");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Mobile No: ");
		String mobileNo = sc.nextLine();
		try 
		{
			if(obj.checkMobileNumber(mobileNo))
				System.out.println("Valid Mobile No");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Password: ");
		String password=sc.nextLine();
		try 
		{
			if(obj.checkPassword(password))
				System.out.println("Valid Password");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}
}
