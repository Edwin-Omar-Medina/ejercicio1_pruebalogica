package com.edwin.ejercicio1_pruebalogica.Presentadores;

import android.content.Context;

import com.edwin.ejercicio1_pruebalogica.Interface.InterfaceMain;
import com.edwin.ejercicio1_pruebalogica.Modelos.ModelMain;

public class PresenterMain implements InterfaceMain.Presenter {
    InterfaceMain.View view;
    InterfaceMain.Model model;
    Context context;
    public PresenterMain(InterfaceMain.View view, Context context) {
        this.view = view;
        this.context=context;
        this.model = new ModelMain(context, this);
    }

    @Override
    public String numerarTexto(String texto, int contador, String textosalida) {
        return this.model.numerarTexto(texto, contador, textosalida);
    }
}
