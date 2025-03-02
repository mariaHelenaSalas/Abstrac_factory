# 🔧 Abstract Factory - Generador de Reportes

## 📚 Descripción
Este proyecto implementa el patrón de diseño **Abstract Factory** en Java para generar reportes en diferentes formatos: **PDF, Excel y CSV**. Permite a los usuarios seleccionar el tipo de reporte y descargarlo automáticamente.

## ✅ Tecnologías Utilizadas
- **Java** (JDK 17+)
- **Maven** (para la gestión de dependencias)
- **Patrón de Diseño Abstract Factory**

## Estructura del Proyecto
```
Abstrac_factory
│── src/main/java/com/desafio
│   ├── Main.java          # Clase principal
│   ├── report            # Interfaz Report
│   ├── pdfReport.java     # Implementación del reporte en PDF
│   ├── ExcelReport.java   # Implementación del reporte en Excel
│   ├── csvReport.java     # Implementación del reporte en CSV
│   ├── reportFactory.java # Fábrica para generar los reportes
│── pom.xml               # Archivo de configuración de Maven
```

## 🛠️ Instalación y Ejecución
### Requisitos previos
- Tener instalado **Java 17+**
- Tener instalado **Maven**

### Clonar el repositorio
```bash
git clone https://github.com/mariaHelenaSalas/Abstrac_factory.git
cd Abstrac_factory
```


## ⚙ Uso del Programa
1. Al ejecutar el programa, verás un menú con opciones para generar diferentes tipos de reportes.
2. Selecciona una opción:
   - `1` para generar un reporte PDF
   - `2` para generar un reporte Excel
   - `3` para generar un reporte CSV
   - `4` para salir
3. El programa creará el reporte y mostrará un mensaje indicando que se ha descargado correctamente.

## 🎯 Explicación del Código
Este proyecto utiliza el **patrón Abstract Factory**, el cual permite crear objetos de distintas clases sin especificar sus tipos exactos.
- `reportFactory` actúa como una fábrica que decide qué tipo de reporte instanciar según la opción seleccionada.
- Cada tipo de reporte (`pdfReport`, `ExcelReport`, `csvReport`) implementa la interfaz común `report`.
- `Main.java` maneja la interacción con el usuario y la lógica principal del programa.

## Contribuciones
Si deseas contribuir a este proyecto, puedes hacer un fork del repositorio y enviar un pull request con mejoras o nuevas funcionalidades.

## Autor
**Maria Helena Salas**

## Licencia
Este proyecto está bajo la licencia MIT. ¡Siéntete libre de usarlo y mejorarlo! 🚀
