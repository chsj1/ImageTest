package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {
	private Stage stage;//定义一个Stage对象
	private Image image;//定义一个Image对象
	private Texture texture;//定义一个Texture对象
	private TextureRegion region;//定义一个TextureRegion对象
	
	TextureAtlas atlas;//应以一个TextureAtlas对象
	TextureRegion bgRegion;//定义一个TextureRegion对象.
	Image bgImage;
	
	@Override
	public void create() {
		stage = new Stage(480,320,false);//初始化舞台
		Gdx.input.setInputProcessor(stage);//使用Stage对象来处理输入输出事件
		atlas = new TextureAtlas(Gdx.files.internal("data/movebg.atlas"));//初始化TextureAtlas对象
		bgRegion = atlas.findRegion("movebg");//初始化TextureAtlas
		bgImage = new Image(bgRegion);
		bgImage.setSize(480, 320);
		
		//初始化一个Texture对象
		texture = new Texture(Gdx.files.internal("data/feiji.png"));//初始化一个Texture对象
		region = new TextureRegion(texture,70,0,60,60);//初始话一个TextureRegion对象
//		region = new TextureRegion(texture,0,0,512,512);
		image = new Image(region);//利用TextureRegion对象来生成一个Image对象
//		image.setColor(Color.PINK);//设置图片的颜色
//		image.setScale(0.5f);//设置图片的缩放大小
		image.setPosition(230, 160);//设置图片的位置
		image.setOrigin(image.getWidth()/2, image.getHeight()/2);//设置旋转中心
//		image.setRotation(45);//设置旋转角度
//		image.setSize(300, 300);//设置大小
//		image.addAction( Actions.rotateTo(360f, 1f));//给一个Image添加旋转的效果.
		stage.addActor(bgImage);
		stage.addActor(image);//将演员添加到舞台上
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}
	@Override
	public void render() {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		stage.act();
		stage.draw();
	}
	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void resume() {
		// TODO Auto-generated method stub
	}
}