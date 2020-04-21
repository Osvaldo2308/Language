package com.example.languaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getString(R.string.welcome);
        Toast.makeText(this, getString(R.string.welcome), Toast.LENGTH_LONG).show();
    }
}
