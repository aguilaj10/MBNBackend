/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.util;

/**
 *
 * @author annelkaren
 */
public class StaticConstans {

    public static int MENSAJE_ERROR = 1;
    public static int MENSAJE_ADVERTENCIA = 2;
    public static int MENSAJE_CORRECTO = 3;

    //MENSAJES
    public static String MENSAJE_ERROR_SESION = "El usuario o contraseña son incorrectos";
    public static String MENSAJE_ERROR_CONTRASENA = "El correo electrónico no existe";
    public static String MENSAJE_ERROR_GENERAL = "Ocurrió un error inesperado, contacte al administrador";
    public static String MENSAJE_CORREO_ENCABEZADO = "Notificaci&oacute;n de cambio de contrase&ntilde;a";
    public static String MENSAJE_CORREO_CUERPO = "Haga clic en el siguiente enlace para cambiar la contrase&ntilde;a de la cuenta que utiliza para acceder a MBN M&oacute;vil.";
    public static String MENSAJE_CORREO_PIE = "Este enlace caduca 24 horas despu&eacute;s de su fecha de env&iacute;o. El enlace le dirige a la p&aacute;gina de cambio de contrase&ntilde;as de MBN M&oacute;vil, donde podr&aacute; introducir una nueva.";
    
    //BANDERAS
    public static String HABILITADO = "enable";
    public static String INHABILITADO = "disable";

    //CORREO
    public static String CORREO_EMISOR = "pruebas@mbn.com.mx";
    public static String CONTRASENA = "Facil123";
    public static String REMITENTE = "MBN Móvil";
    public static String ASUNTO = "Cambiar su contraseña";
    public static String URL_IMAGEN = "http://mbn.com.mx/images/logo/logo1.png";
    
    public static int TIEMPO_URL = 24;
}
