package com.example.solucionparcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtPrices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        Aspirante aspirante = (Aspirante)intent.getSerializableExtra("aspirante");
        txtPrices = findViewById(R.id.textViewPrice2);

        txtPrices.setText((int) aspirante.getValorApagar());
    }
}