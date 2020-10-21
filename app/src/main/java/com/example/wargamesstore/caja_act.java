package com.example.wargamesstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import productos.Warhammer;

public class caja_act extends AppCompatActivity {

    private TextView t_Producto; // Texto del producto traido desde su seleccion (Texto producto)
    private TextView tR_Pagado; // Texto emitido al pagar un monto mayot o menor al producto (Texto respuesta de pago)
    private EditText et_Pagar; // Texto editable donde pondremos la cantidad a pagar


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caja);

        String dato = getIntent().getStringExtra("Nombre");
        String dato2 = getIntent().getStringExtra("Valor");
        Warhammer w = new Warhammer();
        t_Producto = (TextView) findViewById(R.id.textArticulo);
        tR_Pagado = (TextView) findViewById(R.id.textTotalPagar);
        et_Pagar = (EditText) findViewById(R.id.Pagar);

        t_Producto.setText(dato);
        tR_Pagado.setText("Debe pagar " + dato2);
    }

    public void pago(View v) {
        String dato2 = getIntent().getStringExtra("Valor"); //traemos nuevamente el valor
        String Pago = et_Pagar.getText().toString();
        int iPago = Integer.parseInt(et_Pagar.getText().toString());
        int iPagado = Integer.parseInt(dato2);
        int cambio = iPago - iPagado;

        if (iPago < iPagado) {

            tR_Pagado.setText("La cantidad de dinero enviada no es suficiente, aun faltan " + (cambio * -1));

        } else {
            tR_Pagado.setText("Gracias por su compra, su cambio es de " + (cambio));
        }
    }
}