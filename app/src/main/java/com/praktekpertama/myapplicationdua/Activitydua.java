package com.praktekpertama.myapplicationdua;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activitydua extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dua);

        TextView tv1 = findViewById(R.id.textView3);
        Button bt1 = findViewById(R.id.button7);
        Button bt2 = findViewById(R.id.button8);
        Button bt3 = findViewById(R.id.button9);
        Button bt4 = findViewById(R.id.button18);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt1 = new Intent(Activitydua.this, Activitysatu.class);
                startActivity(ibt1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt2 = new Intent(Activitydua.this, Activtytiga.class);
                startActivity(ibt2);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            moveTaskToBack(true);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt4 = new Intent(Activitydua.this, Activityempat.class);
                startActivity(ibt4);
            }
        });


    }
}
