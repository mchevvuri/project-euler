package com.manoj.euler.utils;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberUtils {

    public static List<Integer> convertNumberToDigits(long number){
        List<Integer>  digitsInNumber = new ArrayList<>();
        while(number !=0){
            digitsInNumber.add(Integer.valueOf((number % 10)+""));
            number = number/10;
        }
        return digitsInNumber;
    }

}
