package pt.ipg.footballstore;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MaterialCasual extends AppCompatActivity {

    private Button botaoguardar;
    private  Button botaocancelar;
    private EditText edittextnome;
    private EditText edittextquantidade;
    private EditText edittextpreco;
    private EditText edittexttamanho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_desportivo);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botaoguardar = (Button) findViewById(R.id.buttonGuardar1);
        botaocancelar= (Button) findViewById(R.id.buttonCancelar1);
        edittextnome= (EditText) findViewById(R.id.EditTextNome1);
        edittextquantidade= (EditText) findViewById(R.id.EditTextQuantidade1);
        edittextpreco = (EditText) findViewById(R.id.EditTextPreco1);
        edittexttamanho= (EditText) findViewById(R.id.EditTextTamanho1);
        botaoguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensagem = edittextnome.getText().toString();
                String mensagem1 = edittextquantidade.getText().toString();
                String mensagem2 = edittexttamanho.getText().toString();
                String mensagem3 = edittextpreco.getText().toString();
                if (mensagem.trim().length()==0){
                    edittextnome.setError(getString(R.string.escreva_algo));
                    edittextnome.requestFocus();
                }else if (mensagem1.trim().length()==0){
                    edittextquantidade.setError(getString(R.string.escreva_algo));
                    edittextquantidade.requestFocus();
                }else if (mensagem1.matches("0")){
                    edittextquantidade.setError(getString(R.string.escreva_algo));
                    edittextquantidade.requestFocus();
                }else if (mensagem2.trim().length()==0){
                    edittexttamanho.setError(getString(R.string.escreva_algo));
                    edittexttamanho.requestFocus();
                }else if (mensagem2.matches("0")){
                    edittexttamanho.setError(getString(R.string.escreva_algo));
                    edittexttamanho.requestFocus();
                }else if (mensagem3.trim().length()==0){
                    edittextpreco.setError(getString(R.string.escreva_algo));
                    edittextpreco.requestFocus();
                }else if (mensagem3.matches("0")){
                    edittextpreco.setError(getString(R.string.escreva_algo));
                    edittextpreco.requestFocus();
                }else{
                    finish();
                    Toast.makeText(MaterialCasual.this, getString(R.string.peca_guardada), Toast.LENGTH_SHORT).show();
                }
            }
        });
        botaocancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}
