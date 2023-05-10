package com.praktekpertama.myapplicationdua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activitysatu extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_satu);

        TextView tv1 = findViewById(R.id.textView);
        Button bt1 = findViewById(R.id.button);
        Button bt2 = findViewById(R.id.button2);
        Button bt3 = findViewById(R.id.button6);
        Button bt4 = findViewById(R.id.button17);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt1 = new Intent(Activitysatu.this, Activitydua.class);
                startActivity(ibt1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibt2 = new Intent(Activitysatu.this, Activtytiga.class);
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
                Intent ibt4 = new Intent(Activitysatu.this, Activityempat.class);
                startActivity(ibt4);
            }
        });


    }
}
