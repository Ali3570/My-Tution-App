package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Chemnotes extends AppCompatActivity {

    PDFView Chemn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemnotes);

        Chemn = (PDFView) findViewById(R.id.pdfview4);
        Chemn.fromAsset("chemistry notes.pdf").load();

    }
}