package com.curso.niver4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.curso.niver4.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMap(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }
}