# Test POO Java

Este proyecto es una prueba rápida para explorar y practicar varios aspectos fundamentales de Java, tales como bucles, funciones, colecciones y la interacción con el usuario mediante cuadros de diálogo gráficos.

## Características del código

El código incluye los siguientes conceptos clave de Java:

- **Clases y Objetos**: Definición de una clase `User` y creación de objetos a partir de esta clase.
- **Métodos**: Definición y uso de métodos públicos, privados y estáticos.
- **Operadores Ternarios**: Uso de operadores ternarios para decisiones rápidas.
- **Impresión**: Impresión de resultados en la consola.

## Descripción del Código

Este código realiza los siguientes pasos:

1. Define una clase `User` en el paquete `user`, con atributos para nombre, email y edad.
2. Implementa un constructor para inicializar estos atributos.
3. Define varios métodos en la clase `User`, incluyendo métodos para verificar si el usuario es adulto (`isAdult`), obtener los datos del usuario (`data`), un saludo estático (`saludo`) y un método privado para validar contraseñas (`isPasswordValid`).
4. Implementa un método público (`useMethodPrivate`) que utiliza el método privado para validar una contraseña.
5. En la clase `App`, se crea una instancia de `User` y se muestran sus datos en la consola.
6. Llama a un método estático y a un método público que utiliza un método privado dentro de la clase `User`.