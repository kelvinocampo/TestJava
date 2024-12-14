# Test Java

Este proyecto es una prueba rápida para explorar y practicar varios aspectos fundamentales de Java, tales como bucles, funciones, colecciones y la interacción con el usuario mediante cuadros de diálogo gráficos.

## Características del código

El código incluye los siguientes conceptos clave de Java:

- **For-each**: Uso del bucle `for-each` para iterar sobre una lista de elementos.
- **While**: Uso del bucle `while` para realizar operaciones repetitivas.
- **ArrayList**: Uso de la clase `ArrayList` para manejar listas dinámicas.
- **Funciones**: Definición y uso de métodos para organizar y modularizar el código.
- **Argumentos y Parámetros**: Paso de datos a funciones mediante parámetros.
- **Impresión**: Impresión de resultados en la consola y mediante cuadros de mensaje gráficos.
- **Entrada de datos con `JOptionPane`**: Solicitar información al usuario usando cuadros de diálogo gráficos.

## Descripción del Código

Este código realiza los siguientes pasos:

1. Muestra un mensaje de bienvenida utilizando `System.out.println()` en la consola y un cuadro de diálogo `JOptionPane`.
2. Solicita el nombre del usuario y lo almacena en una variable.
3. Permite al usuario seleccionar su género de una lista predefinida usando `JOptionPane.showOptionDialog()`.
4. Solicita al usuario la cantidad de notas que desea ingresar.
5. Utiliza un bucle `while` para solicitar las notas y almacenarlas en un `ArrayList<Double>`.
6. Calcula la nota final promediando las notas ingresadas usando una función (`calcFinalNote`).
7. Muestra la información del estudiante (nombre, género y nota final) en un cuadro de diálogo gráfico.
8. Finaliza el proceso mostrando un mensaje en la consola.