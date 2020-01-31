package com.manoj.euler.utils;

public abstract class FibonacciUtils {

    private static final  int FIB_FIRST = 1;
    private static final  int FIB_SECOND = 2;

    /**
     *
     * @param n position of the number
     * @return the value of number at the given position in a Fibonacci Series
     */
    public static int fibonacciNumberForPositionUsingRecursive(int n){
        if(0 == n ){
            return 0;
        } else if (1 ==n){
            return FIB_FIRST;
        } else if (2 == n){
            return FIB_SECOND;
        } else {
            return fibonacciNumberForPositionUsingRecursive(n-1) + fibonacciNumberForPositionUsingRecursive(n-2);
        }
    }

    /**
     *
     * @param pos position in fibonacci series
     * @return sum of numbers in Fibonacci series until a given position
     */
    public static int sumUntilPosition(int pos){
        return fibonacciNumberForPositionUsingRecursive(pos + 2) -2;
    }


}
