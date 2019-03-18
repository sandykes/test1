package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day3 {

	private String actul;
	@Test
	public void Login()
	{
		System.out.println("This is Car function");
	}
	@Test
	public void Register()
	{
		System.out.println("This is apply method");
		
		String expected="some";
		String actual="Some";
		Assert.assertEquals(actual, expected);
	}
}
