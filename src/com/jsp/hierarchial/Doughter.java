package com.jsp.hierarchial;

public class Doughter extends Father
{
  public void scotty()
  {
	  System.out.println("activa 4g");
  }
  public static void main(String[] args) {
	Doughter d = new Doughter();
	d.scotty();
	d.bankbal();
}
}
