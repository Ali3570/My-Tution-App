package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mathssolution extends AppCompatActivity {

    PDFView Maths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathssolution);

        Maths = (PDFView) findViewById(R.id.pdfview12);
        Maths.fromAsset("maths solution.pdf").load();

    }
}