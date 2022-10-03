package com.example.asigalimno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText datoMatematicas; //Objetos de tipo EditText para almecenar el dato del usuario que ingrese en matemáticas
    private EditText datoFisica;//Objetos de tipo EditText para almecenar el dato del usuario que ingrese en fisica
    private EditText datoQuimica;//Objetos de tipo EditText para almecenar el dato del usuario que ingrese en quimica
    private TextView resultado;//Objetos de tipo TextView para mostrar por pantalla


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Button boton = (Button)findViewById(R.id.buttonMedia);//Referenciamos el boton
        boton.setOnClickListener(new View.OnClickListener() {//Nos notifica si se ha hecho click el boton y como parametro y se craera una clase View...
            @Override
            public void onClick(View view) {//Al hacer click en el boton ejecutará el metodo de media
                media();
            }
        });
 */

        //La clase R hace la comunicacion entre la parte lógica y la parte grafica
        //Recuperamos los datos y lo alojamos en las variables
        datoMatematicas = (EditText) findViewById(R.id.editTextNumberMates);
        datoFisica = (EditText) findViewById(R.id.editTextNumber2Fisi);
        datoQuimica = (EditText) findViewById(R.id.editTextNumber3Quimica);
        //resultado = (TextView) findViewById(R.id.textView_Resultado);


    }



    //Metodo Boton
    public void  Enviar(View view){

        Intent intent = new Intent(this, SegunadaActivity.class);//Nos permite enviar datos desde este activity al segundo
        intent.putExtra("notaMates",  datoMatematicas.getText().toString());
        intent.putExtra("notaFisi", datoFisica.getText().toString());
        intent.putExtra("notaQuimica", datoQuimica.getText().toString());

        startActivity(intent);

    }



}