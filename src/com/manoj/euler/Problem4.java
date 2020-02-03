package com.manoj.euler;

import com.manoj.euler.utils.PalindromeUtils;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args) {

        int result = 0;
        for( int i = 998001 ; i > 10000 ; i--){
            if(PalindromeUtils.isPalindrome(i)){
                for(int j=100; j<= 999 ; j++){
                    if(i%j ==0){
                        if((i/j) / 100 <= 9){
                            result = i;

                        }

                    }
                    if (result != 0){
                        break;
                    }
                }
            }
            if (result != 0){
                break;
            }
        }
        System.out.println("result: "+ result);
    }
}
