package com.practice;

interface Addable {
	 int add(int a,int b);  
}
public class Main1 {
public static void main(String[] args) {
	
	Addable s=(a,b)->(a+b);
	System.out.println(s.add(10, 20));
	
	
	Addable d=(int a,int b)->(a+b);
	System.out.println(d.add(100, 200));
	
}
}
