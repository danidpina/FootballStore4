package pt.ipg.footballstore;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private Button botaomaterialcasual;
    private Button botaomeusintens;
    private  Button botaomaterialdesportivo;
    private Button botaocategorias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botaomaterialcasual = (Button) findViewById(R.id.buttonMaterialCasual);
        botaomeusintens = (Button) findViewById(R.id.buttonMeusIntens);
        botaomaterialdesportivo = (Button) findViewById(R.id.buttonMaterialDesportivo );
        botaocategorias=(Button) findViewById(R.id.buttonCategoria);
        botaomaterialcasual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity=  new Intent(MainActivity.this,MaterialCasualOpcoes.class);
                Toast.makeText(getApplicationContext(), getString(R.string.carregou_em_material_casual), Toast.LENGTH_SHORT).show();
                startActivity(outraactivity);
            }
        });
        botaomeusintens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity = new Intent(MainActivity.this, MeusIntens.class);
                Toast.makeText(getApplicationContext(), getString(R.string.carregou_para_ver_todos_os_intens), Toast.LENGTH_SHORT).show();
                startActivity(outraactivity);
            }
        });
        botaomaterialdesportivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity=  new Intent(MainActivity.this,MaterialDesportivoOpcoes.class);
                Toast.makeText(getApplicationContext(), getString(R.string.carregou_material_desportivo), Toast.LENGTH_SHORT).show();
                startActivity(outraactivity);
            }
        });
        botaocategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraactivity=  new Intent(MainActivity.this,PaginaCategorias.class);
                Toast.makeText(getApplicationContext(), getString(R.string.carregou_categorias), Toast.LENGTH_SHORT).show();
                startActivity(outraactivity);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
