package com.example.challengeme;

import com.facebook.widget.ProfilePictureView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Menu extends Activity {
	
	private ProfilePictureView profilePictureView;
	private TextView userNameView;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        /*// Find the user's profile picture custom view
        profilePictureView = (ProfilePictureView) view.findViewById(R.id.selection_profile_pic);
        profilePictureView.setCropped(true);

        // Find the user's name view
        userNameView = (TextView) view.findViewById(R.id.selection_user_name);*/
        
        setContentView(R.layout.menu);
    }
}
