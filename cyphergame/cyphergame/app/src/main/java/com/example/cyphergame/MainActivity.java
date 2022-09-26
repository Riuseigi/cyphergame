package com.example.cyphergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView lol;
    ImageView dota;
    ImageView
            ml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lol= findViewById(R.id.imageButton4);
        dota = findViewById(R.id.imageButton6);
        ml = findViewById(R.id.imageButton8);

        lol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intObj = new Intent(MainActivity.this,Loll.class);
                startActivity(intObj);

            }
        });
        dota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dotaw = new Intent(MainActivity.this,Dota.class);
                startActivity(dotaw);

            }
        });
        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mls = new Intent(MainActivity.this,ml.class);
                startActivity(mls);
            }
        });
    }
}
