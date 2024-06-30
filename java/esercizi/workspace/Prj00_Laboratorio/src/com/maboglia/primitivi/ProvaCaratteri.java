package com.maboglia.primitivi;

public class ProvaCaratteri {

	public static void main(String[] args) {

		//4 tipi interi
		byte b = 12;//8bit
		short s = 12;//16
		int intero = 12;//32
		long l = 12;//64
		
		//tipi reali
		float f = 12.0f;//32
		double d = 12.0;//64
		
		//1 tipo boolean
		boolean gira = true;
		
		//1 tipo char (numeric)
		
		for(int i = 0; i < 65536; i++) {
			System.out.println( i + ": " + (char) i);
			
//			if (i%80 == 0 && i > 0) {
//				System.out.println();
//			}
		}
		
		
	}

}
