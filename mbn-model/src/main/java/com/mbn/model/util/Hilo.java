/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.util;

/**
 * Clase que crea un proceso para el envío de correo en cambio de contraseña
 *
 * @author Annel González
 */
public class Hilo extends Thread {

    private String email;
    private String asunto;
    private String mensaje;

    public Hilo(String param1, String param2, String param3) {
        this.email = param1;
        this.asunto = param2;
        this.mensaje = param3;
    }

    public void run() {

        try {
            CorreoUtil.enviarCorreo(email, asunto, mensaje);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
