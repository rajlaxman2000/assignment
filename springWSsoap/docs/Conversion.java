package com.temp;

public class Conversion {
	
	//41a828f6= 21.020000457763672
	
	private static double hexToIEEE754Float(String hexStr){
		
		int num = (Integer.parseInt(hexStr, 16));
		String bin = Integer.toBinaryString(num);
		int intBits = Integer.parseInt(bin, 2);
		float myFloat = Float.intBitsToFloat(intBits);
		return (double)myFloat;
	}
	
	// Convert the 32-bit binary into the decimal
	private static double GetFloat32(String Binary) {
		int intBits = Integer.parseInt(Binary, 2);
		float myFloat = Float.intBitsToFloat(intBits);
		return (double)myFloat;
	}

	// Get 32-bit IEEE 754 format of the decimal value
	private static String GetBinary32(float value) {
		int intBits = Float.floatToIntBits(value);
		String binary = Integer.toBinaryString(intBits);
		return binary;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		// Convert 19.5 into IEEE 754 binary format..
		String str = GetBinary32((float) 19.5);
		System.out.println("Binary equivalent of 19.5:");
		System.out.println(str);

		// .. and back again
		float f = GetFloat32(str);
		System.out.println("Decimal equivalent of " + str + ":");
		System.out.println(f);
		*/
		
		
		//Convert hex to IEEE 754 float
		/*
		String hexStr = "41a828f6";
		
		int num = (Integer.parseInt(hexStr, 16));
		System.out.println(Integer.toBinaryString(num));
		String bin = Integer.toBinaryString(num);
		
		System.out.println(GetFloat32(bin));
		*/
		String hexStr = "41a828f6";
		System.out.println(hexToIEEE754Float(hexStr));
	}
}
