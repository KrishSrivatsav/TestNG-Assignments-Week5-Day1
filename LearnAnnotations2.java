package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations2 {
  @Test
  public void test4() {
	  System.out.println("Test4");
  }
	
  public void test5() {
	  System.out.println("Test5");
  }
	
	  
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before Test");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after Test");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
	  
  }

}
