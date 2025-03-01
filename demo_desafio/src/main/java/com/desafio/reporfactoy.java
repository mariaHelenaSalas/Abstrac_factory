package com.desafio;

public class reporfactoy {
    public static report createreport(String type) {
        return switch (type.toUpperCase()) {
            case "PDF" -> new pdfReport();
            case "EXCEL" -> new ExcelReport();
            case "CSV" -> new csvReport();
            default -> throw new IllegalArgumentException("❌ Formato no soportado: " + type);
        }; 
    

    }
}
