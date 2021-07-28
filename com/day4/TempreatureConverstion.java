package com.day4;

import java.util.Scanner;

public class TempreatureConverstion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Tempreature:");
	 double t=sc.nextDouble();
	 double f=t*9/5+32;
	 double c=f-32*5/9;
	 System.out.println("Output In Cellcius::"+c);
}
}
