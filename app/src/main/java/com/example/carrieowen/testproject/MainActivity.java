package com.example.carrieowen.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
  public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Fire (View view){
        Intent changeScreenFire = new Intent(this, firescreen.class);
        startActivity(changeScreenFire);
    }

    public void Earthquake (View view){
        Intent changeScreenEarthquake = new Intent(this, earthquake.class);
        startActivity(changeScreenEarthquake);
    }
    public void Tornado (View view){
        Intent changeScreenTornado = new Intent(this, tornado.class);
        startActivity(changeScreenTornado);
    }
    public void CodeBlue (View view){
        Intent changeScreenCodeBlue = new Intent(this, codeblue.class);
        startActivity(changeScreenCodeBlue);
    }

}

