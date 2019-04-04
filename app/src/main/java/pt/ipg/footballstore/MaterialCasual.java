package pt.ipg.footballstore;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MaterialCasual extends AppCompatActivity {

    private Button botaoroupacasual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_casual);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botaoroupacasual= (Button) findViewById(R.id.buttonRoupa);

        botaoroupacasual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity = new Intent(MaterialCasual.this, RoupaCasual.class);
                startActivity(outraactivity);
                Toast.makeText(getApplicationContext(), getString(R.string.carregou_em_roupa), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
