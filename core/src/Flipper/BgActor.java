package Flipper;

import hu.csanyzeg.master.MyBaseClasses.Box2dWorld.Box2dStage;

public class BgActor extends BaseHitboxActor {
    public BgActor(Box2dStage stage) {
        super(stage, "Flipper/palyavonal.png", "palyavonal", 160, 160);
    }
}
