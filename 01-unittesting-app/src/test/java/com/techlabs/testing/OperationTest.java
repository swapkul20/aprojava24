package com.techlabs.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationTest {
	
	Operation operation;
	
	@BeforeEach
	void init()
	{
		operation=new Operation();
		
	}

	@Test
	void testAddition() {
		
		assertEquals(20,operation.addition(10, 10),"Performing Addition");
	}

}
