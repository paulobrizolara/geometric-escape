package org.example.game;

import org.example.game.prototypes.PrototypePathFollowingBehavior;
import org.example.game.prototypes.PrototypePlayer;

import com.badlogic.gdx.ApplicationAdapter;

public class GameChooser {
	public static ApplicationAdapter getGame(){
//		return new GrafosGame();
//		return new PrototypeSeekBehavior();
//		return new PrototypePathFollowingBehavior();
		return new PrototypePlayer();	
	}
}
