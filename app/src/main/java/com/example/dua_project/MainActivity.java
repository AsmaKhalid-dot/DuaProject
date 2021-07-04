package com.example.dua_project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.dua);
        String[] pdfFileNames = {"Quran Prhny ki Dua", "Wazu sy pehly ki Dua", "Masjid mein any ki Dua", "Masjid sy nikalny ki Dua", "Ghr sy nikalny ki Dua", "Khana khany sy phly ki dua","Khana khany k bad ki dua","Sehri ki dua","Aftar ki dua","Chenk any ki dua","Ilam mein azafe ki dua",""};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdfFileNames) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);

                return view;
            }
        };
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = listview.getItemAtPosition(position).toString();
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("pdfFileNames",item);
                startActivity(intent);
            }
        });
    }
}