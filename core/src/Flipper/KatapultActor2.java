package Flipper;

import com.badlogic.gdx.physics.box2d.BodyDef;

import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2dStage;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.MyFixtureDef;

public class KatapultActor2 extends BaseHitboxActor {
    public KatapultActor2(Box2dStage stage, MyFixtureDef fixtureDef, BodyDef.BodyType bodyType, float width, float height) {
        super(stage, "Flipper/katapult.png", "katapult", new MyFixtureDef(), BodyDef.BodyType.StaticBody, 20, 20);
        setPosition(0,65);
        setRotation(-65);
    }
}
