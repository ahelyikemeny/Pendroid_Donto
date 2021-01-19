package Flipper;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;

import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2DWorldHelper;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2dStage;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.MyFixtureDef;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.ShapeType;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;
public class KatapultActor extends BaseHitboxActor {
    World world;
    public KatapultActor(Box2dStage stage, MyFixtureDef fixtureDef, BodyDef.BodyType bodyType, float width, float height) {
        super(stage, "Flipper/katapult.png", "katapult", new MyFixtureDef(), BodyDef.BodyType.StaticBody, 30, 30);
        setPosition(130,65);
        setRotation(65);
    }
}
