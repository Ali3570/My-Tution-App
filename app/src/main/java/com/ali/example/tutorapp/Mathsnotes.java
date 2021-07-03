package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mathsnotes extends AppCompatActivity {

    PDFView Mathn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathsnotes);

        Mathn = (PDFView) findViewById(R.id.pdfview10);
        Mathn.fromAsset("maths notes.pdf").load();

    }
}