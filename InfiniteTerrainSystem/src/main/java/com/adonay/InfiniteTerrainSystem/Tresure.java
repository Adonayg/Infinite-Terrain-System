package com.adonay.InfiniteTerrainSystem;

public class Tresure {
	private Position position;
	
	public void setPosition(int x, int y) {
		this.position = new Position(x,y);
	}
	
	public Position getPosition() {

		return position;
	}
}
