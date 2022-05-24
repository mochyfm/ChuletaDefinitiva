## Tipos de datos en PL/SQL

Como bien pudimos ver en el punto anterior, vamos a trabajar sobre SQL Developer para poder relacionarnos con Oracle y así utilizar PL/SQL.

Lo primero que vamos a ver, como hemos hecho con todos los lenguajes hasta ahora, es ver algunos de los tipos de datos que tiene PL/SQL, de entre los que encontraremos tanto Operadores, como los tipos de valores que tenemos para las variables y valores que introduciremos en nuestra base de datos.

#

#### Operadores
###### Operadores clásicos

Los operadores existentes en PL/SQL son los siguientes:

- Operadores comunes:
  - Suma " **+** "
  - Resta " **-** "
  - Multiplicación  " <strong>*</strong> "
    - Exponente " <strong>**</strong> "
  - División " **/** "
  - Concatenar cadenas " **| |** "

<br>

- Expresiones
  - Igual **=**
  - Mayor **<** *ó* Menor **>**
  - Distinto **<>** *ó* **!=**
También existen el mayor igual, y menor igual

<br>
  
- Operadores lógicos
  - *AND* (Y)
  - *OR* (O)
  - *IS NULL*
  - *LIKE*
  - *BETWEEN*
  - *IN*

Los comentarios se escriben entre estos dos símbolos <strong>/* */</strong>, estos comentarios recorrerán desde donde se abre el primer símbolo hasta el segundo.
También están los comentarios **en línea**, que se escriben poniendo dos guiones (**--**) delante.

#

###### Operadores condicionales

En PL/SQL también existen los condicionales, que dependiendo de un valor por el que se pregunta realizarán o no el contenido que tienen en su interior. Se definen de la siguiente manera:

    IF ( vcantidad IN (5, 6, 7) ) THEN
        DBMS_OUTPUT.PUT_LINE('El número es 5, 6 o 7');
    END IF;


o bien de la siguiente:

    IF ( vname LIKE 'A%' ) THEN
        DBMS_OUTPUT.PUT_LINE('El nombre empieza por A');
    ELSE
        DBMS_OUTPUT.PUT_LINE('No empieza por A');
    END IF;

Evidentemente, para usar estos operadores, necesitaremos de usar también los clásicos.

#

#### Tipos de Datos

En cuanto a los tipos de valores que podemos utilizar para almacenar y gestionar la información tenemos algunos como los siguientes (que suelen ser los más comunes):

|  Tipo de Dato | Precision máxima y mínima|  Descripción   |
| --------| -------------------------------- | ------------------------ |
| `BOOLEAN` | Dos valores True o False | Tipo de valor booleano.
| `INTEGER, INT` | Desde -2.147.483.648 a 2.147.483.647  | Numero entero
| `SMALL INT` | Desde -32.767 a 32.767 | Numeros enteros (Pero menos que INTEGER, INT) |
| `REAL` | La precisión máxima es de 63 dígitos | Solo **numeros reales** (positivos)
| `DECIMAL(N, D)`, `DEC(N, D)` | La precisión máxima es de 38 **dígitos**.  |Donde **N** es el número de digitos y **D** es el número de valores detrás de la coma (decimales).
| `NUMERIC(NT, D)`, `NUMBER(NT, D)` | La precisión máxima es de 38 **dígitos**. |Donde **NT** es el número de digitos antes de la coma y **D** los digitos después de la coma
| `FLOAT` | La precisión máxima es de 38 **decimales**. | El mismo tipo float que el resto de lenguajes de programación. | 
| `VARCHAR2(NUMERO)` | Hasta 32767 bytes en PLSQL. <br> Hasta 4000 en Oracle 8i/9.i | Donde **NUMERO** es el valor máximo de caracteres a almacenar. Son cadenas de ancho **variable**. |
| `CHAR(NUMERO)` | Hasta 32767 bytes en PLSQL. <br> Hasta 2000 en Oracle 8i/9.i | Donde **NUMERO** es el valor máximo de caracteres a almacenar. Son cadenas de ancho **fijo**. Se rellena con espacios en caso de no completarse. |
| `LONG` | Hasta 2 gigabytes | Son cadenas de ancho variable. |
| `RAW` | Hasta 32767 bytes en PLSQL. <br> Hasta 2000 bytes en Oracle 8i/9.i | Son cadenas binarias de ancho variable.
| `LONG RAW` | Hasta 2 gigabytes | Son cadenas binarias de ancho variable |
| `DATE` | Una fecha entre el 1 de enero de 4712 a. C. y el 31 de diciembre de 9999 d. C. |
| `TIMESTAMP(NUMERO)` | **fractional seconds precision** tiene que ser un número entre 0 y 9. (El valor por defecto es 6) | Incluye año, mes dia, hora, minutos y segundos. <br> **Por ejemplo:** `TIMESTAMPS(6)`. |
| `TIMESTAMP(NUMERO) WITH TIME ZONE`  | **fractional seconds precision** tiene que ser un número entre 0 y 9. (El valor por defecto es 6) | Incluye año, mes dia, hora, minutos y segundos. <br> **Por ejemplo:** `TIMESTAMP(5) WITH TIME ZONE`. |
| `TIMESTAMP(NUMERO) WITH LOCAL TIME ZONE` | **fractional seconds precision** tiene que ser un número entre 0 y 9. (El valor por defecto es 6) | Incluye año, mes dia, hora minutos y segundos; con una zona horaria expresada como la zona horaria actual. <br> **Por ejemplo:** `TIMESTAMP(4) WITH LOCAL TIME ZONE.` |
| `INTERVAL YEAR(NUMERO) TO MONTH` | **year precision** debe ser un número entre 0 y 9. (El valor por defecto es 2) | Periodo almacenado en años y meses. <br> **Por ejemplo:** `INTERVAL YEAR(4) TO MONTH`.

**Fuentes:** 
- <a href="https://www.ibm.com/docs/en/db2/10.5?topic=plsql-data-types">IMB Docs</a>
- <a href="https://es.wikipedia.org/wiki/PL/SQL">Wikipedia - PL/SQL</a>


<br>

Visto esto, podemos pasar a ver la estructura de los bucles en PL/SQL

<br>

#

[:arrow_backward: Anterior punto](1%20-%20Bases%20e%20Instalacion%20de%20PL%20SQL.md) <br>
[Siguiente punto :arrow_forward:](3%20-%20Bucles.md)<br>


**[Indice Bases de Datos :house:](../0%20-%20Indice.md)**