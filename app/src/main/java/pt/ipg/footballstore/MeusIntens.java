package pt.ipg.footballstore;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MeusIntens extends AppCompatActivity {

    Button botaoeliminar;
    Button botaoeditar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_intens);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botaoeditar = (Button) findViewById(R.id.buttonEliminar);

        botaoeliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity = new  Intent(MeusIntens.this,Eliminar.class);
                startActivity(outraactivity);
            }
        });
        botaoeditar= (Button) findViewById(R.id.buttonEditar);
        botaoeditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity = new Intent(MeusIntens.this, EditarIntem.class);
                startActivity(outraactivity);
            }
        });

    }

}
