package com.adonay.InfiniteTerrainSystem;

import java.util.*;

public class App {
	private static Scanner input;

	public static void main(String[] args) {
		Grid grid = new Grid();
		Tresure tresure = new Tresure();
		Player player1 = new Player();
		StoryTeller storyTeller = new StoryTeller();

		Game game = new Game(player1, grid, tresure, storyTeller);

		game.start(grid, player1, tresure);

		String playerName;

		input = new Scanner(System.in);

		System.out.print("Enter Name: ");
		playerName = input.nextLine();

		storyTeller.createPlayer(player1, playerName);
		
		storyTeller.startStory();
		
		storyTeller.instruct(player1, tresure);

		int count = 0;
		String UserInput;

		while (true) {
			UserInput = input.nextLine();
			if (game.play(UserInput, count, grid, player1, storyTeller)) {
				break;
			}
			System.out.println("dial is now " + player1.checkCompass(tresure) + "m");
			count++;
		}

	}

}
