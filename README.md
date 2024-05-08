# ED_CasoFinalDeLosFinales

Link ------> https://github.com/jsepucas/ED_CasoFinalDeLosFinales.git


# Ejercicios de Programación Orientada a Objetos y Estructuras de Datos

Este documento contiene una serie de ejercicios y preguntas relacionadas con la programación orientada a objetos y las estructuras de datos.

## Índice

- [Ejercicio 1: Preguntas de selección](#ejercicio-1)
- [Ejercicio 2](#ejercicio-2)
- [Ejercicio 3](#ejercicio-3)
- [Ejercicio 4](#ejercicio-4)
- [Ejercicio 5](#ejercicio-5)

## Ejercicio 1

### Preguntas de selección

1. **En relación al estado de un objeto, para preservar el principio de encapsulación:**
    - a) Los atributos de nuestra clase deben permanecer públicos, para permitir un acceso total a la información que almacenamos en los objetos. Sin embargo, aquellos métodos que realicen operaciones internas (y no deban ser utilizados), deben establecerse como privados.
    - b) Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.
    - **Respuesta: a**

2. **Los métodos de una clase no pueden devolver objetos:**
    - a) Verdadero
    - b) Falso
    - **Respuesta: b**

3. **¿Cuál de las siguientes características de la programación orientada a objetos está relacionada con la reutilización de código?**
    - a) Abstracción
    - b) Herencia
    - **Respuesta: b**

4. **El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:**
    - a) O(n)
    - b) O(1)
    - **Respuesta: b**

5. **Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir seleccionando el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada:**
    - a) Verdadero
    - b) Falso
    - **Respuesta: b**

## Ejercicio 2

Creo que la mejor opción sería la tercera alternativa (c) , especialmente para dispositivos que tienen muy poca memoria, como los que estamos considerando. Esta opción balancea bien el uso del tiempo y del espacio, algo crucial para gestionar los recursos de manera eficaz en aplicaciones de telemedicina, donde contar con un buen rendimiento y ser eficiente es vital.

## Ejercicio 3

Este ejercicio ha sido realizado y el código correspondiente junto a su explicación se encuentra en el repositorio.




## Ejercicio 4 

Este ejercicio ha sido realizado y el código correspondiente junto a su explicacion se encuentra en el repositorio.


## Ejercicio 5

Explicacion de distintos ejercicios realizados en el Ejercicio 5 (Modificar ) 

Justificación de la Elección de las Estructuras de Datos

List<Tweet> para tweets y timeline: Se utilizó una lista porque mantiene el orden de los tweets tal como fueron publicados. Esto es importante para mostrar los tweets en un timeline cronológico.
Set<UserAccount> para seguidores y siguiendo: Se eligió un conjunto para evitar duplicidades, dado que un usuario no debería poder seguir a otro más de una vez ni tener el mismo seguidor múltiples veces.

Validaciones en el constructor: Aseguran que el email tenga un formato correcto y que el alias sólo contenga caracteres válidos al momento de crear una UserAccount. Esto previene errores en el manejo de datos y facilita la gestión de usuarios en el sistema.
Herencia en clases Tweet: Utilizando herencia entre Tweet, DirectMessage, y Retweet, se aprovecha la reutilización de código y se maneja de manera eficiente las diferencias y similitudes entre los tipos de tweets.
Este diseño proporciona un sistema robusto y extensible que refleja las funcionalidades básicas y estructuras de datos necesarias para simular un comportamiento similar al de Twitter.

----------------------------------------------------------------------------------------------------------------------------------

Este proyecto contiene 6 carpetas nombradas alfabeticamente y una clase llamada 'MainGUI' en la cual se ejecuta el ejercicio 5. También contiene los ejercicios 3 y 4 los cuales estan hechos y detallados a base de comentarios donde se realiza la explicación adecuada de cada uno. 

