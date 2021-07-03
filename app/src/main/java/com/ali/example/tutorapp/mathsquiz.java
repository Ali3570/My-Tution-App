package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mathsquiz extends AppCompatActivity {

    PDFView Mathq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathsquiz);

        Mathq = (PDFView) findViewById(R.id.pdfview11);
        Mathq.fromAsset("maths quiz.pdf").load();

    }
}