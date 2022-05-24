## Tipos de Bucles

En PL/SQL al igual que en ciertos lenguajes, existen los Bucles; estos 3, son como en la mayoría de sus familiares:

- [Tipos de Bucles](#tipos-de-bucles)
    - [Bucle For](#bucle-for)
    - [Bucle While](#bucle-while)
    - [Bucle Loop](#bucle-loop)

#

#### Bucle For

El bucle for funciona muy parecido al que ya conociamos. No necesitamos declarar la variable que utiliza, y esta de manera continua será alterada según se cumpla la condición del bucle. La forma de declararla es la siguiente:

    SET SERVEROUTPUT ON

    DECLARE
    BEGIN
        FOR Contador IN 5..15 LOOP 
            DBMS_OUTPUT.PUT_LINE(Contador);
        END LOOP;
    END;
    /

La variable **Contador** se irá sumando hasta llegar a 15, empezando por 5. Otro ejemplo podría ser como el siguiente:

    SET SERVEROUTPUT ON

    BEGIN
        FOR Contador IN REVERSE 0..15 LOOP 
            DBMS_OUTPUT.PUT_LINE(Contador);
        END LOOP;
    END;
    /

En este ejemplo, el valor irá desde el último valor, es decir, 15 hasta el primero, 0.

#

#### Bucle While

El bucle **while** como ocurría con el **for**, tiene un funcionamiento parecido al bucle for, con la diferencia de que no se añaden las variables directamente, es decir, tendremos que declararlas.

En el siguiente ejemplo tendrás dos bucles while, uno que va hacia delante y otro que actua con un valor booleano.


        SET SERVEROUTPUT ON

        DECLARE
            vContador INTEGER := 0;
            vDone BOOLEAN := True;
        BEGIN

            -- Bucle For positivo (hacia delante)

            WHILE vContador <= 100 LOOP
                DBMS_OUTPUT.PUT_LINE(vContador);
                vContador := vContador + 1;
            END LOOP;

            -- Bucle For booleano
            
            WHILE vDone LOOP
                DBMS_OUTPUT.PUT_LINE('Paso por aqui');
                vDone := False;
            END LOOP;
        END;
        /

#### Bucle Loop

El bucle **loop** es una especie de variante al **Do *[ **...** ]* while** que conocemos desde Java; este bucle entra directamente en el proceso antes de si quiera preguntar la condición. El funcionamiento es igual que el While, con esta diferencia; es por esto que la variable que use tendrá que ser declarada previamente y ya dentro del bucle será modificada (o no). 

Hay dos formas de hacer este bucle, la buena y la mala, ambas funcionan pero la mejor es la segunda.

    SET SERVEROUTPUT ON

    -- Esta no es la mejor forma de hacerlo (pero funciona igual)

    DECLARE
        vContador INTEGER := 0;
    BEGIN
        LOOP
            vContador := vContador + 1;
            DBMS_OUTPUT.PUT_LINE(vContador);
            IF (vContador = 100) THEN
                EXIT;
            END IF;
        END LOOP;
    END;
    / 

<br>

    SET SERVEROUTPUT ON

    -- Esta es la mejor forma de hacerlo

    DECLARE
        vContador INTEGER := 0;
    BEGIN
        LOOP
            vContador := vContador + 1;
            DBMS_OUTPUT.PUT_LINE(vContador);
            EXIT WHEN vContador = 100;
        END LOOP;
    END;
    /

Ambos hacen lo mismo, pero el segundo es el mejor de realizar, ya que ocupa menos y es más claro.

<br>

#

[:arrow_backward: Anterior punto](2-%20Tipos%20de%20datos%20y%20Operadores.md) <br>
[Siguiente punto :arrow_forward:](4%20-%20Instrucciones%20DDL%20y%20DML%20en%20PL%20SQL.md)


**[Indice Bases de Datos :house:](../0%20-%20Indice.md)**