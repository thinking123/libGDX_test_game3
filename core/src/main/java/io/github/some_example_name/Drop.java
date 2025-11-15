package io.github.some_example_name;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class Drop extends Game {

    public SpriteBatch batch;
    public BitmapFont font;
    public FitViewport viewport;

    public void create() {

        batch = new SpriteBatch();
        // 使用 libGDX 的默认字体
        font = new BitmapFont();
        viewport = new FitViewport(8, 5);

        // 字体默认 15pt，但我们需要根据视口高度与屏幕高度的比例进行缩放
        font.setUseIntegerPositions(false);
        font.getData().setScale(viewport.getWorldHeight() / Gdx.graphics.getHeight());

        this.setScreen(new MainMenuScreen(this));
    }

    public void render() {
        super.render(); // 很重要！
    }

    public void dispose() {
        batch.dispose();
        font.dispose();
    }

}
