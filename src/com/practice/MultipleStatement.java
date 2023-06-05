package com.practice;
interface IAvarage{
	double avg(int[] array);
}

public class MultipleStatement {

	public static void main(String[] args) {
	
		IAvarage withLambda=(w)->{double sum=0;
		
		int arraysize=w.length;
		System.out.println("arraySize : " + arraysize);
		for(int i=0;i<w.length;i++) {
			sum=sum+w[i];
			
		}
		System.out.println("sum: " + sum);
		return (sum/arraysize);
		};
		int[] w= {1,4,6,8,9};
		System.out.println(withLambda.avg(w));
		
		

	}

}
