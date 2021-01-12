package Flipper;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;

public class FlipperGame extends MyGame {
    public FlipperGame(boolean debug) {
        super(debug);
    }

    @Override
    public void create() {
        super.create();
        setScreen(new FlipperMenuScreen(this));
    }
}
