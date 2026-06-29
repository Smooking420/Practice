package com.practico.sistemaMensajes;

public class WhatsApp implements Mensaje{
    private String numeroTelefono;
    private String texto;

    public WhatsApp(String numeroTelefono,String texto){
        this.numeroTelefono=numeroTelefono;
        this.texto=texto;
    }
    @Override
    public boolean enviar() {
        if(numeroTelefono.length() == 10){
            System.out.println("Mensaje enviado por WhatsApp");
            return true;
        }
        System.out.println("Numero invalido");
        System.out.println();
        return false; 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--------WhatsApp---------");
        System.out.println("Numero: " + numeroTelefono);
        System.out.println("Mensaje: " + texto);
    }

}
