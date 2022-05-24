## Instrucciones DDL y DML en PL/SQL

Como bien vimos en el temario de MySQL, existen varios tipos de instrucciones relacionadas con la gestión y creación de bases de datos o en su defecto, tablas. Estas instrucciones son: 

- **DDL:** que servía para la creación o manipulación de estas estructuras de datos.
- **DML:** que servía para interactuar con las estrcuturas de datos que creabamos con DDL. 

También teniamos tanto DCL como TCL, siendo el primero para la gestión de usuarios y permisos; y el segundo para las transacciones.

Para ver esto con más detenimiento, te recomiendo que vayas a su apartado correspondiente en el siguiente enlace: *proximamente...*

#

Estas instrucciones funcionan también en PL/SQL y es bastante similar al que tenemos con MySQL. Evidentemente, en el caso de PL/SQL esto funciona y es compatible con variables, por lo que podremos utilizarlo de manera que los datos se almacenen en las variables que nosotros digamos. 

#
#### Consultas.

Para realizar consultas las usaremos como haciamos antes; para ello las sentencias deberán ser algo como lo siguiente:

    SET SERVEROUTPUT ON

    DECLARE
        v_Salario NUMBER;
        v_FirstName VARCHAR(50); 
    BEGIN
        SELECT FIRST_NAME, SALARY INTO v_FirstName, v_Salario
        FROM EMPLOYEES
        WHERE EMPLOYEE_ID = 100;
        
        DBMS_OUTPUT.PUT_LINE('Nombre ' || v_FirstName || ' Salario ' || v_Salario);
    END;

> **Nota:** Las sentencias en PL/SQL solo pueden devolver un registro al que le estemos preguntando, pero de ese mismo registro puede devolver tantos campos como nosotros preguntemos y hayan en la tabla evidentemente.


La sentencia es similar a la que ya conociamos de antes, la diferencia es la clausula " **INTO** ", que nos dice en qué variables se guardarán los datos que nosotros hayamos pedido. Los valores se almacenaran en cada variable según como se hayan pedido en el SELECT, es decir, FIRST_NAME se almacenará en la primera variable: v_FirstName; y SALARY se almacenará en v_Salario.

Pero claro, tenemos un problema. Imaginemos que queremos coger el valor que reside en el campo *CODIGO_IDENTIFICATIVO*, el cual ha creado la empresa pero no sabemos cómo, si con letras y números, solo números... Para evitar comernos la cabeza con el tema del tipo de valor de cualquier campo, utilizaremos la instrucción <span style="color:#0777db; font-weight: bold;">%TYPE</span>, de una manera como la siguiente:

    DECLARE
        v_CodigoIdentificativo EMPLOYEES.CODIGO_IDENTIFICATIVO%TYPE
    BEGIN
        [...]
    END;

Si esto lo hicieramos con el ejemplo anterior, el resultado sería como el siguiente:

    SET SERVEROUTPUT ON
    
    DECLARE
        v_Salario EMPLOYEES.SALARY%TYPE;
        v_FirstName EMPLOYEES.FIRST_NAME%TYPE;
    BEGIN
        SELECT FIRST_NAME, SALARY INTO v_FirstName, v_Salario
        FROM EMPLOYEES
        WHERE EMPLOYEE_ID = 100;
        
        DBMS_OUTPUT.PUT_LINE('Nombre ' || v_FirstName || ' Salario ' || v_Salario);
    END;
    

Al final, lo que hará es asignar el tipo de dato que haya en el campo, por lo que si lo sabemos podemos ponerlo directamente. Esto nos sirve también para poder asignar el tipo de dato que haya en el campo por si algún dia cambia.

#### Alteración de los datos.
##### Inserción de datos.

Para la inserción de datos es casi que lo mismo. Imaginemos que tenemos una tabla con dos campos, el *campo1* que tiene valores numéricos y el *campo2* que tiene texto; para insertar los datos haríamos lo siguiente:

    DECLARE
        v_Col1 TEST.Campo1%TYPE;
    BEGIN
        v_Col1 := 10;
        INSERT INTO TEST( Campo1, Campo2 ) VALUES ( v_Col1, 'AAAAA');
        COMMIT;
    END;

Si nos fijamos, cuando hablamos de actualizar los datos, deberemos utilizar la instrucción **COMMIT;** que si recuerdas es la misma que vimos con las Transacciones en MySQL.

##### Actualización de datos.

Como ocurría en el anterior apartado; en caso de querer actualizar datos lo haremos como siempre, sin olvidarnos de la clausula **COMMIT;**

    DECLARE
        v_Col1 TEST.Campo1%TYPE;
    BEGIN
        v_Col1 := 10;
        UPDATE TEST SET Campo2 = 'CCCCC' WHERE Campo1 = v_Col1;
        COMMIT;
    END;


##### Eliminación de datos

Seguimos con actualizaciones sobre los datos; en caso de borrar, el procedimiento es igual que en los dos casos anteriores.

    DECLARE
        v_Col1 TEST.C1%TYPE;
    BEGIN
        v_Col1 := 10;
        DELETE FROM TEST WHERE C1 = v_Col1;
        COMMIT;
    END;

#

#### La tabla Dual.

Como ocurría en MySQL, Oracle tiene su tabla Dual, que es la que se almacena en memoria y que no existe físicamente. Se pueden hacer instrucciones con esta tabla, para poder saber si nos devuelve lo que realmente queremos buscar.

    SELECT 'Hola' FROM DUAL;
    SELECT SYSDATE FROM DUAL;
    SELECT CURRENT_DATE FROM DUAL;
    SELECT USER FROM DUAL;
    SELECT EXTRACT( MONTH FROM SYSDATE) "Mes" FROM DUAL;

#

[:arrow_backward: Anterior punto](3%20-%20Bucles.md) <br>
[Siguiente punto :arrow_forward:](5%20-%20Funciones%20y%20Procedimientos.md)


**[Indice Bases de Datos :house:](../0%20-%20Indice.md)**
