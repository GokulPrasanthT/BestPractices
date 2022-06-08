package com.chainsys.bestpractices.abstractDemo;

public class ScoreBoard {
	public int TargetScore = 215;

	private ScoreBoard() {
		System.out.println("Object Created for ScreBoard");
	}

	public static ScoreBoard createObject() {
		return new ScoreBoard();
	}
}
