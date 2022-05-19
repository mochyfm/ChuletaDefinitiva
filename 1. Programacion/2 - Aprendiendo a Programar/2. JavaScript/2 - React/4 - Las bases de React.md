## Las bases de React

React es una libreria bastante completa, desde donde podremos realizar una infinidad de tareas de una forma super sencilla y fácil de entender.

Evidentemente, lo ideal es tener la base de JavaScript que se propone previamente, te dejo el enlace a los apuntes: **<a href="../JavaScript/0 - Indice.md">Aquí</a>**.

Lo primero que debemos saber de React (al menos de momento) es que vamos a trabajar con lo que denominaremos componentes, que serán elementos reutilizables que realizarán ciertas acciones. Dichos componentes, tendrán una estructura similar; el archivo de estos componentes deberá tener la extensión ***jsx***, ya que esta es la extensión de React.

Vamos a empezar por la estructura base de React, para posteriormente definir que es un componente.


### El archivo *index.js* 
###### Ruta: /src/index.js

Como bien vimos en el apartado de lenguaje de marcas; las páginas web necesitan de un archivo HTML para poderse ver, que por costumbre y tradición se le llama *index* (índice en ingles). Este archivo nos mostraba la página web en cuestión, y hacía que todo lo que modificasemos se viese reflejado.

Es por ello, que en React no utilizamos el archivo index.html (al menos no directamente), porque React se encarga de hacer todo el trabajo por nosotros utilizando otro archivo, en este caso llamado *index.js* como ya ves, los nombres son super originales.

<p align="center">
    <img src="../Imgs/React/Bases/BasesReact1.png">
</p>

Lo que hace este *index.js* es llamar a un componente raíz llamado App, este hará internamente sus cosas pero de momento no nos interesa; con lo que deberemos quedarnos es con las dos lineas de código que se encargan de enviar la información al documento HTML que mostrará todo lo que hagamos.

<p align="center">
    <img src="../Imgs/React/Bases/BasesReact2.png">
</p>

Veamos que es lo que hacen:

1. Primero se declara una variable constante llamada *"root"* que se encargará de crear un contenedor (donde se almacenan los componentes), en aquel elemento que encuentre con el id *root*. (Primera Línea) 
   
2. Tras hacer esto, lo que hará es renderizar el componente raíz app en el elemento en cuestión. (Segunda Línea)

Vamos a ver ahora al archivo **index.html**, este archivo

#

### El archivo *index.html* 
###### Ruta: /public/index.html

En el archivo index.html no hay mucho de qué hablar. ¿Te acuerdas cuando nosotros teniamos que crear archivos HTML inmensos, en los que poniamos una cantidad insana de texto?, pues debo decirte que *emosido engañado*, porque React es tan inteligente que trabaja con una única etiqueta, y es un div con el id que vimos antes: root. 

Esta es la estructura HTML de nuestro index sin los comentarios que trae React por defecto:

<p align="center">
    <img src="../Imgs/React/Bases/BasesReact3.png">
</p>

Y literalmente, casi ni vamos a tocar esto (al menos de momento), porque veremos que mágicamente crearemos HTML sin utilizar el HTML, como buenos magos.

Ahora fuera bromas, si nos fijamos en la etiqueta en la que nos dice que deberemos habilitar JavaScript para usar JavaScript (gracias React), podremos ver que está la etiqueta div con el id root, y si, esta es la etiqueta con el id a la que hace referencia el archivo *index.js*, donde se almacenarán todos los componentes e información relacionada a ellos.

Y con esto ya habríamos terminado con lo básico, ahora vamos a ver los componentes. 

Por si requieres de la estructura del archivo index.js te la dejo en el siguiente enlace: <a href="./ReactCode/index.js">link</a>.

También tienes acceso a la carpeta públic; te dejaré el acceso directo a la estructura general para que puedas ir viendo.

<br>

[:arrow_backward: Anterior punto](3%20-%20Mi%20primer%20proyecto.md)<br>
[Siguiente punto :arrow_forward:](5%20-%20Componentes.md)
#

**[Indice ReactJS :house:](./0%20-%20Indice.md)**