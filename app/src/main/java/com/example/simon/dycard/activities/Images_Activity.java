package com.example.simon.dycard.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import com.example.simon.dycard.R;

public class Images_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images_);
    }


    public void imagePrecedent(View v) {
        finish();
    }

    public void imageSuivant(View v) {
        Intent intent = new Intent(Images_Activity.this, Choose_photo_activity.class);
        startActivity(intent);
    }
}
