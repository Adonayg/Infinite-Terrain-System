package com.adonay.InfiniteTerrainSystem;

public class Game {
	private Player player;
	private Grid grid;
	private Tresure tresure;
	private boolean cheatCode;
	private StoryTeller storyTeller;

	public Game(Player player, Grid grid, Tresure tresure, StoryTeller storyTeller) {
		this.player = player;
		this.storyTeller = storyTeller;
		this.grid = grid;
		this.tresure = tresure;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public void start(Grid grid, Player player, Tresure tresure) {

		grid.setTresurePosition(tresure);
		tresure.getPosition();
		grid.setRandomPosition(player);
	}

	public boolean play(String input, int count, Grid grid, Player player, StoryTeller sotryTeller) {

		if (checkNumberOfRounds(count, grid, player)) {
			storyTeller.tooManyTurns();
			return true;
		}

		move(input);

		if (checkCheatCode()) {
			finishGame();
			return true;
		}

		if (checkFinish()) {
			finishGame();
			return true;
		}

		player.checkCompass(tresure);
		return false;
	}

	public void move(String move) {
		switch (move) {
		case "north":
			player.moveNorth();
			break;
		case "west":
			player.moveWest();
			break;
		case "east":
			player.moveEast();
			break;
		case "south":
			player.moveSouth();
			break;
		case "leave me alone":
			cheatCode = true;
			break;
		default:
			System.out.println("you notice the tall slender man in the suit is watching you and you begin to run");
			grid.setRandomPosition(player);
			System.out.println("you check your magic compass to see how far you are from the tresure");
		}
	}

	public boolean checkNumberOfRounds(int num, Grid grid, Player player) {
		if (num == 30) {
			return true;
		} else if(num % 5 == 0) { 
	
			System.out.println("you see the man in the suit again, you begin to run,...");
			System.out.println("you look at you magic compass and the");
			grid.setRandomPosition(player);
			return false;
		} else {
			return false;
		}
	}

	public boolean checkCheatCode() {
		if (cheatCode) {
			storyTeller.cheatCodeEntered();
			return true;
		} else {
			return false;
		}
	}

	public boolean checkFinish() {
		if (player.checkCompass(tresure) == 0.0) {
			
			storyTeller.finishGame();
			return true;
		} else {
			return false;
		}
	}

	public void finishGame() {
		storyTeller.printCredits();
	}

}
