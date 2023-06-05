package com.practice;

public class OverloadDemo  {
public int add(int a,int b) {
	
	 int rs= a+b;
	return rs;
}
public int add(int a,int b,int c) {
	int rs=a+b+c;
	return  rs;
}
	public static void main(String[] args) {
		OverloadDemo d=new OverloadDemo();
	int c=	d.add(1, 2);
		System.out.println(c);
int s=		d.add(1, 2, 3);
		
		System.out.println(s);
		
		
		
		
	
		}
		}
