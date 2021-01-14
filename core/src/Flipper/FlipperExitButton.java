package Flipper;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;
import hu.csanyzeg.master.MyBaseClasses.Timers.OneTickTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.OneTickTimerListener;

public class FlipperExitButton extends OneSpriteStaticActor {
    ClickListener c1;
    OneTickTimerListener timer1;

    public FlipperExitButton(MyGame game, float width, float height, float x, float y) {
        super(game, "badlogic.jpg");
        setPosition(x, y);
        setSize(width, height);
        this.addListener(c1 = new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                game.getMyAssetManager().getSound("click.mp3").play();
                addTimer(new OneTickTimer(1, new OneTickTimerListener() {
                    @Override
                    public void onTick(OneTickTimer sender, float correction) {
                        super.onTick(sender, correction);
                        game.setScreenBackByStackPop();
                    }
                }));
            }
        });
    }
}
