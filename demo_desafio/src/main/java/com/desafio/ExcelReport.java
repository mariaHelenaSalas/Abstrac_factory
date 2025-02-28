package com.desafio;

public class ExcelReport implements report {
    @Override
    public void generateReport() {
        System.out.println("Generando reporte en formato  Excel...");
    }
    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte en formato  Excel...");
    }

}
