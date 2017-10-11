import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyStackTest {


	@Test 
	public void testPush()
	   {
		MyStack<String> stack = new MyStack<String>();
	      stack.push ("hello");
	      stack.push ("world");
	      assertEquals (stack.peek(), "world");
	   }

	@Test
	public void testPop()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push("bo");
		stack.push("hi");
		stack.pop();
		assertEquals(stack.peek(), "bo");
	}

	@Test
	public void testPush2()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push("Bo");
		stack.push("wang");
		assertEquals(stack.peek(),"wang");
	}

	@Test
	public void testPopEmpty()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push("bo");
		stack.push("hi");
		stack.pop();
		stack.pop();
		assertEquals(stack.empty(), true);
	}

	@Test
	public void testPopTwo()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push("bo");
		stack.push("wang");
		stack.push("china");
		stack.pop();
		stack.pop();
		assertEquals(stack.peek(), "bo");
	}

	@Test
	public void testClearall()
	{
		MyStack <String> stack = new MyStack<String>();
		stack.push("bo");
		stack.push("wang");
		stack.clear();
		assertEquals(stack.size(), 0);
	}


	@Test
	public void testSize()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push("bo");
		assertEquals(stack.size(), 1);
	}

	@Test
	public void testEmpty() //check that stack is empty upon initialization
	{
		MyStack<String> stack = new MyStack<String>();
		assertEquals(stack.size(), 0);
	}

	@Test
	public void testPop1()
	{
		MyStack <String> stack = new MyStack<String>();
		stack.push("bo");
		stack.pop();
		assertEquals(stack.size(), 0);
	}

	@Test
	public void testClear()
	{
		MyStack <String> stack = new MyStack<String>();
		stack.push("bo");
		stack.clear();
		assertEquals(stack.size(), 0);
	}	

	@Test
	public void testClearEmptyStack()
	{
		MyStack <String> stack = new MyStack<String>();
		stack.clear();
		assertEquals(stack.size(), 0);
	}

	@Test
	public void failingTest() {
    assertTrue(false);
}


}
