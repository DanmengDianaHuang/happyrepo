package com.diana.divisible;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 16;
		int divisor = 4;
		
		boolean statement=(dividend % divisor ==0);
		if (statement) {
			System.out.println(dividend+ " is divisible by "+divisor);
		}
		else {
			System.out.println(dividend+" is not divisible by "+divisor);
		}

	}

}
