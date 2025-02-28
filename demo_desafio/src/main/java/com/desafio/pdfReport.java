package com.desafio;

public class pdfReport  implements report {
    @Override
    public void generateReport() {
        System.out.println("Generando reporte en formato  PDF...");
    }

    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte en formato  PDF...");
    }

}
