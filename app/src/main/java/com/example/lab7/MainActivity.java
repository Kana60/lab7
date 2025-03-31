package com.example.lab7;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Добавь вывод текста
        TextView textView = new TextView(this);
        textView.setText("Hello, World!");
        setContentView(textView);
    }
}

Button button = findViewById(R.id.button);
button.setOnClickListener(v -> {
TextView textView = findViewById(R.id.textView);
    textView.setText("Button Clicked");
});


Button button = findViewById(R.id.button);
button.setOnClickListener(v -> {
Intent intent = new Intent(MainActivity.this, NewActivity.class);
startActivity(intent);
});

