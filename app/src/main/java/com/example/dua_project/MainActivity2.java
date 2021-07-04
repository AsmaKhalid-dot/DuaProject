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
        if(getitem.equals("سوتے وقت کی دعا"))
        {
            pdfView.fromAsset("Soty waqt.pdf").load();
        }
        else if(getitem.equals("نیند سے بیدار ہونے کی دعا"))
        {
            pdfView.fromAsset("So kr uthny ki dua.pdf").load();
        }
        else if(getitem.equals("نیا چاند دیکھنے کی دعا"))
        {
            pdfView.fromAsset("Naya chand dekhny ki dua.pdf").load();
        }
        else if(getitem.equals("بیت الخلاء میں داخل ہونے سے پہلے کی دعا"))
        {
            pdfView.fromAsset("Bait ul khala ki dua.pdf").load();
        }
        else if(getitem.equals("سفر شروع کرنے کی دعا"))
        {
            pdfView.fromAsset("Safar shuru krny ki dua.pdf").load();
        }
        else if(getitem.equals("گھر سے نکلنے کی دعا")) {
            pdfView.fromAsset("Gar sy niklty waqt ki dua.pdf").load();
        }
        else if(getitem.equals("مصیبت آئے تو یہ دعا"))
        {
            pdfView.fromAsset("musibat k waqt ki dua.pdf").load();
        }
        else if(getitem.equals("جنازہ دیکھنے کی دعا")) {
            pdfView.fromAsset("janazah dekhty waqt ki dua.pdf").load();
        }
    }
}