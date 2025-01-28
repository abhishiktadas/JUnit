package JUnitTestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Codes.Math_Expression;

class Math_Expression1 
{

	Math_Expression me = new Math_Expression();
	
	@Test
	void test() 
	{
		assertEquals(5,me.add(2,3));
		//System.out.println(i);
	}

	@Test
	void test1() 
	{
		int i = me.sub(2,3);
		System.out.println(i);
	}

}
