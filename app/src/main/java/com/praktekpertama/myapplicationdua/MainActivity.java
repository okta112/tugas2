package com.praktekpertama.myapplicationdua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.textView);
        Button bt1 = findViewById(R.id.button3);
        Button bt2 = findViewById(R.id.button4);
        Button bt3 = findViewById(R.id.button5);
        Button bt4 = findViewById(R.id.button20);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt1 = new Intent(MainActivity.this, Activitysatu.class);
                startActivity(ibt1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt2 = new Intent(MainActivity.this, Activitydua.class);
                startActivity(ibt2);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt3 = new Intent(MainActivity.this, Activtytiga.class);
                startActivity(ibt3);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt4 = new Intent(MainActivity.this, Activityempat.class);
                startActivity(ibt4);
            }
        });

    }
}