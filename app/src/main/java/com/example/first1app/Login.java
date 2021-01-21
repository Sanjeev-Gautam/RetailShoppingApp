package com.example.first1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button scanproduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        scanproduct = findViewById(R.id.button);
        scanproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToScanBarcode();
            }
        });


    }

    private void moveToScanBarcode() {
        Intent intent = new Intent(Login.this, Main2Activity.class);
        startActivity(intent);
    }
}