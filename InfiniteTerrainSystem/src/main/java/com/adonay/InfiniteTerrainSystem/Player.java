package com.adonay.InfiniteTerrainSystem;

public class Player {

	private String name;


	private Position position;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void setPosition(int x, int y) {
		this.position = new Position(x, y);
	}

	public Position getPosition() {

		return position;
	}

	public Position moveNorth() {
		position.setY(position.getY() + 1);
		return position;
	}

	public Position moveSouth() {
		position.setY(position.getY() - 1);
		return position;
	}

	public Position moveEast() {
		position.setX(position.getX() + 1);
		return position;
	}

	public Position moveWest() {
		position.setX(position.getX() - 1);
		return position;
	}

	public double checkCompass(Tresure tresure) {
		double x = Math.pow((position.getX() - tresure.getPosition().getX()), 2);
		double y = Math.pow(position.getY() - tresure.getPosition().getY(), 2);

		return Math.sqrt(x + y);
	}
}
