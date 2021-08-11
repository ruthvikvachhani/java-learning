package com.tcs.practice;

class A extends Exception{}
class B extends A{}
class C extends B{}
public class Purple {
	public static void main(String[] args) {
		int a,b,c,d,f,g,x;
		a=b=c=d=f=g=0;
		x=3;
		try {
			try {
				switch(x)
				{
				case 1:throw new A();
				case 2:throw new B();
				case 3:throw new C();
				}
				a++;}
				catch(B e) {b++;}
				finally {c++;}
			}
			catch(A e) {d++;}
			catch(Exception e) {f++;}
			finally {g++;}
			System.out.println(a+","+b+","+c+","+d+","+f+","+g);
		}
	}

