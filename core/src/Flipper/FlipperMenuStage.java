package Flipper;

import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyStage;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.ResponseViewport;

public class FlipperMenuStage extends MyStage {

    public FlipperMenuStage(MyGame game) {
        super(new ExtendViewport(90,160), game);
        addBackButtonScreenBackByStackPopListener();
        addActor(new FlipperMenuBackgroundActor(game, 160,120,0,0) );
        addActor(new FlipperStartButton(game, 40, 10, 0, 90 ));
        addActor(new FlipperExitButton(game, 40, 10, 0, 60));
        addActor(new FlipperInfoButton(game, 40, 10, 0, 30));

    }
}
