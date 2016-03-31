package com.support.android.designlibdemo;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

/**
 * @author Paul Soman.
 */
public class ComponentsActivity extends BaseActivity{

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.components_activity);
		Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

	}




}
