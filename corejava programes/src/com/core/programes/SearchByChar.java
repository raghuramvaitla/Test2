package com.core.programes;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SearchByChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my name is raghuram";
		char c = 'm';
		System.out.println("enter any single char");
		 Scanner scanner = new Scanner(System.in);
		 String next = scanner.next();
		  for(int z= 0 ; z< next.length(); z++) {
			  c= next.charAt(z);
			  for(int i = 0 ;i < str.length() ; i++) {
					if (c == str.charAt(i)) {
						System.out.println(c + " is equals with index " + i);
						System.exit(0);
					}
					System.out.println("bye bye");
				}
		  }
		

	}

}
