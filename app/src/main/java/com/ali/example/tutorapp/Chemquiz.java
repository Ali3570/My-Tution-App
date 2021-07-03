package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Chemquiz extends AppCompatActivity {

    PDFView Chemq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemquiz);

        Chemq = (PDFView) findViewById(R.id.pdfview5);
        Chemq.fromAsset("chemistry quiz.pdf").load();

    }
}