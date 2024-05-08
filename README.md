# ED_CasoFinalDeLosFinales

# Ejercicios 1: 

1)	En relación al estado de un objeto, para preservar el principio de encapsulación:

a)	Los atributos de nuestra clase deben permanecer públicos, para permitir un acceso total a la información que almacenamos en los objetos. Sin embargo, aquellos métodos que realicen operaciones internas (y no deban ser utilizados), deben establecerse como privados.

b)	Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.

Respuesta: a 

2)	Los métodos de una clase no pueden devolver objetos:

a)	Verdadero
b)	Falso

Respuesta: b 

 3)	¿Cuál de las siguientes características de la programación orientada a objetos está relacionada con la reutilización de código?
a)	Abstracción
b)	Herencia

Respuesta : b 

4)	El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:
a)	O(n)
b)	O(1)

Respuesta: b

5)	Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir seleccionando el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada:
a)	Verdadero
b)	Falso

Respuesta: b

# Ejercicio 2 

# Ejercicio 3 (Realizado en el repositorio) 








# Explicacion de distintos ejercicios realizados en el Ejercicio 5 (Modificar ) 

Justificación de la Elección de las Estructuras de Datos
Aquí están las justificaciones que puedes incluir en el README:

List<Tweet> para tweets y timeline: Se utilizó una lista porque mantiene el orden de los tweets tal como fueron publicados. Esto es importante para mostrar los tweets en un timeline cronológico.
Set<UserAccount> para seguidores y siguiendo: Se eligió un conjunto para evitar duplicidades, dado que un usuario no debería poder seguir a otro más de una vez ni tener el mismo seguidor múltiples veces.
Validaciones en el constructor: Aseguran que el email tenga un formato correcto y que el alias sólo contenga caracteres válidos al momento de crear una UserAccount. Esto previene errores en el manejo de datos y facilita la gestión de usuarios en el sistema.
Herencia en clases Tweet: Utilizando herencia entre Tweet, DirectMessage, y Retweet, se aprovecha la reutilización de código y se maneja de manera eficiente las diferencias y similitudes entre los tipos de tweets.
Este diseño proporciona un sistema robusto y extensible que refleja las funcionalidades básicas y estructuras de datos necesarias para simular un comportamiento similar al de Twitter.


