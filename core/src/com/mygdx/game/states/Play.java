package com.mygdx.game.states;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.mygdx.game.handlers.GameStateManager;

public class Play extends GameState{
	
	private BitmapFont font = new BitmapFont();
	
	
	public Play(GameStateManager gsm){
		super(gsm);
	}

	
	public void handleInput(){
		
	}
	public void update(float dt){
		
	}
	public void render(){
		sb.setProjectionMatrix(hudcam.combined);
		sb.begin();
		font.draw(sb, "play state", 100, 100);
		sb.end();
	}
	public void dispose(){
		
	}
}
