package com.jbk.assignment2.methodex;

public class Operatorsex2 {
	

	public static void main(String[] args) {
	
		Operatorsex1 op=new Operatorsex1();
			
		int x=op.add(30,20);
		int y=op.sub(55,20);
		int z=op.mul(15,9);
		int m=op.div(30,4);
		int n=op.mod(22,5);
		
		System.out.println("Addition :"+x);
		System.out.println("Subtraction :"+y);
		System.out.println("Multiplication :"+z);
		System.out.println("Division :"+m);
		System.out.println("Modulus :"+n);
}
	
}
