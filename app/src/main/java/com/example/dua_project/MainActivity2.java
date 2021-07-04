package com.example.dua_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pdfView=(PDFView)findViewById(R.id.opener);
        String getitem=getIntent().getStringExtra("pdfFileNames");
        if(getitem.equals("Pehla Kalma"))
        {
            pdfView.fromAsset("1 kalima.pdf").load();
        }
    }
}