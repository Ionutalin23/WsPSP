HILOS
-----
Tenemos dos maneras de programar hilos en java
1) crear una clase y extender de la clase Thread
)crear una clase que implemente la interfaz Runnable

En ambas maneras hay que sobreescribir el m�todo run() en la clase y lo que
vaya dentro de estre m�todo ser� el ciclo de vida del hilo, lo podemos 
entender como si fuese el m�todo main3

------Actividad hilos-----------
Pedimos 3 numeros al usuario 
Hacer un programa que arranque 3 hilos y compruebe si es primo o no.

Bonus-> Mostrar el tiempo de ejecuci�n de cada hilo.
// La clase date nos guarda el tiempo en milisigundos desde el a�o 1970
Date dato = new Date()
date.getTime()// nos devuelve el numero de milisegundos