package com.practico.sistemaMensajes;

public class Notificador {
    private Mensaje[] mensajes;
    private int cantidadMensajes;

    public Notificador(){
        mensajes = new Mensaje[10];
        cantidadMensajes = 0;
    }

    public void agregarMensaje(Mensaje mensaje){
        if(cantidadMensajes<mensajes.length){
            mensajes[cantidadMensajes]=mensaje;
            cantidadMensajes++;
        }else{
            System.out.println("No hay espaco para mas mensajes");
        }
    }

    public void enviarTodos(){
        for(int i=0; i<cantidadMensajes; i++){
            if(mensajes[i].enviar()){
                mensajes[i].mostrarInformacion();
                System.out.println();
            }
        }
    }

}
