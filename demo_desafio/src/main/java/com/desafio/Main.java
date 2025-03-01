package com.desafio;

import java.util.Scanner;

import javax.resource.cci.RecordFactory;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String option;

        do {
            System.out.println("\n===== MENÚ DE REPORTES =====");
            System.out.println("1. Generar Reporte PDF");
            System.out.println("2. Generar Reporte Excel");
            System.out.println("3. Generar Reporte CSV");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = teclado.nextLine();

            if (!option.equals("4")) {
                String format = switch (option) {
                    case "1" -> "PDF";
                    case "2" -> "EXCEL";
                    case "3" -> "CSV";
                    default -> null;
                };

                if (format != null) {
                    report report = reporfactoy.createreport(format);
                    report.generateReport();
                    report.downloadReport();
                } else {
                    System.out.println(" Opción no válida, intente de nuevo.");
                }
            }

        } while (!option.equals("4"));

        System.out.println(" Saliendo del programa...");
        teclado.close();
        


        
     
        
    }
}


