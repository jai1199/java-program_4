package com.jsp;

public class Sample extends Demo 
{
  public static void disp()
  {
	System.out.println("disp of sample");  
  }
  public void run()
  {
	  System.out.println("run method");
  }
 public static void main(String[] args) 
 {
	 Demo d = new Demo();
	// d.test2();
	 System.out.println(d.name);
	 Sample s = new Sample();
	 s.run();
	 s.test2();
	 System.out.println(s.name);
	test();
	disp();
	System.out.println(Demo.a);
 }
  
}
