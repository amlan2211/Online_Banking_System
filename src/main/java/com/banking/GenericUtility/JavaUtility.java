package com.banking.GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility 
{
 public int  getRandomNo()
 {
	 Random ran=new Random();
	 int random=ran.nextInt();
	 return random;
 }
 public String SystemDate()
 {
	 Date d=new Date();
	 String date=d.toString();
	 return date;
 }
 public String getSystemDateInformat()
 {
	 SimpleDateFormat dateformat= new SimpleDateFormat("dd/mm/yyyy");
	 Date d= new Date();
	 String systemdateformat=dateformat.format(d);
	 return systemdateformat;
 }
}
