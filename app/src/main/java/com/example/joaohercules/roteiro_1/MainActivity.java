package com.example.joaohercules.roteiro_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNome = (TextView) findViewById(R.id.texto);
        Bundle bundle = getIntent().getExtras();
        String texto = bundle.getString("nome");
        tvNome.setText("Olá " + texto + "  Seja bem vindo!");
    }
}
