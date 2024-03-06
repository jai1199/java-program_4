package com.jsp.hybrid;

public class Doughter extends Father
{
 public void cycle()
 {
	 System.out.println("avon");
 }
 public static void main(String[] args) {
	Doughter d = new Doughter();
	d.cycle();
	d.land();
	d.car();
}
}
