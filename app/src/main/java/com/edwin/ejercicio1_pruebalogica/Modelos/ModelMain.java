package com.edwin.ejercicio1_pruebalogica.Modelos;

import android.content.Context;

import com.edwin.ejercicio1_pruebalogica.Interface.InterfaceMain;

public class ModelMain implements InterfaceMain.Model {
    InterfaceMain.Presenter presenter;

    Context context;
    public ModelMain(Context context, InterfaceMain.Presenter presenter) {
        this.context = context;
        this.presenter = presenter;
    }

    @Override
    public String numerarTexto(String texto, int contador, String textosalida) {

        String textonum="\n"+contador+" "+"-"+" "+texto;
        String txtimprimir="";
        txtimprimir=textosalida+textonum;
        return txtimprimir;
    }
}
