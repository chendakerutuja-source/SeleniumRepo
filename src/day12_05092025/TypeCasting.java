package day12_05092025;

public class TypeCasting {

	public static void main(String[] args) {
		// First Type: 1.Widening - Smallest to Largest.
		
		byte b=10;
		short s=b;
		int i=s;
		System.out.println(i);
		
		// check in above Ex. we can store byte in short easily and also short we are able to store in int so meaning is byte is shorter than short so without any data loss error we can store it, it is called Widening TypeCasting.
		
       // Second Type: 2.Narrowing - Largest to Smallest.
		
		int in=20;
		short sr=(short)in;
		System.out.println(sr);
		
		// so here check we are storing int in short but int is larger than short so we can store int directly in short because their ranges so by using indicater we can store it. this is called Narrowing.
	}

}
