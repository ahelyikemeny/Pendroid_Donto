package Flipper;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;

public class LifeCounter extends Label.LabelStyle {
    public LifeCounter(MyGame game) {
        super(game.getMyAssetManager().getFont("Flipper/font.ttf"), Color.BLACK);
    }

    public void setText(String s) {
    }
}
