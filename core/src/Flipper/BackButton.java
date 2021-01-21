package Flipper;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class BackButton extends OneSpriteStaticActor {
    ClickListener c1;
    public BackButton(MyGame game) {
        super(game, "badlogic.jpg");
        setSize(100, 100);
        this.addListener( c1 = new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                game.setScreen(new FlipperMenuScreen(game));
            }
        });
        }
    }
