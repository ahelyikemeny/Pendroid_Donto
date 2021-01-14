package Flipper;

import hu.csanyzeg.master.MyBaseClasses.Assets.AssetList;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyScreen;

public class FlipperInfoScreen extends MyScreen {
    public FlipperInfoScreen(MyGame game) {
        super(game);
    }

    @Override
    protected void afterAssetsLoaded() {
        addStage(new FlipperInfoStage(game),1,true);
    }

    @Override
    public AssetList getAssetList() {
        return null;
    }
}
