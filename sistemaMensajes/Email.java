package com.practico.sistemaMensajes;

public class Email implements Mensaje{
    private String correo;
    private String asunto;
    private String mensaje;

    public Email(String correo, String asunto, String mensaje){
        this.correo=correo;
        this.asunto=asunto;
        this.mensaje=mensaje;
    }

    @Override
    public boolean enviar() {
       if(correo.contains("@")){
        System.out.println("Correo enviado correctamente.");
        return true;
       }
       System.out.println("Correo invalido");
       System.out.println();
       return false;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--------Email---------");
        System.out.println("Correo: " + correo);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
    }

}
