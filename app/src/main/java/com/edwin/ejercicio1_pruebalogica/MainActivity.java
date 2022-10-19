package com.edwin.ejercicio1_pruebalogica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.edwin.ejercicio1_pruebalogica.Interface.InterfaceMain;
import com.edwin.ejercicio1_pruebalogica.Presentadores.PresenterMain;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener, InterfaceMain.View{

    EditText txtentrada;
    TextView viewsalida;
    Button btnimprimir;
    InterfaceMain.Presenter presenter;
    String txtanterior="";
    int contador=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.finElement();
        presenter = new PresenterMain(this,MainActivity.this);


    }

    @Override
    public void onClick(View view) {
        if(!txtentrada.getText().toString().equals("")){
            String textoingresa=txtentrada.getText().toString();
            String textosalida=presenter.numerarTexto(textoingresa, contador, txtanterior );
            txtanterior=textosalida;
            viewsalida.setText(textosalida);
            txtentrada.setText("");
            contador++;

        }

    }

    @Override
    public void finElement() {
        txtentrada=findViewById(R.id.txtentrada);
        viewsalida=findViewById(R.id.viewsalida);
        btnimprimir=findViewById(R.id.btnimprimir);
        btnimprimir.setOnClickListener(this);
    }
}