package com.example.drugology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activity);

        SystemClock.sleep(2000);
        Intent intent = new Intent(splash_activity.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
