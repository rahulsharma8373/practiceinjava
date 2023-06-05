package com.practice;
 class Bicycle{
	int wheels=2;
	String seat;
	public void riding() {
		System.out.println("bicycle is used for riding");
	}
	
}
 
  class RoadByCycle extends Bicycle{
	  public void riding() {
			System.out.println("RoadBicycle is used for road  riding");
		} 
 }
public class TestBicycle {

	public static void main(String[] args) {
	
Bicycle r=new RoadByCycle();
r.riding();
	}

}
