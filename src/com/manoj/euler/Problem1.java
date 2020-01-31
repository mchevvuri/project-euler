package com.manoj.euler;

public class Problem1 {
    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
     */

    public static void main(String[] args) {

    	int largestDivisibleBy3 = largestDivisibleNumber(999,3);
    	int largestDivisibleBy5 = largestDivisibleNumber(999,5);
    	int largestDivisibleBy15 = largestDivisibleNumber(999,15);

    	int result3 = (3 * largestDivisibleBy3 *(largestDivisibleBy3 +1))/2;
    	int result5 = (5 * largestDivisibleBy5 *(largestDivisibleBy5 +1))/2;
    	int result15 = (15 * largestDivisibleBy15 *(largestDivisibleBy15 +1))/2;

    	int result = result3 + result5 - result15;

    	System.out.println(result);

    }

    static int largestDivisibleNumber(int num, int den){
    	if(den != 0){
    		return num/den;
    	}
    	return 0;  	
    }
}
