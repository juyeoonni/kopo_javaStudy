package com.numberBaseball.entity;

import java.util.ArrayList;
import java.util.List;

public class Player extends Game {
	private int life;
	
	public Player(List<String> numberList, int life) {
		super(numberList);
		this.life = life;
	}

	
	
}
