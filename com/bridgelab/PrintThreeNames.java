package com.bridgelab;

import java.util.Scanner;

public class PrintThreeNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name Of String:");
		String str = sc.nextLine();
		System.out.println("OutPut::" + str);
		String[] words = str.split("\\s");
		String result = "";
		for (int i = words.length; i > 0; i--) {
			result = words[i] + ",";
		}

	}

}
