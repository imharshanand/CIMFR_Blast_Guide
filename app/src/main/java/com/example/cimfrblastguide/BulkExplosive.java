package com.example.cimfrblastguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BulkExplosive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk_explosive);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("bulk_explosive.pdf").load();
    }
}
