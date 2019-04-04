package pt.ipg.footballstore;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Eliminar extends AppCompatActivity {

    private Button botaoeliminar;
    private Button botaocancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botaoeliminar =  (Button) findViewById(R.id.buttonEleminarEl);
        botaocancelar= (Button) findViewById(R.id.buttonCancelarEliminar);

        botaoeliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(Eliminar.this, "Peça eliminada com sucesso", Toast.LENGTH_SHORT).show();
            }
        });
        botaocancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(Eliminar.this, "Cancelado", Toast.LENGTH_SHORT).show();
            }
        });



    }

}
