package com.paddy10tellys.aaitools;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
	MediaPlayer ourSong;

	@Override
	protected void onCreate(Bundle paddysBundle) {
		// TODO Auto-generated method stub
		super.onCreate(paddysBundle);
		setContentView(R.layout.splash);
		ourSong = MediaPlayer.create(this, R.raw.blind_willie);
		ourSong.start();
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				} finally{
					Intent openAAITools = new Intent("com.paddy10tellys.aaitools.MENU");
					startActivity(openAAITools);					
				}

			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
		ourSong.release();
	}
}
	

