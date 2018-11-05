package com.tkpphr.mavenpublishtemplate.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tkpphr.mavenpublishtemplate.Greeter;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new Greeter("foo").hello(this);
	}
}
