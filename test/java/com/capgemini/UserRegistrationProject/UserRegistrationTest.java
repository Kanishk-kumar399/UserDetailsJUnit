package com.capgemini.UserRegistrationProject;

import org.junit.Test;
import org.junit.Assert;
public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnHappy() {
		UserRegistration user= new UserRegistration();
		String result=user.checkFirstName("Kanishk");
		Assert.assertEquals("Happy",result);
	}
	@Test
	public void givenFirstName_WhenImProper_ShouldReturnSad() {
		UserRegistration user= new UserRegistration();
		String result=user.checkFirstName("sdishk");
		Assert.assertEquals("Sad",result);
	}
	@Test
	public void givenlastName_WhenProper_ShouldReturnHappy() {
		UserRegistration user=new UserRegistration();
		String result=user.checkLastName("Kumar");
		Assert.assertEquals("Happy",result);
	}
	@Test
	public void givenlastName_WhenImProper_ShouldReturnSad() {
		UserRegistration user=new UserRegistration();
		String result=user.checkLastName("@mar");
		Assert.assertEquals("Sad",result);
	}
	@Test
	public void givenEmail_WhenValid_ShouldReturnhappy()
	{
		UserRegistration user=new UserRegistration();
		String result=user.checkEmail("kanishk@gmail.com");
		Assert.assertEquals("Happy",result);
	}
	@Test
	public void givenEmail_WhenInValid_ShouldReturnSad() 
	{
		UserRegistration user=new UserRegistration();
		String result=user.checkEmail("kanish..ail.com");
		Assert.assertEquals("Sad",result);
	}
	@Test
	public void givenMobileNumber_WhenTrue_ShouldReturnHappy()
	{
		UserRegistration user=new UserRegistration();
		String result=user.checkMobileNumber("91 9673648343");
		Assert.assertEquals("Happy",result);	
	}
	@Test
	public void givenMobileNumber_WhenWrong_ShouldReturnSad()
	{
		UserRegistration user=new UserRegistration();
		String result=user.checkMobileNumber("9678343");
		Assert.assertEquals("Sad",result);
	}
	@Test
	public void givenPassword_WhenCorrect_ShouldReturnhappy()
	{
		UserRegistration user=new UserRegistration();
		String result=user.checkPassword("Kanishk1*");
		Assert.assertEquals("Happy",result);	
	}
	@Test
	public void givenPassword_WhenWrong_ShouldReturnSad()
	{
		UserRegistration user=new UserRegistration();
		String result=user.checkPassword("Kasa1");
		Assert.assertEquals("Sad",result);
	}
}
