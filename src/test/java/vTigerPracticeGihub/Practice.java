package vTigerPracticeGihub;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {

	@Test(priority = 1)
	public void printSomething()
	{
		System.out.println("Jay Bhim");
		Reporter.log("JayBhim");
	}
	
	@Test(priority = 2)
	public void printSomeThingElse()
	{
		System.out.println("Jor Se Bolo Jai Mata Di");
	}
}
