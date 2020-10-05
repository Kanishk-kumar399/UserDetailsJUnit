package com.capgemini.UserRegistrationProject;

import org.junit.Test;
import org.junit.Assert;
public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration user= new UserRegistration();
		String result=user.checkFirstName("Kanishk");
		Assert.assertEquals("Happy",result);
	}
	@Test
	public void givenlastName_WhenProper_ReturnTrue() {
		UserRegistration user=new UserRegistration();
		String result=user.checkLastName("Kumar");
		Assert.assertEquals("Happy",result);
	}
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue()
	{
		UserRegistration user=new UserRegistration();
		String result=user.checkEmail("kanishk@gmail.com");
		Assert.assertEquals("Happy",result);
	}
	@Test
	public void givenMobileNumber_WhenTrue_ShouldReturnTrue()
	{
		UserRegistration user=new UserRegistration();
		String result=user.checkMobileNumber("91 9673648343");
		Assert.assertEquals("Happy",result);	
	}
	@Test
	public void givenPassword_WhenCorrect_ShouldReturnTrue()
	{
		UserRegistration user=new UserRegistration();
		String result=user.checkPassword("Kanishk1*");
		Assert.assertEquals("Happy",result);	
	}
}
