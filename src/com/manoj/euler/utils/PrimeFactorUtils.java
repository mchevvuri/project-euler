package com.manoj.euler.utils;

import java.util.ArrayList;
import java.util.List;

public abstract class PrimeFactorUtils {

    /**
     *
     * @param number input integer
     * @return array of integers with all the prime factors in ascending order
     */
    public static List<Long> primeFactorsForInteger(long number){
        List<Long> result = new ArrayList<>();
        if(number <= 0){
            System.out.println("number is either less than or equal to 0 : " + number);
            result.add(0l);
            return result;
        } else if (1 == number){
            System.out.println("number is equal to 1");
            result.add(1l);
            return result;
        }else {
            // loop to count how many times is given number is divisible by 2
            while(number % 2 == 0){
                result.add(2l);
                number /= 2;
            }

            //once number is out of the above loop, it's odd number by then. so we'll try to find all the odd numbers until sqrt of number
            for (long j = 3 ; j<= Math.sqrt(number); j += 2){
                while(number % j == 0){
                    result.add(j);
                    number /= j;
                }
            }

            // if left over number is more than 2 and out of both the above loops, that means the number is prime
            if(number > 2){
                result.add(number);
            }
        }

        return result;
    }
}
