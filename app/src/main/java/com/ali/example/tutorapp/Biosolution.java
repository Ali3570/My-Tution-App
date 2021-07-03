package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Biosolution extends AppCompatActivity {

    PDFView Bios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biosolution);

        Bios = (PDFView) findViewById(R.id.pdfview9);
        Bios.fromAsset("bio solution.pdf").load();

    }
}