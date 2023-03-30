package com.nagarro.Assign3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class Assign3ApplicationTests {

	@Test
	public void add() {
		Controller op=new Controller();
		int expected=13;
		int actual=op.add(6, 7);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void sub() {
		Controller op=new Controller();
		int expected=7;
		int actual=op.sub(14, 7);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void mul() {
		Controller op=new Controller();
		int expected=12;
		int actual=op.mul(6, 2);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void div() {
		Controller op=new Controller();
		int expected=2;
		int actual=op.div(6, 3);
		
		assertEquals(expected,actual);
	}

}
