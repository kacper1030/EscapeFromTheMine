package game.escapefromthemine;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class EscapeFromTheMine extends ApplicationAdapter {
	
	private SpriteBatch batch;
	private Texture texPlayer;
	private OrthographicCamera cam;
	public GameObject objPlayer;
		
	@Override
	public void create() {
		
		batch = new SpriteBatch();
		
		texPlayer = new Texture("badlogic.jpg");
		
		
		 objPlayer = new GameObject(texPlayer);
		
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	private void update() {

	}

	@Override
	public void dispose() {
		
	}

}
