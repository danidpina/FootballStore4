package pt.ipg.footballstore;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MaterialDesportivoOpcoes extends AppCompatActivity {

    private Button botaoinserir;
    private  Button botaoeditar;
    private Button botaoeliminar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_casual_opcoes);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botaoeditar=(Button) findViewById(R.id.buttonEditarMDesportivo);
        botaoinserir=(Button) findViewById(R.id.buttonInserirMDesportivo);
        botaoeliminar=(Button) findViewById(R.id.buttonEliminarMDesportivo);

        botaoinserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity=  new Intent(MaterialDesportivoOpcoes.this,MaterialCasual.class);

                startActivity(outraactivity);
            }
        });
        botaoeditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity = new Intent(MaterialDesportivoOpcoes.this, EditarIntem.class);

                startActivity(outraactivity);
            }
        });
        botaoeliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity=  new Intent(MaterialDesportivoOpcoes.this,Eliminar.class);

                startActivity(outraactivity);
            }
        });

    }
}
