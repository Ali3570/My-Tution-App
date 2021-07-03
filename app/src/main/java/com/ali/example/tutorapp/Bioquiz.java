package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bioquiz extends AppCompatActivity {

    PDFView Bioq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bioquiz);

        Bioq = (PDFView) findViewById(R.id.pdfview8);
        Bioq.fromAsset("bio quiz.pdf").load();

    }
}