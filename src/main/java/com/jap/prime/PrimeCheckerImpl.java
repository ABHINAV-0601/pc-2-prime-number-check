package com.jap.prime;

public class PrimeCheckerImpl {
    public boolean primeNumberCheck(int number) {
        // write the logic here to check is a number is prime or not
        PrimeChecker primeChecker = number1->{
            if(number <= 1){
                return false;
            }
            for (int i = 2; i < number; i++) {
                if(number % i == 0){
                    return false;
                }
            }
                return true;
        };
        return primeChecker.isPrimeNumber(number);
    }

}
