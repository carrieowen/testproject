package com.example.carrieowen.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public Intent changeScreen = new Intent();

    public void Fire (View view){
        changeScreen = new Intent(this, firescreen.class);
        startActivity(changeScreen);
    }
    public void Tornado (View view){
        changeScreen = new Intent(this, tornado.class);
        startActivity(changeScreen);
    }
    public void Earthquake (View view){
        changeScreen = new Intent(this, earthquake.class);
        startActivity(changeScreen);
    }
    public void CodeBlue (View view){
        changeScreen = new Intent(this, codeblue.class);
        startActivity(changeScreen);
    }
}

