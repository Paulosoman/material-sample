package com.support.android.designlibdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

/**
 * @author Paul Soman.
 * This class is the laucher activity of the app.
 */
public class LauncherActivity extends BaseActivity {
	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.launcher_activity);
		showMainActivity();
	}


	private void showMainActivity(){
		Handler handler=new Handler();
		handler.postDelayed(new Runnable() {
			@Override public void run() {
				Intent intent = new Intent(LauncherActivity.this, MainActivity.class);
				startActivity(intent);
				finish();
			}
		}, 4000);


	}
}
