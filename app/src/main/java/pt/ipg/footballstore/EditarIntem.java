package pt.ipg.footballstore;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditarIntem extends AppCompatActivity {

    private EditText edittextnome;
    private EditText edittextquantidade;
    private EditText edittextpreco;
    private EditText edittexttamanho;
    private Button botaoguardar;
    private  Button botaocancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_intem);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edittextnome= (EditText) findViewById(R.id.EditTextNome);
        edittextquantidade= (EditText) findViewById(R.id.EditTextQuantidade);
        edittextpreco = (EditText) findViewById(R.id.EditTextPreco);
        edittexttamanho= (EditText) findViewById(R.id.EditTextTamanho);
        botaoguardar = (Button) findViewById(R.id.buttonGuardar2);
        botaocancelar= (Button) findViewById(R.id.buttonCancelar2);

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
                }else if (mensagem2.trim().length()==0){
                    edittexttamanho.setError(getString(R.string.escreva_algo));
                    edittexttamanho.requestFocus();
                }else if (mensagem3.trim().length()==0){
                    edittextpreco.setError(getString(R.string.escreva_algo));
                    edittextpreco.requestFocus();
                }else{
                    finish();
                    Toast.makeText(EditarIntem.this, getString(R.string.peca_alterada), Toast.LENGTH_SHORT).show();
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
