package com.day5;

public class GamlinfSimulator {
	public static void main(String[] args) {
		//50,250,1000
		int stake = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int trials = Integer.parseInt(args[2]);
		int bets = 0;
		int wins = 0;
		for (int i = 0; i < trials; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal)
				wins++;
		}
		System.out.println(wins + " wins of " + trials);
		System.out.println("Percent of games Win = " + 100.0 * wins / trials);
		System.out.println("Average bets           = " + 1.0 * bets / trials);
	}
}
