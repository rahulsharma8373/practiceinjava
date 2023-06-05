package com.practice;
interface StringFunction {
	String run(String str);
}
public class Main   {
public static void main(String[] args) {
	
StringFunction exclaim=(s)->s+"!";
StringFunction ask=(s)->s+"?";
print("Hello",exclaim);
print("Hello",ask);
	
	
	}
public static void print(String str,StringFunction format) {
	String result=format.run(str);
	System.out.println(result);
	
}

}
