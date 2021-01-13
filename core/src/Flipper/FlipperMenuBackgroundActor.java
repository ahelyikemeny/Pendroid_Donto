package Flipper;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class FlipperMenuBackgroundActor extends OneSpriteStaticActor {
    public FlipperMenuBackgroundActor(MyGame game, int width, int height,  float x, float y) {
        super(game, "badlogic.jpg");
        setSize(width, height);
        setPosition(x,y);
    }
}
