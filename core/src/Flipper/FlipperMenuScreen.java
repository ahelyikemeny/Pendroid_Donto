package Flipper;

import hu.csanyzeg.master.MyBaseClasses.Assets.AssetList;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyScreen;

public class FlipperMenuScreen extends MyScreen {
    public FlipperMenuScreen(MyGame game) {
        super(game);
    }

    @Override
    protected void afterAssetsLoaded() {
        addStage(new FlipperMenuStage(game), 1,true);
    }

    @Override
    public AssetList getAssetList() {
        return null;
    }
}
