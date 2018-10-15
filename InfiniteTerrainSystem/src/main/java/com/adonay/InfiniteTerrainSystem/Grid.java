package com.adonay.InfiniteTerrainSystem;

import java.util.*;

public class Grid {

	public int randomInt() {
		Random rand = new Random(); 
		int i = rand.nextInt(10);
		return i;
	}
	
	public void setRandomPosition(Player adventurer) {
		int x = randomInt();
		int y = randomInt();
		adventurer.setPosition(x,y);
	}
	
	
	public void setTresurePosition(Tresure tresure) {
		tresure.setPosition(randomInt(), randomInt());
	}
	
}
