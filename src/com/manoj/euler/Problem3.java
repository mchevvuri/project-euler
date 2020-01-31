package com.manoj.euler;

import com.manoj.euler.utils.PrimeFactorUtils;

import java.util.ArrayList;
import java.util.List;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
    public static void main(String[] args) {

        List<Long> result = PrimeFactorUtils.primeFactorsForInteger(600851475143l);

        System.out.println("prime factors for: "+600851475143l+ " are " + result);

        System.out.println("the largest factorial is: " + result.get(result.size()-1));

    }
}
