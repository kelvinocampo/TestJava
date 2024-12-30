# Taller de Sorteo de Premios

Este proyecto es una aplicación para gestionar el sorteo de premios entre personas registradas. La aplicación está construida utilizando Java Swing para la interfaz gráfica de usuario y `ArrayList` para el almacenamiento de datos en memoria.

## Características

- Registro de personas participantes.
- Validación de edad para asegurar que los participantes sean mayores de 18 años y menores de 75 años.
- Prevención de registros duplicados.
- Registro de boletos de participación con selección de números únicos del 1 al 20.
- Generación aleatoria de un ganador entre los boletos registrados.
- Información persistente durante la ejecución de la aplicación.

## Descripción

Se desea construir una aplicación para el sorteo de premios entre personas registradas.
Cualquier persona que desee concursar debe encontrarse previamente registrada en el sistema,
indicando su información más importante, tenga en cuenta que solo se pueden registrar personas
que sean mayores de edad, pero menores a los 75 años, tampoco debe registrar más de una vez a
la misma persona.

Al registrar a un participante, se debe seleccionar un número del 1 al 20, cada boleto de
participación debe tener la persona que va a participar, la fecha de participación y un id para el
boleto. Debe tener en cuenta que se pueden registrar máximo 20 boletos, no se pueden repetir los
números participantes (1 a 20) y el id del boleto tampoco debe repetirse.

Construya una aplicación que permita el registro de las personas, posteriormente el registro de los
boletos para participar y que de manera aleatoria genere un ganador entre los boletos
participantes.

La aplicación debe distribuirse de la siguiente manera.
- Ventana Uno, gestión de las personas que se van a registrar en el sistema
- Ventana Dos, Registro de los boletos y generación del ganador.

La aplicación no debe perder su información mientras se encuentre en ejecución.

Nota: Haga uso del ArrayList para guardar los objetos y Java Swing para la construcción de
ventanas de usuario.