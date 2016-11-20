package test1;

import java.math.BigInteger;

public class bigsushu {

    public static void main(String[] args){

        BigInteger number = new BigInteger("" + Long.MAX_VALUE).add(BigInteger.ONE);

        for(int i = 0 ; i < 5 ; i++){

            System.out.println(number = number.nextProbablePrime());

        }

    }

}
