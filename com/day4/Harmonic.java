package com.day4;

public class Harmonic {
	 public static void main(String[] args) { 

	        int n = Integer.parseInt(args[0]);
	        double sum = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum += 1.0 / i;
	        }
	        System.out.println("Output::"+sum);
	    }
}