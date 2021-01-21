package Flipper;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;

import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2DWorldHelper;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.MyFixtureDef;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.ShapeType;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class BallActor extends OneSpriteStaticActor {
    public BallActor(MyGame game, World world, float w, float h, float x, float y) {
        super(game, "box2dhelper/ball.png");
        setSize(w, h);
        setPosition(x, y);
        MyFixtureDef myFixtureDef = new MyFixtureDef();
        myFixtureDef.density = 20;
        myFixtureDef.friction = 1;
        myFixtureDef.restitution = 0.8f;
        setActorWorldHelper(new Box2DWorldHelper(world, this, ShapeType.Circle, myFixtureDef, BodyDef.BodyType.DynamicBody));
    }
}
