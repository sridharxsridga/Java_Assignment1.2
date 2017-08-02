/*
 *  Write a program to print the result of the following expressions provided the integer variable a is
 *	20 and b is 10.
 *	int b= a-- - --a;
 *	int c=a--;
 *	int d=a>>2;
 *	int e=a&b;
 * 
 * Expected output : The output of each expression should get printed in a new line.
 */


package com.expressions;

public class Expressions {

	public static void main(String[] args) {
		int a =20;
		int b =10;
		int c;
		int d;
		int e;
		System.out.print("Value for expression  b = a-- - --a is ");
		System.out.println( b = a-- - --a);
		System.out.print("Value for expression  c = a--  is ");
		System.out.println( c = a--);
		System.out.print("Value for expression  d = a >> 2 is ");
		System.out.println( d = a >> 2 );
		System.out.print("Value for expression  e = a & b is ");
		System.out.println( e = a & b );
		
		
		
		
		
		

	}

}
