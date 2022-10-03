package com.example.asigalimno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegunadaActivity extends AppCompatActivity {

    private TextView txmate;
    private TextView txfisi;
    private TextView txquimi;
    private TextView txres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunada);


        txmate = (TextView) findViewById(R.id.textView_notaMate);
        txfisi = (TextView) findViewById(R.id.textView_notaFisi);
        txquimi = (TextView) findViewById(R.id.textView_notaQuimi);
        txres = (TextView) findViewById(R.id.textView_Resultado);

        txmate.setText("Nota de matemáticas: " + getIntent().getStringExtra("notaMates"));
        txfisi.setText("Nota de física: " + getIntent().getStringExtra("notaFisi"));
        txquimi.setText("Nota de química: " + getIntent().getStringExtra("notaQuimica"));
        media();



    }
    //Metodo para realiza la suma y su media
    public void media() { //Utilizamos un objetod de la clase View que nos permite dibujar los componentes

        //Parseamos de string a entero para posteriormente realizar la operacion
        int valor1 = Integer.parseInt(getIntent().getStringExtra("notaMates"));
        int valor2 = Integer.parseInt(getIntent().getStringExtra("notaFisi"));
        int valor3 = Integer.parseInt(getIntent().getStringExtra("notaQuimica"));

        int media = ((valor1 + valor2 + valor3) / 3);//Realizamos la operacion y la guardamos en la variable

        if (media > 4) {// Si es mayor de 4 mostrará el mensaje de aprobado
            txres.setText("Has aprobado con un: " + Integer.toString(media));//Pasamos la media a string y la mostramos por pantalla

        } else {
            txres.setText("Has suspendido con un: " + Integer.toString(media));
        }



    }

}