package Flipper;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2DWorldHelper;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2dStage;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.MyContactListener;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.MyFixtureDef;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;

public class FlipperInGameStage extends Box2dStage {
    MyContactListener myContactListener;
    public FlipperInGameStage(MyGame game) {
        super(new ExtendViewport(90,160), game);
        addBackButtonScreenBackByStackPopListener();
        setLoader("Flipper/hitboxes");

        addActor(new BgActor(this));
        addActor(new KatapultActor(this, new MyFixtureDef(), BodyDef.BodyType.StaticBody, 30,30 ));
        addActor(new GyorsitoActor(this, new MyFixtureDef(), BodyDef.BodyType.StaticBody, 50, 50));
        addActor(new FlipperutoActor(this, new MyFixtureDef(), BodyDef.BodyType.StaticBody, 30, 30));
        addActor(new FlipperutoActor2(this, new MyFixtureDef(), BodyDef.BodyType.StaticBody, 30, 30));

        SensorActor sensorActor = new SensorActor(game, world, 15,5,145,75);
        sensorActor.setRotation(65);
        addActor(sensorActor);
        BallActor ballActor = new BallActor(game, world, 5,5,140,80);
        addActor(ballActor);
        getHelper(sensorActor).addContactListener(new MyContactListener() {
            @Override
            public void beginContact(Contact contact, Box2DWorldHelper myHelper, Box2DWorldHelper otherHelper) {
                if (otherHelper.getActor() instanceof BallActor){

                    otherHelper.invoke(new Runnable() {
                        @Override
                        public void run() {
                            otherHelper.getBody().setLinearVelocity(0,100);
                            otherHelper.getBody().setAngularVelocity(0);
                        }
                    });
                }
            }

            @Override
            public void endContact(Contact contact, Box2DWorldHelper myHelper, Box2DWorldHelper otherHelper) {

            }

            @Override
            public void preSolve(Contact contact, Box2DWorldHelper myHelper, Box2DWorldHelper otherHelper) {

            }

            @Override
            public void postSolve(Contact contact, Box2DWorldHelper myHelper, Box2DWorldHelper otherHelper) {

            }
        });
    }
}
