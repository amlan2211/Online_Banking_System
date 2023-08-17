package com.banking.testng;

import javax.annotation.Priority;

import org.testng.annotations.Test;

public class TestNg 
{
   @Test()
   public void CreateData()
   {
//	   int[] arr= {1,2,3,4,5};
//	   System.out.println(arr[5]);
	   System.out.println("data is --created");
   }
   @Test(priority=1,dependsOnMethods ="CreateData")
   public void editdata() 
   {
	   System.out.println("data is edited");
   }
   @Test()
   public void deleteTest()
   {
	   System.out.println("Delete data ");
   }
   
}
