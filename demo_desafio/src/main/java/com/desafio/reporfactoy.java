package com.desafio;

public class reporfactoy {
    public report getReport(String type) {
         switch (type.toLowerCase()) {

        case "pdf":
            return new pdfReport();

        case "csv":
            return new csvReport();

        case "excel":
            return new ExcelReport();
        
     
        default:
            throw new IllegalArgumentException("Tipo de reporte no soportado");
     }

   }
}
