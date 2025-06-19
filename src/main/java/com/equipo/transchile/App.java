package com.equipo.transchile;
import java.util.logging.Logger;
public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        System.out.println("Sistema de Gestión de Transporte - TransChile");
        logger.info("Cambio de mensaje para log");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
}