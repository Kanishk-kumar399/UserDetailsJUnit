package com.capgemini.UserRegistrationProject;
public class UserRegistration 
{
	public String checkFirstName(String firstName) throws UserRegistrationException
	{
		String regex="^[A-Z][a-z]{2,}";
		if(firstName.matches(regex))
			return "Happy";
		else
			throw new UserRegistrationException("Invalid First name");
	}
	public String checkLastName(String lastName) throws UserRegistrationException
	{
		String regex="^[A-Z][a-z]{2,}";
		if(lastName.matches(regex))
			return "Happy";
		else
			throw new UserRegistrationException("Invalid Last Name");
	}
	public String checkMobileNumber(String MobileNumber) throws UserRegistrationException
	{
		String regex="^(\\d{2})\\s{1}\\d{10}";
		if(MobileNumber.matches(regex))
			return "Happy";
		else
			throw new UserRegistrationException("Invalid Mobile Number");
	}
	public String checkPassword(String password) throws UserRegistrationException
	{
		String regex="(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9 ]).{8,}";
		if(password.matches(regex))
			return "Happy";
		else
			throw new UserRegistrationException("Invalid PassWord ! Re-Enter");
	}
    public String checkEmail(String emailId) throws UserRegistrationException
    {
    	String regex="^[0-9a-zA-Z]+([+._-]{1}[0-9a-zA-Z]+)?@[0-9a-zA-Z]+[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-z]{2,3})?$";
    	if(emailId.matches(regex))
			return "Happy";
		else
			throw new UserRegistrationException("Invalid EmailId");
    }
    public boolean checkMultipleEmail(String email)
    {
    	return email.matches("^[0-9a-zA-Z]+([+._-]{1}[0-9a-zA-Z]+)?@[0-9a-zA-Z]+[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-z]{2,3})?$");
    }
}
