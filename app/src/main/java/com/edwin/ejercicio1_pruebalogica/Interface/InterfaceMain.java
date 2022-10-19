package com.edwin.ejercicio1_pruebalogica.Interface;

public interface InterfaceMain {

    interface View{
        void finElement();
    }

    interface Presenter{
        String numerarTexto(String texto, int contador, String textosalida);
    }

    interface Model{
        String numerarTexto(String texto, int contador, String textosalida);
    }
}
