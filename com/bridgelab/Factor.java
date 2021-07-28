package com.bridgelab;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size::");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] result = new int[n];
		int Number;

		System.out.println("Enter Value In Array::");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			Number = arr[i];
			int sum = 0;
			int j = 0;

			for (j = 2; j <= Number;) {

				if (Number % j == 0) {
					Number = Number / j;
					sum = sum + j;
					result[i] = sum;
					j = 2;
				} else {
					j++;
				}

			}
			System.out.println("Array Value::" + Number + "Factor of Sum::" + sum);

		}
		for (int k = 0; k < result.length; k++) {
			System.out.print(result[k] + " ");
		}
	}
}
