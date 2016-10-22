package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.handlers.GameStateManager;

public class MyGdxGame extends ApplicationAdapter {
	
	public static final String TITLE = "GdxTutorial";
	public static final int V_WIDTH = 320;
	public static final int V_HEIGHT = 240;
	public static final int SCALE = 2;
	
	public static final float STEP = 1 / 60f;
	private float accum;
	
	private SpriteBatch sb;
	private OrthographicCamera hudcam;
	
	private GameStateManager gsm;
	
	public SpriteBatch getSpriteBatch() {return sb;}
	public OrthographicCamera getHudcam() {return hudcam;}
	
	@Override
	public void create () {
		sb = new SpriteBatch();
		hudcam = new OrthographicCamera();
		hudcam.setToOrtho(false, V_WIDTH, V_HEIGHT);
		gsm = new GameStateManager(this);
	}

	@Override
	public void render () {
		
		accum += Gdx.graphics.getDeltaTime();
		while(accum >= STEP){
			accum -= STEP;
			gsm.update(STEP);
			gsm.render();
		}
	}
	
	public void dispose(){
		
	}
}
