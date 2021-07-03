package com.ali.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ChemSolution extends AppCompatActivity {

    PDFView Chems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem_solution);

        Chems = (PDFView) findViewById(R.id.pdfview6);
        Chems.fromAsset("chemistry solution.pdf").load();

    }
}