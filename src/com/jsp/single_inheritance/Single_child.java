package com.jsp.single_inheritance;

public class Single_child extends Single_parent
{
 public void cycle()
 {
	 System.out.println("herculus");
 }
 public static void main(String[] args) 
 {
	Single_child c = new Single_child();
	c.cycle();
	c.bike();
 }
 
}
