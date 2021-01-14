package Flipper;

import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2dStage;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;

public class FlipperInGameStage extends Box2dStage {
    public FlipperInGameStage(MyGame game) {
        super(new ExtendViewport(90,160), game);
        addBackButtonScreenBackByStackPopListener();
    }
}
