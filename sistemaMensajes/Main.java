package com.practico.sistemaMensajes;

public class Main {
    public static void main(String[] args) {
        WhatsApp whatsApp1 = new WhatsApp("0987654321","Hola, ¿cómo estás?");
        WhatsApp whatsApp2 = new WhatsApp("213","Prueba");

        Email email1 = new Email("javier@gmail.com","Bienvenido","Gracias por registarte");
        Email email2 = new Email("javiergmail.com","Error","Correo invalido");

        Notificador notificador = new Notificador();
        notificador.agregarMensaje(whatsApp1);
        notificador.agregarMensaje(whatsApp2);
        notificador.agregarMensaje(email1);
        notificador.agregarMensaje(email2);

        notificador.enviarTodos();

        
        

    }

}
