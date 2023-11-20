package com.example.aktupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Civilsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilsem);
        Button bt1,bt3,bt2,bt4,bt5,bt6,bt7,bt8;
        bt1=findViewById(R.id.csem1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1=new Intent(Civilsem.this, sixthactivity.class);
                startActivity(it1);
            }

        });
        bt2=findViewById(R.id.csem2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2;
                it2=new Intent(Civilsem.this,sixthactivity.class);
                startActivity(it2);
            }
        });
        bt3=findViewById(R.id.csem5);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IT4;
                IT4=new Intent(Civilsem.this, civilsubjects.class);
                startActivity(IT4);
            }
        });
        bt4=findViewById(R.id.csem6);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it5;
                it5=new Intent(Civilsem.this, civilsubjects2.class);
                startActivity(it5);
            }
        });
        bt5=findViewById(R.id.csem3);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it6;
                it6=new Intent(Civilsem.this, civilsubjectsem3.class);
                startActivity(it6);
            }
        });
        bt6=findViewById(R.id.csem4);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it7;
                it7=new Intent(Civilsem.this,civilsubjectsem4.class);
                startActivity(it7);
            }
        });
        bt7=findViewById(R.id.csem7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it8;
                it8 = new Intent(Civilsem.this, civilsub7.class);
                startActivity(it8);
            }
        });
        bt8 = findViewById(R.id.csem8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it9;
                it9= new Intent(Civilsem.this, civilsub8.class);
                startActivity(it9);
            }
        });


    }
}