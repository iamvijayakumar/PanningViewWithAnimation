package com.iamvijayakumar.panningviewwith;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

/**
 * 
 * @author iamvijayakumar
 *
 */

@SuppressLint("NewApi")
public class MainActivity extends Activity {

	PanningView mPanningView;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mPanningView = (PanningView) findViewById(R.id.panningView);
		AnimationDrawable animDrawable = new AnimationDrawable();
		animDrawable.addFrame(getResources().getDrawable(R.drawable.images1),
				10000);
		animDrawable.addFrame(getResources().getDrawable(R.drawable.images2),
				10000);
		// For Repeat Animation Make it false
		animDrawable.setOneShot(false);
		animDrawable.setEnterFadeDuration(2000);
		animDrawable.setExitFadeDuration(2000);
		mPanningView.setImageDrawable(animDrawable);

	}

	@Override
	protected void onResume() {

		super.onResume();
		if (mPanningView != null) {
			mPanningView.startPanning();
		}
	}
}
