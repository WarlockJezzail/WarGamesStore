package com.example.wargamesstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper vf;
    //
    private int[] images={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        vf= (ViewFlipper)findViewById(R.id.slider);

        for (int i=0;i<images.length; i++)
        {
            flip_image(images[i]);
        }
    }
    public void flip_image(int i)
    {
        ImageView view =new ImageView(this);
        view.setBackgroundResource(i);

        vf.addView(view);
        vf.setAutoStart(true);
        vf.setFlipInterval(5000);

        vf.setInAnimation(this, android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    //////////////// INTENTS///////////////////
    public void Productos(View view){
        Intent i= new Intent(this, productos_act.class);
        startActivity(i);
    }
    public void Ofertas(View view){
        Intent i= new Intent(this, ofertas_act.class);
        startActivity(i);
    }
    public void Eventos(View view){
        Intent i= new Intent(this, eventos_act.class);
        startActivity(i);
    }
    public void Contacto(View view){
        Intent i= new Intent(this, contacto_act.class);
        startActivity(i);
    }
    public void Login(View view){
        Intent i= new Intent(this, log_act.class);
        startActivity(i);
    }
    /////////////TERMINO DE INTENTS/////////////////


}