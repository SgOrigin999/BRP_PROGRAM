package com.day2;

import java.util.Random;
import java.util.Scanner;

public class SumOfTwoDice {
	 public static void main ( String[] args )
	  {
	    Scanner scan = new Scanner( System.in );    
	    Random rand = new Random();
	    int first=rand.nextInt(6)+1;
	    int second=rand.nextInt(6)+1;
	    int result=first+second;
	    System.out.println("Output::"+result);
	  }
}
