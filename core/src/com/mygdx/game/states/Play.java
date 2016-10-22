package com.mygdx.game.states;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.handlers.GameStateManager;

public class Play extends GameState{
	
	private World world;
	private Box2DDebugRenderer b2dr;
	
	public Play(GameStateManager gsm){
		super(gsm);
		
		//create box2d world
		world = new World(new Vector2(0, -5.0f), true);
		b2dr = new Box2DDebugRenderer();
		
		//create seperator platform
		BodyDef wallBDef = new BodyDef();
		wallBDef.position.set(160, 0);
		wallBDef.type = BodyType.StaticBody;
		Body body = world.createBody(wallBDef);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(2, game.V_HEIGHT);
		
		FixtureDef fdef = new FixtureDef();
		fdef.shape = shape;
		body.createFixture(fdef);
		
		}

	
	public void handleInput(){
		
	}
	public void update(float dt){
		
		world.step(dt, 6, 2);
		
	}
	public void render(){
		b2dr.render(world, hudcam.combined);
	}
	public void dispose(){
		
	}
}
