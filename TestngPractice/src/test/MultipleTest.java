package test;

import org.testng.annotations.Test;

public class MultipleTest{
  @Test(priority=-1)
  public void FirstTest()
  {
	  System.out.println("This is First test");
  }
  @Test(priority=0)
  public void secondTest()
  {
	  System.out.println("This is 2nd test");
  }
@Test(priority=1)
  public void thirdTest()
  {
	  System.out.println("This is 3rd test");
  }
@Test(priority=2)
  public void fourTest()
  {
	  System.out.println("This is 4th test");
  }
@Test
public void test1()
{
	System.out.println("This test without priority");
}
  
  
 
}
