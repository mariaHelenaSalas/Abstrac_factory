package com.desafio;

public class csvReport implements report {
    @Override
    public void generateReport() {
        System.out.println("Generando reporte en formato  CSV...");
    }
    
    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte en formato  CSV...");
    }

}
