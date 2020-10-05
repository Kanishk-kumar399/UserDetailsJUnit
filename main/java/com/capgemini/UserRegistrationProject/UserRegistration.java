package com.capgemini.UserRegistrationProject;
public class UserRegistration 
{
	public String checkFirstName(String firstName)
	{
		String regex="^[A-Z][a-z]{2,}";
		if(firstName.matches(regex))
			return "Happy";
		else
			return "Sad";
	}
	public String checkLastName(String lastName)
	{
		String regex="^[A-Z][a-z]{2,}";
		if(lastName.matches(regex))
			return "Happy";
		else
			return "Sad";
	}
	public String checkMobileNumber(String MobileNumber)
	{
		String regex="^(\\d{2})\\s{1}\\d{10}";
		if(MobileNumber.matches(regex))
			return "Happy";
		else
			return "Sad";
	}
	public String checkPassword(String password)
	{
		String regex="(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9 ]).{8,}";
		if(password.matches(regex))
			return "Happy";
		else
			return "Sad";
	}
    public String checkEmail(String emailId)
    {
    	String regex="[0-9a-zA-Z]+([+._-][0-9a-zA-Z]+)*"+"@([0-9a-zA-Z][-]?)+[.][a-zA-z]{2,4}$";
    	if(emailId.matches(regex))
			return "Happy";
		else
			return "Sad";
    }
}
