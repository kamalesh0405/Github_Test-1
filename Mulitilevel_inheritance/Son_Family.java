package com.Mulitilevel_inheritance;

public class Son_Family extends Father_Family {
	String MyName = "Kamalesh";
	String MyWife = "Divyadharshini";
	int MyAge = 28;
	int WifeAge  =24;
	
	public void display_Son() {
		System.out.println("MY NAME:"+MyName+" "+  "Age :"+ MyAge );
		System.out.println("MY WIFE:"+MyWife + " "+ "Age :"+ WifeAge );   
		
	}

	public static void main(String[] args) {
		Son_Family kd = new Son_Family();
		kd.display_GrandFather();
		kd.display_Father();
		kd.display_Son();
		
		
	

	
		// TODO Auto-generated method stub

	}

}
