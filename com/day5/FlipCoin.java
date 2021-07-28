package com.day5;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number You Want To Flip A Coin:");
		int n = sc.nextInt();
		int h = 0;
		int t = 0;
		for (int i = 0; i < n; i++) {
			if (Math.random() < 0.5) {
				System.out.println("Heads");
				h++;
			} else {
				System.out.println("Tails");
				t++;
			}
		}
		System.out.println("Average OutPut Head::"+n/h +"Average Of Tail::"+n/t);
	}
}