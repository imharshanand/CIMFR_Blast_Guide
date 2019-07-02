package com.example.cimfrblastguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class disclaimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("disclaimer.pdf").load();
    }
}
