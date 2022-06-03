## Tipos de datos

Java es un lenguaje **[fuertemente tipado](https://es.wikipedia.org/wiki/Tipado_fuerte)**, y como cualquier otro lenguaje tiene sus propios tipos de datos, bien pueden ser más o menos que otros lenguajes (como python) pero será necesario conocerlos para poder trabajar con el.

Los tipos de datos en caso que no lo sepas son la forma que tiene el lenguaje (en este caso Java) de representar y almacenar la información en la que nosotros queremos trabajar, es decir: si por ejemplo yo quiero realizar una suma, utilizaremos valores de tipo numérico o decimal (*coma flotante*) para poder operar con ellos, pero si quiero poner un mensaje utilizaremos cadenas de texto (*String*), recuerda lo que vimos en pseudocódigo.

Dicho esto, te adjunto una tabla con todos los tipos de datos y una pequeña descripción:

|Tipo de dato|Tamaño|Descripción|
|------------|------|-----------|
| `byte`       |1 byte| Almacena números enteros desde -128 hasta 127 |
| `short`      |2 bytes| Almacena números enteros desde -32.768  hasta 32.767 |
| `int` | 4 bytes | Almacena números enteros desde -2.147.483.648 hasta 2.147.483.647
| `long` | 8 bytes | Almacena números enteros desde -9.223.372.036.854.775.808 hasta 9.223.372.036.854.775.807 |
| `float` | 4 bytes | Almacena valores decimales hasta 7 dígitos |
| `double` | 8 bytes | Almacena valores decimales hasta 15 dígitos |
| `boolean` | 1 bit | Almacena dos estados `true` o `false` |
| `char` | 2 bytes | Almacena un único caracter, letra o valor ASCII. |
| `String` | 2 bytes | Almacena una cadena de texto. Un único `String` puede tener hasta un total de 2.147.483.647 de caracteres, letras o valores ASCII dentro, significando esto que su peso máximo es de **2 GB** |

Todos estos tipos de datos los iremos utilizando con el paso del tiempo, pero si quieres ver algunos ejemplos en los que los usamos, podrás verlo a continuación:

Ejemplos:
    [1. byte, short, int y long](#1-byte-int-y-short)
    [2. float y double](#2-float-y-double)
    3. boolean
    4. char
    5. String

###### 1. byte, int y short.

Los valores enteros pueden ser sumados entre sí, sin ningún problema, de hecho no tienen por qué ser todos del mismo tipo de dato, es decir, yo puedo sumar un byte con un short, y el resultado de estos dos con un int o un long. Lo que variará es el tamaño que estos soportan.

<p align="center">
    <img src="img/Tipos%20de%20datos/DataTypes1.png">
</p>

Si nos fijamos el resultado es el siguiente:

<p align="center">
    <img src="img/Tipos%20de%20datos/DataTypes2.png">
</p>

Recordemos ahora la tabla de antes; si nos fijamos byte aguanta hasta 127. 

<p align="center">
    <img src="img/Tipos%20de%20datos/DataTypes3.png">
</p>

¿Qué pasaría si nosotros le pasaramos el número 128?:

<p align="center">
    <img src="img/Tipos%20de%20datos/DataTypes4.png">
</p>

Pues que Java nos avisará de que el tipo de datos que intentamos pasar, supera el máximo del que tenemos actualmente.

**NOTA:** Realmente en Java, los dos únicos tipos de datos enteros que se usan son int y rara vez long, pero byte y short son meramente utilizados.

###### 2. float y double.

A diferencia de lo que ocurría en el caso anterior, float y double no pueden interactuar entre sí, ya que son valores completamente diferentes.

<p align="center">
    <img src="img/Tipos%20de%20datos/DataTypes5.png">
</p>

Esto se debe a que uno almacena muchisimos más decimales de los que almacena el otro (float almacena menos que double).

