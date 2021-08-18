package com.jbk.assignment3.packageex;

public class Staticex {
	static int a=20;
		 static double add(double num1,double num2){

			return num1+num2;
		}
			
		public static void main(String[] args) {
	
			System.out.println(add(1.00,3.00));
			System.out.println(add(1.00,3.00,3.5));
			System.out.println(a);
			
			//static members can be called by static methods only without creating object
		//System.out.println(m1(15));
			
		}
		
		 static double add(double num1,double num2,double num3){

			return num1+num2;
		}
		 
		/* int m1(){
			System.out.println("Kalyani"); 
			
		 }*/
}
