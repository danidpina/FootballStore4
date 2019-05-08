package pt.ipg.footballstore;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class PaginaCategorias extends AppCompatActivity {

    private Button botaoinserir;
    private  Button botaoeditar;
    private Button botaoeliminar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_categorias);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botaoeditar=(Button) findViewById(R.id.buttonEditarCategoria);
        botaoinserir=(Button) findViewById(R.id.buttonInserirCategoria);
        botaoeliminar=(Button) findViewById(R.id.buttonEliminarCategoria);

        botaoinserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity=  new Intent(PaginaCategorias.this,InserirCategoria.class);

                startActivity(outraactivity);
            }
        });
        botaoeditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity = new Intent(PaginaCategorias.this, EditarCategoria.class);

                startActivity(outraactivity);
            }
        });
        botaoeliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity=  new Intent(PaginaCategorias.this,EliminarCategoria.class);

                startActivity(outraactivity);
            }
        });

    }

}
