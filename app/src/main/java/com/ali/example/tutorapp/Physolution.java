package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Physolution extends AppCompatActivity {

    PDFView Phys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physolution);

        Phys = (PDFView) findViewById(R.id.pdfview3);
        Phys.fromAsset("physics solution.pdf").load();

    }
}