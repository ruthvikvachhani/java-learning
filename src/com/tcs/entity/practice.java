package com.tcs.entity;

public class practice {
	static void m1(int[] i1, int[] i2) {
	    int[] i3 = i1; i1 = i2; i2 = i3;
	  }
	  public static void main (String[] args) {
	    int[] i1 = {1}, i2 = {3}; m1(i1, i2);
	    System.out.print(i1[0] + "," + i2[0]);
	}
}
