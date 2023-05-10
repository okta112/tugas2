package com.praktekpertama.myapplicationdua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activityempat extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_empat);

        TextView tv1 = findViewById(R.id.textView4);
        Button bt1 = findViewById(R.id.button13);
        Button bt2 = findViewById(R.id.button14);
        Button bt3 = findViewById(R.id.button15);
        Button bt4 = findViewById(R.id.button16);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt1 = new Intent(Activityempat.this, Activitysatu.class);
                startActivity(ibt1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt2 = new Intent(Activityempat.this, Activitydua.class);
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
                Intent ibt4 = new Intent(Activityempat.this, Activtytiga.class);
                startActivity(ibt4);
            }
        });
    }
}



