package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Phyquiz extends AppCompatActivity {

    PDFView Phyq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phyquiz);

        Phyq = (PDFView) findViewById(R.id.pdfview2);
        Phyq.fromAsset("physics quiz.pdf").load();

    }
}