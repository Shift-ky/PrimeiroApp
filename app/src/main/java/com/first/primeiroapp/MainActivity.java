package com.first.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random randon = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numeroAleatorio(View view){
        TextView texto = findViewById(R.id.aleatorio);

        int numero = randon.nextInt(10);
        texto.setText("O numero selecionado foi: "+numero);
    }
}