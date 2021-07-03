package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Phynotes extends AppCompatActivity {

    PDFView Phyn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phynotes);

        Phyn = (PDFView) findViewById(R.id.pdfview1);
        Phyn.fromAsset("physics notes.pdf").load();

    }
}