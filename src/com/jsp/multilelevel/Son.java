package com.jsp.multilelevel;

public class Son extends Father
{
 public void cycle()
 {
	 System.out.println("avon");
 }
 public static void main(String[] args) {
	Son s = new Son();
	s.cycle();
	s.bike();
	s.car();
	s.land();
	s.bankbal();
}
 
}
