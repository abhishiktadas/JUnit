package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase1 {

	@BeforeAll
	static void setUpBeforeClass() 
	{
		System.out.println("login to the browser");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		
		System.out.println("close the browser");
	}

	@BeforeEach
	void setUp() 
	{
		
		System.out.println("login");
	}

	@AfterEach
	void tearDown() 
	{
		
		System.out.println("logout");
	}

	@Test
	void test1() 
	{
	
		System.out.println("test the application 1");
	}
	@Test
	void test2() 
	{
	
		System.out.println("test the application 2");
	}

}
