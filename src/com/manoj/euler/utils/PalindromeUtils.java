package com.manoj.euler.utils;

import java.util.List;

public abstract class PalindromeUtils {

    /**
     *
     * @param number number to check if it's a palindrome or not
     * @return boolean flag indicating if it's a palindrome
     */
    public static boolean isPalindrome(long number){
        boolean isPalindrome = true;
        List<Integer> digitList = NumberUtils.convertNumberToDigits(number);
        int numberOfDigits = digitList.size();
        for (int i = 0 ; i<= digitList.size()/2 ; i++){
            if(digitList.get(i) != digitList.get(numberOfDigits - (1 +i))){
                isPalindrome = false;
                return isPalindrome;
            }
        }
        return isPalindrome;
    }
}
