package com.aymerichanabel.micalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //DECLARO VARIABLES

    private EditText numero_uno;
    private EditText numero_dos;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //COMUNICO VARIABLES CON BOTONES

        numero_uno = findViewById(R.id.numero_uno);
        numero_dos = findViewById(R.id.numero_dos);
        respuesta = findViewById(R.id.respuesta);

    }




//METODOS

    public void sumar (View view){

        try {

            Integer respuestanumero = Integer.parseInt(numero_uno.getText().toString()) + Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestanumero + "");

        }catch (Exception e){
            Toast.makeText(this,"Escriba un número",Toast.LENGTH_SHORT).show();
        }

    }

    public void restar (View view){
        try {

            Integer respuestanumero = Integer.parseInt(numero_uno.getText().toString()) - Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestanumero + "");

        }catch (Exception e){
            Toast.makeText(this,"Escriba un número",Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplicar (View view){
        try {

            Integer respuestanumero = Integer.parseInt(numero_uno.getText().toString()) * Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestanumero + "");

        }catch (Exception e){
            Toast.makeText(this,"Escriba un número",Toast.LENGTH_SHORT).show();
        }
    }

    public void dividir (View view){
        try {

            Integer respuestanumero = Integer.parseInt(numero_uno.getText().toString()) / Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestanumero + "");

        }catch (Exception e){
            Toast.makeText(this,"Escriba un número",Toast.LENGTH_SHORT).show();
        }
    }

    public void irayoutube (View view){
        Intent i = new Intent(MainActivity.this,YoutubeActivity.class);
        startActivity(i);
    }

}