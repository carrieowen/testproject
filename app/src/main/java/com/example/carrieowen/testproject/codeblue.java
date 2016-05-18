package com.example.carrieowen.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class codeblue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codeblue);
    }
    public void Main (View view){
        Intent changeScreenMain = new Intent(this, MainActivity.class);
        startActivity(changeScreenMain);
    }
}
