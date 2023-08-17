package com.banking.obs.pratice;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class Asser 
{ 
	@Test
	public void hardassert()
	{
  System.out.println("----step 1---- ");
  System.out.println("---step2----");
  System.out.println("---step3-----");
  assertEquals("A", "B", "this is not similar");
  
  System.out.println("----step4----");
  System.out.println("----step5-----");}
  @Test
  public void sample()
  {
	System.out.println("----step6----");  
	System.out.println("---step7-----");
	int a=10;
	assertNull(a);
	System.out.println("----step8-----");
  }
  
}
