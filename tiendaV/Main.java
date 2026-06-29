package com.practico.tiendaV;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        
        Juego juego1 = new Juego("J001", "Minecraft",TipoJuego.AVENTURA);
        Juego juego2 = new Juego("J002", "FIFA 26",TipoJuego.DEPORTE);
        Juego juego3 = new Juego("J003", "Call of Duty",TipoJuego.ACCION);
        
        juego1.agregarDetalle("Plataforma","PC");
        juego1.agregarDetalle("Año", "2011");
        juego1.agregarDetalle("Desarrollador","Mojang");

        juego2.agregarDetalle("Plataforma","PS5");
        juego2.agregarDetalle("Año", "2026");
        juego2.agregarDetalle("Desarrollador","EA Sports");

        juego3.agregarDetalle("Plataforma","Xbox");
        juego3.agregarDetalle("Año", "2025");
        juego3.agregarDetalle("Desarrollador","Activision");
        
        tienda.registrarJuego(juego1);
        tienda.registrarJuego(juego2);
        tienda.registrarJuego(juego3);

        tienda.mostrarJuegos();

        Juego encontrar  = tienda.buscarCodigo("J002");
        if(encontrar != null){
            encontrar.mostrarInformacion();
        }else{
            System.out.println("Juego no encontrado");
        }


        ArrayList<Juego> aventura = tienda.filtarTipo(TipoJuego.AVENTURA);
        for(Juego juego : aventura){
            juego.mostrarInformacion();
        }

    }

}
