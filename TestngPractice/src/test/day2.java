package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@AfterTest
	public void Login()
	{
		System.out.println("This is Login function");
	}
	@BeforeTest
	public void Register()
	{
		System.out.println("This is Register method");
	}
}
