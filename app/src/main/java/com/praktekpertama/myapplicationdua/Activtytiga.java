package com.praktekpertama.myapplicationdua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activtytiga extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tiga);

        TextView tv1 = findViewById(R.id.textView2);
        Button bt1 = findViewById(R.id.button10);
        Button bt2 = findViewById(R.id.button11);
        Button bt3 = findViewById(R.id.button12);
        Button bt4 = findViewById(R.id.button19);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt1 = new Intent(Activtytiga.this, Activitysatu.class);
                startActivity(ibt1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt2 = new Intent(Activtytiga.this, Activitydua.class);
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
                Intent ibt4 = new Intent(Activtytiga.this, Activityempat.class);
                startActivity(ibt4);
            }
        });
    }
}
