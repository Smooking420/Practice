package com.practico.tiendaV;

import java.util.HashMap;

public class Juego {

    private String codigo;
    private String nombre;
    private TipoJuego tipo;
    private boolean disponible;
    private HashMap<String,String> detalles;

    public Juego(String codigo, String nombre ,TipoJuego tipo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.tipo=tipo;
        disponible=true;
        detalles = new HashMap<>();
    }

    public void agregarDetalle(String clave,  String valor){
        detalles.put(clave, valor);
    }

    public void mostrarInformacion(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        if(disponible==true){
            System.out.println("Estado: Disponible");
        }else{
            System.out.println("Estado: No Disponible");
        }
        System.out.println("Detalles: ");
       for(String clave : detalles.keySet()){
        System.out.println(clave + " : " + detalles.get(clave));
       }

    }

    public String getCodigo(){
        return codigo;
    }

    public TipoJuego getTipo(){
        return tipo;
    }
    
}
