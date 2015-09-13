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
	private Stage stage;//����һ��Stage����
	private Image image;//����һ��Image����
	private Texture texture;//����һ��Texture����
	private TextureRegion region;//����һ��TextureRegion����
	
	TextureAtlas atlas;//Ӧ��һ��TextureAtlas����
	TextureRegion bgRegion;//����һ��TextureRegion����.
	Image bgImage;
	
	@Override
	public void create() {
		stage = new Stage(480,320,false);//��ʼ����̨
		Gdx.input.setInputProcessor(stage);//ʹ��Stage������������������¼�
		atlas = new TextureAtlas(Gdx.files.internal("data/movebg.atlas"));//��ʼ��TextureAtlas����
		bgRegion = atlas.findRegion("movebg");//��ʼ��TextureAtlas
		bgImage = new Image(bgRegion);
		bgImage.setSize(480, 320);
		
		//��ʼ��һ��Texture����
		texture = new Texture(Gdx.files.internal("data/feiji.png"));//��ʼ��һ��Texture����
		region = new TextureRegion(texture,70,0,60,60);//��ʼ��һ��TextureRegion����
//		region = new TextureRegion(texture,0,0,512,512);
		image = new Image(region);//����TextureRegion����������һ��Image����
//		image.setColor(Color.PINK);//����ͼƬ����ɫ
//		image.setScale(0.5f);//����ͼƬ�����Ŵ�С
		image.setPosition(230, 160);//����ͼƬ��λ��
		image.setOrigin(image.getWidth()/2, image.getHeight()/2);//������ת����
//		image.setRotation(45);//������ת�Ƕ�
//		image.setSize(300, 300);//���ô�С
//		image.addAction( Actions.rotateTo(360f, 1f));//��һ��Image�����ת��Ч��.
		stage.addActor(bgImage);
		stage.addActor(image);//����Ա��ӵ���̨��
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