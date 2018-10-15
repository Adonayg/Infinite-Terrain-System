package com.adonay.InfiniteTerrainSystem;

public class StoryTeller {

	public void startStory() {
		System.out.println(" Grey foggy clouds float oppressively close to you,\r\n"
				+ "reflected in the murky grey water which reaches up your shins.\r\n" +
				"you see a shiny chest in the distance and a tall slender man wearing a suit");
	}
	
	public void instruct(Player player, Tresure tresure) {

		System.out.println("you notice a magical compass on your neck, it reads " + player.checkCompass(tresure) + "m");
		System.out.println("type out north, east, west, south to move through the map to find the tresure");
		System.out.println("move in any direction to start");
	}

	public void createPlayer(Player player, String playerName) {

		player.setName(playerName);
		System.out.println("=============================================================================================================");
		System.out.println("|                        Welcome to Infinte Terrain " + playerName );
		System.out.println("=============================================================================================================");
		
	}

	
	public void finishGame() {
		System.out.println("you look at your compass and it reads 0m");
		System.out.println("You found the tresure and the tall slender man is no where to be seen");
		System.out.println("=============================================================================================================");
		System.out.println("              Congratulation                ");
		System.out.println("=============================================================================================================");
	}
	
	public void tooManyTurns() {
		System.out.println("You have been running for too long, you are too tiered and the tall slender man catches up to you and ...\r\n"
				+ "you begin to fight but you are exahusted and too weak, he stares at you for a second before walking away ...\r\n " +
				"he leaves to chase other people who can actually fight.");
		System.out.println("=============================================================================================================");
		System.out.println("                                     Game Over                  ");
		System.out.println("=============================================================================================================");
	}
	
	public void cheatCodeEntered() {
		System.out.println("You stare at the man in the suit and tell him to leave you alone");
		System.out.println("He leaves you alone");
		System.out.println("=============================================================================================================");
		System.out.println("                                     Congratulation                ");
		System.out.println("=============================================================================================================");
		System.out.println("You run away and stumble accross the tresure and the tall slender man is no where to be seen");
	}
	
	public void printCredits() {
		System.out.println("\n \n");
		System.out.println("=============================================================================================================");
		System.out.println("                                     Created by Adonay                                                       ");
		System.out.println("                                        Inspired by:                                                         ");
		System.out.println("                                 The Infinite terrain System                                                 ");
		System.out.println("                                        The Slender Man                                                      ");
		System.out.println("=============================================================================================================");
	}

}
