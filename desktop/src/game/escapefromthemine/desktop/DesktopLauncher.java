package game.escapefromthemine.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import game.escapefromthemine.EscapeFromTheMine;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		
		cfg.title = "EscapeFromTheMain";
		
		cfg.resizable = false;
		
		cfg.width = 480;
		cfg.height = 800;
		
		new LwjglApplication(new EscapeFromTheMine(), cfg);
	}
}
