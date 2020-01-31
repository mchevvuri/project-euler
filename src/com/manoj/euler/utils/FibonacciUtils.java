package com.manoj.euler.utils;

public abstract class FibonacciUtils {

    private static final  int FIB_FIRST = 1;
    private static final  int FIB_SECOND = 2;

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

    public static int sumUntilPosition(int pos){
        return fibonacciNumberForPositionUsingRecursive(pos + 2) -2;
    }


}
