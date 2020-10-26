package com.example.wargamesstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import productos.AdminSQLiteOpenHelper;

public class datos_act extends AppCompatActivity {

    private EditText et1,et2,et3,et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql_act);

        et1=(EditText)findViewById(R.id.etCodigo);
        et2=(EditText)findViewById(R.id.etNombre);
        et3=(EditText)findViewById(R.id.etPrecio);
        et4=(EditText)findViewById(R.id.etStock);
    }

    public void Guardar(View v){
        AdminSQLiteOpenHelper admin= new AdminSQLiteOpenHelper(this,"fichero",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();

        String codigo= et1.getText().toString();

        if(!codigo.isEmpty()){

            ContentValues cont= new ContentValues();
            cont.put("codigo",et1.getText().toString());
            cont.put("codigo",et2.getText().toString());
            cont.put("codigo",et3.getText().toString());
            cont.put("codigo",et4.getText().toString());

            db.insert("insumos",null,cont);
            db.close();

            Toast.makeText(this,"Has ingresado un producto",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"debe ingresar un codigo",Toast.LENGTH_LONG).show();
        }
    }
    public void Mostrar(View v){}
    public void Eliminar(View v){}
    public void Actualizar(View v){}

}