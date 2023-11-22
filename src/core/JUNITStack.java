package core;

import org.junit.Assert;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCteateNewEmtyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmty());
	}
	
	public void push() {
		Stack s2 = new Stack();
		s2.push(1);
		s2.top();
		assertEquals(1, s2.top());
		
	}
}