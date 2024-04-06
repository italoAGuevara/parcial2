package com.example.solucionparcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Aspirante aspirante;
    private TextView txtNombres, txtApellidos, txtCorreos, txtCedula,
            txtPrecio, txtCarrera,txtCelular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aspirante = new Aspirante();

        txtNombres = findViewById( R.id.editTextFirstName);
        txtApellidos = findViewById( R.id.editTextLastName);
        txtCorreos = findViewById( R.id.editTextTextEmailAddress);
        txtCedula = findViewById( R.id.editTextCedula);
        txtPrecio = findViewById( R.id.textViewPrice);
        txtCelular= findViewById( R.id.editTextPhone);
    }

    public void sendBudgedt(View view){
        aspirante.setNombres( String.valueOf( txtNombres.getText() ) );
        aspirante.setApellidos( String.valueOf( txtApellidos.getText() ) );
        aspirante.setCelular( String.valueOf( txtCelular.getText() ) );
        aspirante.setCedula( String.valueOf( txtCedula.getText() ) );
        aspirante.setCorreos( String.valueOf( txtCorreos.getText() ) );

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("aspirante", aspirante);
        startActivity(intent);
    }
}