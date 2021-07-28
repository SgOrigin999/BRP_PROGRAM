package com.day1;

import java.util.Scanner;

public class PrintThreeName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name Of String:");
		String str=sc.nextLine();
		System.out.println("OutPut::"+str);
		String[] words=str.split("\\s");
		String revStr="HI";
		for(int i=words.length-1;i>=0;i--) {
			revStr=revStr +" "+words[i]+" ";
		}
System.out.println("OutPut::"+revStr);
	}

}
