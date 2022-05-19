## Primer proyecto de React

Una vez tengamos la checklist anterior completa, podremos introducirnos en el mundo de ReactJS. Haremos un proceso de instalación desde cero, empezando por lo más básico y seguiremos avanzando hasta dejarlo todo listo para la teoría de ReactJS.

#### Primeros pasos

Lo primero que deberemos hacer es crear una carpeta donde alojaremos nuestros proyectos de ReactJS. Una vez hecha la abriremos desde el editor:

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto1.png">
</p>

Cuando la tengamos abierta abriremos un nuevo terminal, para abrirlo seleccionaremos la pestaña de abrir nuevo terminal situada en la barra superior.

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto2.png">
</p>
<br>

Una vez abierto, escribiremos lo siguiente:

        npx create-react-app (nombre del proyecto)

Algo parecido a esto:

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto3.png">
</p>

Como podemos ver nos pregunta si queremos seguir, le diremos que si y se pondrá a crear nuestro nuevo proyecto.

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto4.png">
</p>

Una vez ha terminado, podemos fijarnos en la parte izquierda del Visual Studio Code, que se nos ha creado una carpeta completamente nueva con el nombre de nuestro proyecto, en la que hay muchisimas cosas (iremos destripandolas poco a poco no os preocupeis)


<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto_estructura.png">
</p>

1. Lo primero de lo que probablemente nos daremos cuenta es de que el proyecto incluye Git, podemos bien ignorarlo o borrarlo eso ya es decisión de cada uno (para borrarlo hay que eliminar la carpeta oculta .git)
2. Posteriormente, existen 3 carpetas:
   - *node_modules:* esta carpeta no la tocaremos, pesa cerca de 200 MB (mucho) y es donde se encuentra la libreria, por lo que si la tocamos o borramos podría funcionar mal.
  
<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto5.png">
</p>

   - *public:* esta carpeta contiene el archivo ***index.html***, lo ideal es dejar esta carpeta como está.

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto6.png">
</p>

   - *src:* esta será la carpeta que manipularemos en mayor medida; si lo deseas puedes borrar todo el contenido.

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto7-1.png">
</p>

> En src, la estructura final ideal para nuestro proyecto sería manteniendo estos archivos; los demás los puedes borrar.
> 
> <p align="center">
>   <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto7-2.png">
></p>

<br>

Con esto ya tendríamos React listo, pero vamos a realizar una serie de configuraciones para hacerlo más... bonito.

#
#### Configuracion de nuestro proyecto

<br>

**MUY IMPORTANTE:** Antes de hacer nada, comprueba que en la terminal, te encuentras dentro del proyecto de React, es decir que en la ruta, el último nombre que aparece sea el mismo que tu le has puesto a tu proyecto; de no ser así, todas las cosas que instales se te instalarán fuera del proyecto. Para comprobar esto, te recomiendo que uses el comando **ls** (si tienes un Mac o un Linux) o **Dir** si tienes un Windows.

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyectoAVISO.png">
</p>

Deberian de salirte las carpetas que vimos antes, de no ser así deberás escribir:

    cd nombre_proyecto

Es igual para todos los sistemas operativos.

#

##### Eslint

Repito que esto tendremos que hacerlo con cada proyecto (o también puedes copiar este proyecto y cambiar las cosas que quieras cambiar, la decisión es tuya).

Lo primero que deberemos hacer es instalar eslint en nuestro proyecto, y tu te preguntarás: *¿Pero si ya he instalado el plugin, no es suficiente?*; pues no, no lo es, tenemos que instalar esto también (también ocurrirá con el prettier más adelante). Para instalarlo introduciremos el siguiente comando:

    npm i -D eslint

Tras esto, deberemos configurarlo y para ello escribiremos el siguiente comando:

    npm init @eslint/config

Deberemos responder un mini formulario en el que se nos pregunta que queremos poner en cada apartado, sigue el gif para poder ver lo que tienes que poner:

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyectoEslint.gif">
</p>

> **NOTA:** Es posible que te aparezca algún mensaje de hacer una "*downgrade*" con la versión de eslint que tenemos o algo similar, en cuyo caso dale a la opción **Si**.

Tras esto, deberemos irnos al fichero que se nos habrá creado dentro de nuestro proyecto; si se te ha creado fuera tienes que revisar el mensaje de aviso que hay al inicio del apartado ([aquí](#configuracion-de-nuestro-proyecto)).

El fichero se llama *.eslint.js*, en el tendremos unas cuantas lineas de código, deberemos escribir lo siguiente dentro.

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto8.png">
</p>

Si lo hemos hecho bien, no nos deberian salir errores en nuestro archivo de configuración. Ahora pasemos al siguiente apartado: ***Prettier***

#

##### Prettier

Lo primero que deberemos de hacer es instalar el paquete *prettier*, para ello ejecutaremos la siguiente instrucción:

    npm i -D prettier

A diferencia de con Eslint, no tenemos que realizar ningún cuestionario, deberemos crear el archivo por nosotros mismos. El archivo se llamará **.prettierrc**, y lo crearemos como es evidente dentro de nuestro proyecto.

Dentro del archivo escribiremos la configuración que nosotros queramos aplicar a nuestros proyectos, por lo que realmente este apartado es personalizable. 

> Te dejaré una configuración que es bastante buena; en caso de que quieres aplicar tu propia configuración de prettier te adjunto el enlace oficial para que puedas ver con tranquilidad todas las opciones. ***Sitio:*** :arrow_right: <a href="https://prettier.io/">https://prettier.io/</a>

Esta es mi configuración recomendada:

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto9.png">
</p>

Ahora, una vez hayamos terminado, deberemos irnos a el archivo de configuración de eslint y añadir lo siguiente:

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto12.png">
</p>

#

Si ahora nos vamos a el *index.js* en ***src/*** veremos que nos salen varios errores.

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto10.png">
</p>

Evidentemente, estos errores se deben a que hemos modificado el estilo general del proyecto con tanto Eslint como con prettier. 

Aprovechando estos errores vamos a dejar listo nuestro index.js para poder empezar a ver un poco de React.

##### Index.js

Como bien comentaba, hay errores en nuestro Index.js, que realmente son únicamente visuales, en cuanto a código podrían funcionar, pero quizá podria verse mejor. Deberemos dejar nuestro archivo index.js como se ve a continuación:

<p align="center">
    <img src="../Imgs/React/Primer%20Proyecto/PrimerProyecto11.png">
</p>

Como se puede ver, es mucho más cómodo ahora visualmente.

#

Con esto ya tendremos configurado nuestro proyecto; recuerda que esto es lo que deberias de hacer en todos los proyectos que hagas de React (a diferencia del anterior capitulo que era una única vez por equipo).

<br>

[:arrow_backward: Anterior punto](2%20-%20Preinstalación.md)<br>
[Siguiente punto :arrow_forward:](4%20-%20Las%20bases%20de%20React.md)
#

**[Indice ReactJS :house:](./0%20-%20Indice.md)**