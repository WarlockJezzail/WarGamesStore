package com.example.wargamesstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import productos.Warhammer;

public class productos_act extends AppCompatActivity {

    Warhammer w= new Warhammer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos_act);

    }
    public void producto1(View view)
    {
        String str1=Integer.toString(w.getW01());
        Intent i= new Intent(this, caja_act.class);
        i.putExtra("Nombre","Lord Croak");
        i.putExtra("Valor", str1);
        startActivity(i);
    }
    public void producto2(View view)
    {
        String str1=Integer.toString(w.getW02());
        Intent i= new Intent(this, caja_act.class);
        i.putExtra("Nombre","Karadron");
        i.putExtra("Valor", str1);
        startActivity(i);
    }
    public void producto3(View view)
    {
        String str1=Integer.toString(w.getW03());
        Intent i= new Intent(this, caja_act.class);
        i.putExtra("Nombre","Vidente Gris");
        i.putExtra("Valor", str1);
        startActivity(i);
    }
    public void producto4(View view)
    {
        String str1=Integer.toString(w.getW04());
        Intent i= new Intent(this, caja_act.class);
        i.putExtra("Nombre","Mago en Disco");
        i.putExtra("Valor", str1);
        startActivity(i);
    }
}
