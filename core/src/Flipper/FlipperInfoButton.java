package Flipper;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class FlipperInfoButton extends OneSpriteStaticActor {
    ClickListener c1;
    public FlipperInfoButton(MyGame game, float width, float height, float x, float y) {
        super(game, "badlogic.jpg");
        setPosition(x,y);
        setSize(width,height);
        this.addListener(c1 = new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                game.getMyAssetManager().getSound("click.mp3").play();
                game.setScreen(new FlipperInfoScreen(game));
            }
        });
    }
}
