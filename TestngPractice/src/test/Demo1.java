package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
@Parameters( {"URL"} )

@Test
public void test1(String Urlname)
	{
		System.out.println("How are you?");
		System.out.println(Urlname);
		
	}
@Test(dataProvider="getData")
public void test2(String uname,String pwd)
{
	System.out.println("hi");
	System.out.println(uname);
	System.out.println(pwd);
}
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[3][2];
	data[0][0]="First@test.com";
	data[0][1]="pwd12";
	data[1][0]="test@mail.com";
	data[1][1]="pwd2";
	data[2][0]="est@gmail.com";
	data[2][1]="pwd567";
	return data;
			
}

}
