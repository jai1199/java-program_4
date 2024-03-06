package com.jsp.hierarchial;

public class Son extends Father
{
 public void bike()
 {
	 System.out.println("bullet");
 }
 public static void main(String[] args) {
	Son s = new Son();
	s.bike();
	s.bankbal();
	Father f = new Father();
	f.bankbal();

}
}
