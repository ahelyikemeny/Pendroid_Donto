package Flipper;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;

import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2DWorldHelper;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2dStage;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.MyFixtureDef;
import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.WorldBodyEditorLoader;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class BaseHitboxActor extends OneSpriteStaticActor {
    Box2DWorldHelper box2DWorldHelper;


    public BaseHitboxActor(Box2dStage stage, String textureHash, String hitboxHash, float width, float height){
        super(stage.game, textureHash);
        setSize(width, height);
        box2DWorldHelper = new Box2DWorldHelper(stage.getWorld(), this, stage.getLoader(), hitboxHash, new MyFixtureDef(), BodyDef.BodyType.StaticBody);
    }

    public BaseHitboxActor(Box2dStage stage, String textureHash, String hitboxHash, MyFixtureDef fixtureDef, BodyDef.BodyType bodyType, float width, float height){
        super(stage.game, textureHash);
        setSize(width, height);
        box2DWorldHelper = new Box2DWorldHelper(stage.getWorld(), this, stage.getLoader(), hitboxHash, fixtureDef, bodyType);
    }


    @Override
    protected void setStage(Stage stage) {
        super.setStage(stage);
        if (stage!=null){
            box2DWorldHelper.addToWorld();
        }else{
            box2DWorldHelper.removeFromWorld();
        }
    }
}
