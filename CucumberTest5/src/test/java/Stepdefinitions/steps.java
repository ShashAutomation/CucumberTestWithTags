package Stepdefinitions;

import io.cucumber.java.en.Given;

public class steps {
	@Given("test1")
	public void test1() {
	   System.out.println("test1");
	}

	@Given("got")
	public void got() {
		 System.out.println("got");
	}

	@Given("Test2 got executed")
	public void test2_got_executed() {
		 System.out.println("Test2 got executed");
	}

	@Given("Test3 got executed")
	public void test3_got_executed() {
		 System.out.println("Test3 got executed");
	}

	@Given("executed")
	public void executed() {
		 System.out.println("executed");
	}
	
	@Given("Test1 and Test2 got executed")
	public void test1_and_test2_got_executed() {
		 System.out.println("Test1 and Test2 got executed");
	}

	
}
