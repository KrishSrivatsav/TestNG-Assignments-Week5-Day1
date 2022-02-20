package week5.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test
	public void create() {
		System.out.println("create");
	}
	
	@Test(priority = 1,invocationCount = 5) //THIS WILL RUN LAST and invocationcount= 10 it will be printed 5 times..
	public void Edit() {
		System.out.println("edit");
	}

	@Test(enabled = true)
	public void Delete() {
		System.out.println("delete");
	}
	
	@Test(enabled = false) //this won't get executed becoz this is set as false
	public void sum() {
		System.out.println("delete");
	}


}
