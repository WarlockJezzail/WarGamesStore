package com.example.wargamesstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Entrar_act extends AppCompatActivity {

    private EditText name,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar_act);

        name=(EditText)findViewById(R.id.etNombre);
        pass=(EditText)findViewById(R.id.etPasword);
    }

    public void Ingresar(View view){
        String n=name.getText().toString();
        String p=pass.getText().toString();

        if(n.equals("admin")&&p.equals("password")){
            Intent i=new Intent(this,datos_act.class);
            startActivity(i);
        }
        if(n.equals("user")&&p.equals("password")){
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
        }
    }

}