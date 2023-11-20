package com.example.aktupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fifthpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthpage);
        Button b1;
        b1=findViewById(R.id.MATH1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1;
                i1=new Intent(fifthpage.this,math1pdf.class);
                startActivity(i1);
            }
        });

    }
}