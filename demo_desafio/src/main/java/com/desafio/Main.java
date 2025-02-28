package com.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Seleccione el formato del reporte a generar:");
        System.out.println("1. PDF");
        System.out.println("2. CSV");
        System.out.println("3. Excel");     
        int opcion = teclado.nextInt();
        
        report reporte = null;
        switch (opcion) {
            case 1:
                reporte = new pdfReport();
                break;
            case 2:
                reporte = new csvReport();
                break;
            case 3:
                reporte = new ExcelReport();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        if (reporte != null) {
            reporte.generateReport();
            reporte.downloadReport();
        }else{
            System.out.println("No se generó el reporte");
        }

        teclado.close();
        


        
     
        
    }
}


