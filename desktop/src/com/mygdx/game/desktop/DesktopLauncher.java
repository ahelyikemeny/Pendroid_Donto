package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import csakennijottunk.FactoryGame;
import hu.csanyzeg.master.Demos.DemoMyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new FactoryGame(false), config);

		config.width = 1280;
		config.height = 720;
	}
}
