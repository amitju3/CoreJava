package com.scp.iteration;

/**
 * int intarr[] = new int[-1]; ---> runtime Exception in thread "main" java.lang.NegativeArraySizeException
 * int intarr[] = new int[0]; --->  its not error but throws Exception when we try to access array elements 





*/
public class ArrayExamples {

	public static void main(String[] args) {

		int intarr[] = new int[2];
		intarr[0] = 56;
		intarr[1] = 77;
		for (int x : intarr)
			System.out.println(x);

	}

}
