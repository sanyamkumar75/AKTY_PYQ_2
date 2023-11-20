package com.example.aktupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthpage);
        Button btn1;
        Button btn2;
        btn2=findViewById(R.id.sem2);
        btn1=findViewById(R.id.sem1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1;
                intent1=new Intent(fourthpage.this,fifthpage.class);
                startActivity(intent1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2;
                intent2=new Intent(fourthpage.this, sixthactivity.class);
                startActivity(intent2);
            }
        });

    }
}