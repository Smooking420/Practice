package com.practico.tiendaV;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Juego> juegos;

    public Tienda(){
        juegos = new ArrayList<>();
    }

    public void registrarJuego(Juego juego){
        juegos.add(juego);
    }

    public void mostrarJuegos(){
        for(Juego juego : juegos){
            juego.mostrarInformacion();
        }
    }

    public Juego buscarCodigo(String codigo){
       for(Juego juego : juegos){
        if(juego.getCodigo().equals(codigo)){
            return juego;
        }
       }
       return null;
    }

    public ArrayList<Juego> filtarTipo(TipoJuego tipo){
        ArrayList<Juego> lista = new ArrayList<>();
        for(Juego juego : juegos){
            if(juego.getTipo()==tipo){
                lista.add(juego);
            }
        }
        return lista;
    }

}
