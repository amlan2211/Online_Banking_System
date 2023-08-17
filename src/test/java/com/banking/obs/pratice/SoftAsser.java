package com.banking.obs.pratice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsser 
{
@Test
public void Softassert()
{
	System.out.println("--step1---");
	System.out.println("---step2---");
	System.out.println("---step3---");
	String A="Online Banking System";
	String B="Online Banking ";
	SoftAssert sa =new SoftAssert();
	sa.assertEquals(A, B);
	System.out.println("---step4---");
	System.out.println("---step5----");
	sa.assertAll();
	
}
@Test
public void Sample()
{
	System.out.println("--step6----");
	System.out.println("----step7---");
	SoftAssert sa= new SoftAssert();
	int a=10;
	sa.assertNull(a);
	sa.assertAll();
	}
}
