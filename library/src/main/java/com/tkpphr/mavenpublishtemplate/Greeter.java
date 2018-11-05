package com.tkpphr.mavenpublishtemplate;

import android.content.Context;
import android.widget.Toast;

public class Greeter {
	private String name;

	public Greeter(String name){
		this.name = name;
	}

	public void hello(Context context){
		Toast.makeText(context,"Hello " + this.name, Toast.LENGTH_SHORT).show();
	}

}
