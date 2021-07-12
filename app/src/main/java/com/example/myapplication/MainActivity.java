package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "hola", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "hola2", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "hola2", Toast.LENGTH_LONG).show();

    }
}
