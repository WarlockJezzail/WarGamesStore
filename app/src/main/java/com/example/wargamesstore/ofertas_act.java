package com.example.wargamesstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import productos.Warhammer;

public class ofertas_act extends AppCompatActivity {
    Warhammer w= new Warhammer();
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ofertas_act);
        text=(TextView)findViewById(R.id.tv1);
        text.setText("El precio es de "+ w.getW05());
    }
    public void Compra(View view)
    {
        String str1=Integer.toString(w.getW05());
        Intent i= new Intent(this, caja_act.class);
        i.putExtra("Nombre","Golpe de la Tormenta");
        i.putExtra("Valor", str1);
        startActivity(i);
    }
}