package Flipper;

import com.badlogic.gdx.physics.box2d.BodyDef;

import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2dStage;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.MyFixtureDef;

public class FlipperutoActor extends BaseHitboxActor {
    public FlipperutoActor(Box2dStage stage, MyFixtureDef fixtureDef, BodyDef.BodyType bodyType, float width, float height) {
        super(stage, "Flipper/flipperuto.png", "flipperuto", new MyFixtureDef(), BodyDef.BodyType.StaticBody, width, height);
        setPosition(50,0);
    }
}
