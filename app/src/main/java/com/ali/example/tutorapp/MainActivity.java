package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1=findViewById(R.id.btn_continue);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
            }
            public void openMainActivity2() {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}