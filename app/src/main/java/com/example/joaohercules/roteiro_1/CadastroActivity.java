package com.example.joaohercules.roteiro_1;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Iterator;

public class CadastroActivity extends AppCompatActivity {

    private EditText etNome;
    private EditText etSobrenome;
    private EditText etUsuario;
    private EditText etSenha;
    private EditText etConfirmaSenha;
    private Button btCadastra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNome = (EditText)findViewById(R.id.editTextNome);
        etSobrenome = (EditText) findViewById(R.id.editTextSobrenome);
        etUsuario = (EditText)findViewById(R.id.editTextUsuario);
        etSenha = (EditText)findViewById(R.id.editTextSenha);
        etConfirmaSenha = (EditText)findViewById(R.id.editTextConfirmarSenha);
        btCadastra = (Button)findViewById(R.id.buttonCadastrar);

        btCadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrar();

            }
        });


    }

    public void cadastrar(){

        String nome = etNome.getText().toString();
        String sobrenome = etSobrenome.getText().toString();
        String usuario = etUsuario.getText().toString();
        String senha = etSenha.getText().toString();
        String confirmar_senha = etConfirmaSenha.getText().toString();


        if(nome.equalsIgnoreCase("Joao") && sobrenome.equalsIgnoreCase("Hercules") && usuario.equalsIgnoreCase("12345")
                &&senha.equalsIgnoreCase("101010") && confirmar_senha.equals(senha)){

                Intent intent = new Intent(this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", nome);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();

        }else{
            View focus = null;
            boolean exibir = false;
            if(TextUtils.isEmpty(nome)){
                this.etNome.setError("Campo Vazio");
                focus = etNome;
                exibir = true;

            }
            if(TextUtils.isEmpty(usuario)){
                this.etUsuario.setError("Campo Vazio");
                focus = etUsuario;
                exibir = true;

            }if(TextUtils.isEmpty(sobrenome)){
                this.etSobrenome.setError("Campo Vazio");
                focus = etSobrenome;
                exibir = true;

            }
            if(TextUtils.isEmpty(senha)){
                this.etSenha.setError("Campo Vazio");
                focus = etSenha;
                exibir = true;

            }
            if(TextUtils.isEmpty(confirmar_senha)){
                this.etConfirmaSenha.setError("Campo Vazio");
                focus = etConfirmaSenha;
                exibir = true;

            }
            else{
                etConfirmaSenha.setError("as senhas devem ser iguais!");
                focus = etConfirmaSenha;
                exibir = true;
            }
            if(exibir){
                focus.requestFocus();
            }

        }





            





    }


}
