package Flipper;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;

import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2DWorldHelper;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.MyFixtureDef;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.ShapeType;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class BottomSensorActor extends OneSpriteStaticActor {
    World world;
    Box2DWorldHelper box2DWorldHelper;
    public BottomSensorActor(MyGame game, World world, float w, float h, float x, float y) {
        super(game, "badlogic.jpg");
        setSize(w,h);
        setPosition(x,y);
        setVisible(false);
        setActorWorldHelper(new Box2DWorldHelper(world,this, ShapeType.Rectangle, new MyFixtureDef(), BodyDef.BodyType.StaticBody));
    }
}
