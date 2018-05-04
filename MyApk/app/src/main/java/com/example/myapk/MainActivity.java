package com.example.myapk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView content = new TextView(this);
		content.setText("I am Source Apk");
		content.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this, SubActivity.class);
				startActivity(intent);
			}});
		setContentView(content);
		
		Log.i("demo", "app:"+getApplicationContext());
		
	}

}
