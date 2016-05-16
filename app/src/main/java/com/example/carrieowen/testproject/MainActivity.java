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
    public Intent changeScreenFire = new Intent();
    public Intent changeScreenTornado = new Intent();
    public Intent changeScreenEarthquake = new Intent();
    public Intent changeScreenCodeBlue = new Intent();

    public void Fire (View view){
        setContentView(R.layout.activity_firescreen);
    }
    public void Tornado (View view){
        setContentView(R.layout.activity_tornado);
    }
    public void Earthquake (View view){
        setContentView(R.layout.activity_earthquake);
    }
    public void CodeBlue (View view){
        setContentView(R.layout.activity_codeblue);
    }

}

