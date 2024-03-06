package com.jsp.hybrid;

public class Son extends Father
{
 public void bike()
 {
	 System.out.println("pulsar 220");
 }
 public static void main(String[] args) 
 {
	 Son s = new Son();
	 s.bike();
	 s.car();
	 s.land();
 }
 
 
}
