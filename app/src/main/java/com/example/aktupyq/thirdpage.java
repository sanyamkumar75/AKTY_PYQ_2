package com.example.aktupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdpage);
        Button btn1,btn2,btn3,btn4,btn5;
        btn1=findViewById(R.id.year1);
        btn2=findViewById(R.id.year2);
        btn3=findViewById(R.id.year3);
        btn4=findViewById(R.id.year4);
        btn5=findViewById(R.id.year5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1;
                intent1=new Intent(thirdpage.this,fourthpage.class);
                startActivity(intent1);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2;
                intent2=new Intent(thirdpage.this,fourthpage.class);
                startActivity(intent2);

            }
        });

       btn3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent3;
               intent3=new Intent(thirdpage.this,fourthpage.class);
               startActivity(intent3);
           }
       });
       btn4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent4;
               intent4=new Intent(thirdpage.this ,fourthpage.class);
               startActivity(intent4);
           }
       });
       btn5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent5;
               intent5=new Intent(thirdpage.this,fourthpage.class);
               startActivity(intent5);
           }
       });
    }
}