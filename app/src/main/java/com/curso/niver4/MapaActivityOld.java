package com.curso.niver4;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MapaActivityOld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mostrarGoogleMaps(2.8253045, -60.6775759);//Praça das aguas
    }

    public void mostrarGoogleMaps(double latitude, double longitude) {
       /* WebView wv = findViewById(R.id.webv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://www.google.com/maps/search/?api=1&query=" + latitude + "," + longitude);*/
    }
}