/**
 * 
 */
package com.diana.first;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author diana
 *today the kathi gives nice insights into programming as she is a pro
 */
public class first {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World :)");
		System.out.println("Hi! I am"+ System.getProperty("java.version")+ ".    Whats your name");
		Scanner in = new Scanner(System.in);
		
		String answer = in.nextLine();
		System.out.println("Hi " + answer +"!");
		in.close();
		
		RandomNumberGenerator mersenne = new MersenneTwister();
		
		double random =  mersenne.getNext();
		
		System.out.println(Arrays.toString(random));
		
		

	}

}
