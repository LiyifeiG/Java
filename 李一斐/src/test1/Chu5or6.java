package test1;

import java.math.BigInteger;

public class Chu5or6 {

	public static void main(String[] args) 
	{
		String MaxLong = "" + Long.MAX_VALUE;
		BigInteger i = new BigInteger(MaxLong).add(BigInteger.ONE);
		int n=0;
		while (n<10)
		{
		
			if (i.remainder(new BigInteger("5")).equals(BigInteger.ZERO) || i.remainder(new BigInteger("6")).equals(BigInteger.ZERO))
			{
				System.out.println(i);
						n++;
			}
			i=i.add(BigInteger.ONE);

		}

	}

}





//public class M14_11 {
//    public static void main(String[] args){
//        String MaxLong = "" + Long.MAX_VALUE;
//        int count = 0;
//        for (BigInteger i = new BigInteger(MaxLong).add(BigInteger.ONE); count < 10 ; i = i.add(BigInteger.ONE)){
//            if (i.divideAndRemainder(new BigInteger("5"))[1].equals(BigInteger.ZERO) || 
//					i.divideAndRemainder(new BigInteger("6"))[1].equals(BigInteger.ZERO)){
//                System.out.println(i);
//                count++;
//            }
//        }
//    }
//}
