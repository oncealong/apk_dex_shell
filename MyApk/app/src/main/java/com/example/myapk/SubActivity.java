package com.example.myapk;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SubActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView content = new TextView(this);
		content.setText("I am Source Apk SubMainActivity");
		
		setContentView(content);
		
		Log.i("demo", "app:"+getApplicationContext());
		
	}

}
