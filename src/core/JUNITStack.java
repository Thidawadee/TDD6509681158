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
	
	public void testPushElmTOTop() {
		Stack s2 = new Stack();
		assertFalse(s2.isFull());
		s2.push(new Integer(1));
		s2.top();
		int tope = (Integer)s2.top();
		assertEquals(1, tope);
		
	}
	
	public void  testLastInFirstOut(){
		Stack s3 = new Stack();
		s3.push(1);
		s3.push(2);
		s3.push(3);
		
		s3.pop(s3);
		assertTrue(s3.isEmty());
	}
	

}