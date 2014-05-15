package com.example.challengeme;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends FragmentActivity {

	private MainFragment mainFragment;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {//Activity main
		super.onCreate(savedInstanceState);

		if (savedInstanceState == null) {
			// Add the fragment on initial activity setup
			mainFragment = new MainFragment();
			MainFragment.setFragmentActivity(MainActivity.this);
			getSupportFragmentManager().beginTransaction().add(android.R.id.content, mainFragment).commit();
		} else {
			// Or set the fragment from restored state info
			mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(android.R.id.content);
		}
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}
}
