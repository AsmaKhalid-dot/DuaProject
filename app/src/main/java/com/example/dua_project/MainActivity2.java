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
        if(getitem.equals("Quran Prhny ki Dua"))
        {
            pdfView.fromAsset("A.pdf").load();
        }
        else if(getitem.equals("Wazu sy pehly ki Dua"))
        {
            pdfView.fromAsset("B.pdf").load();
        }
        else if(getitem.equals("Masjid mein any ki Dua"))
        {
            pdfView.fromAsset("C.pdf").load();
        }
        else if(getitem.equals("Masjid sy nikalny ki Dua"))
        {
            pdfView.fromAsset("D.pdf").load();
        }
        else if(getitem.equals("Ghr sy nikalny ki Dua"))
        {
            pdfView.fromAsset("E.pdf").load();
        }
        else if(getitem.equals("Khana khany sy phly ki dua")) {
            pdfView.fromAsset("F.pdf").load();
        }
        else if(getitem.equals("Khana khany k bad ki dua"))
        {
            pdfView.fromAsset("G.pdf").load();
        }
        else if(getitem.equals("Sehri ki dua"))
        {
            pdfView.fromAsset("H.pdf").load();
        }
        else if(getitem.equals("Aftar ki dua"))
        {
            pdfView.fromAsset("I.pdf").load();
        }
        else if(getitem.equals("Chenk any ki dua"))
        {
            pdfView.fromAsset("J.pdf").load();
        }
        else if(getitem.equals("Ilam mein azafe ki dua"))
        {
            pdfView.fromAsset("K.pdf").load();
        }
    }
}