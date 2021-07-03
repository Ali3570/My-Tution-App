package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button button_subject,button_quiz,button_solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button_subject = findViewById(R.id.btn_subj);
        button_quiz = findViewById(R.id.btn_quiz);
        button_solution = findViewById(R.id.btn_sol);

        getSupportFragmentManager().beginTransaction().add(R.id.maincontainer, new Fragment_1()).commit();

        button_subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer, new Fragment_1()).commit();

            }
        });
        button_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer, new Fragment_2()).commit();

            }
        });
        button_solution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer, new Fragment_3()).commit();
            }
        });

    }
}