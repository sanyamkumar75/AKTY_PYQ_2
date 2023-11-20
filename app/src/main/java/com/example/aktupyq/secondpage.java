package com.example.aktupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        Button btn1;
        Button btn2;
        Button btn3;
        Button btn4;
        Button btn5;
        Button btn6,btn7,btn8;
        btn6=findViewById(R.id.mech);
        btn7=findViewById(R.id.EC);
        btn8=findViewById(R.id.EE);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7;
                intent7=new Intent(secondpage.this,fourthpage.class);
                startActivity(intent7);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8;
                intent8=new Intent(secondpage.this ,fourthpage.class);
                startActivity(intent8);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9;
                intent9=new Intent(secondpage.this,fourthpage.class);
                startActivity(intent9);
            }
        });


        btn5=findViewById(R.id.civil);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6;
                intent6=new Intent(secondpage.this,Civilsem.class);
                startActivity(intent6);

            }
        });
        btn4=findViewById(R.id.csit);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5;
                intent5=new Intent(secondpage.this,thirdpage.class);
                startActivity(intent5);
            }
        });
        btn3=findViewById(R.id.ITbtn);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4;
                intent4=new Intent(secondpage.this,fourthpage.class);
                startActivity(intent4);
            }
        });
        btn2=findViewById(R.id.csbtn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3;
                intent3=new Intent(secondpage.this,fourthpage.class);
                startActivity(intent3);

            }
        });
        btn1 = findViewById(R.id.csebtn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2;
                intent2 = new Intent(secondpage.this, fourthpage.class);
                startActivity(intent2);
            }
        });

    }
}