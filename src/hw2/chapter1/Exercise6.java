package hw2.chapter1;

import java.math.BigInteger;

public class Exercise6 {


    public Exercise6() {
    }

    public BigInteger factorial(int n){
       if(n == 1 || n == 0){
           return BigInteger.valueOf(1);
       }
       else if(n < 0){
           return BigInteger.valueOf(-1);
       }
       else{
           return BigInteger.valueOf(n).multiply(factorial(n-1));
        }

    }
}
