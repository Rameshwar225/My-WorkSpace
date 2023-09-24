package xyz;

import java.math.BigInteger;

public class help {
	
	public static void main(String[] arg)
	{
//		BigInteger base = BigInteger.valueOf(17);
//        BigInteger exponent = BigInteger.valueOf(19);
//        BigInteger modulus = BigInteger.valueOf(33);
//        BigInteger result = base.modPow(exponent, modulus);
//        System.out.println("(17^19) % 33 = " + result);
		
		power();
	}
	
	static public void power()
	{
		BigInteger base = BigInteger.valueOf(17);
        BigInteger exponent = BigInteger.valueOf(19);
        BigInteger modulus = BigInteger.valueOf(33);
        BigInteger result = base.modPow(exponent, modulus);
        System.out.println("(17^19) % 33 = " + result);
	}

}
