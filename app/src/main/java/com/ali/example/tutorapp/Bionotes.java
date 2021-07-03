package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bionotes extends AppCompatActivity {

    PDFView Bion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bionotes);

        Bion = (PDFView) findViewById(R.id.pdfview7);
        Bion.fromAsset("bio notes.pdf").load();

    }
}