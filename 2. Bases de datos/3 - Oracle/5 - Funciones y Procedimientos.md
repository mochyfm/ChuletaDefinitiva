## Funciones y Procedimientos en PL/SQL

Hasta ahora, lo que hemos visto ha sido una ejecución dentro de los bloques anónimos que comentamos en el apartado *[1 - Bases de Instalacion](1%20-%20Bases%20e%20Instalacion%20de%20PL%20SQL.md)*. Lo que haremos ahora es distanciarnos un momento de ellos y cambiar nuestra perspectiva.

En otros lenguajes de programacion hemos visto funciones y métodos, que a la práctica son casi que lo mismo solo que con otro nombre, lo que ocurre es que existe otro elemento de ejecución llamado **[Procedimiento](#procedimientos)** el cual se ejecuta de una manera similar a una función pero no de la misma manera. Empezaremos viendo este para concluir ya luego con el que ya conocemos.

##### Procedimientos

Los procedimientos son subprogramas que se componen de varios estamentos de PL/SQL que pueden ser llamados cuando se hace referencia a este. Para declarar estos procedimientos en Oracle deberemos escribir lo siguiente:

    CREATE PROCEDURE