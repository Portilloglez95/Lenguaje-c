/*
Fecha: 08/05/2017
Nombre: Paulo Cesar Andrade Gonzalez
Nota: Implementacion de dipoles con estructuras dinamicas
    con restricciones IRD (Input - restricted dequeue)
    (colas con doble terminación - double-endend)
*/

#include <cstdio>
#include <cstdlib>
#include <ctime>
#include "Ird.hpp"

int main()
{
    // Semilla para numeros aleatorios
    srand((unsigned) time(NULL));

    // Creamos una pila
    Ird cola(10);

    // Generamos numeros aleatorios con rango 1 - 20
    int n = rand() % 20 + 1;
    printf("%i datos: \n\n", n);

    // Insertamos los datos al dipole por el frente
    for(int i = 0; i < n; i++){
        int data = rand() % 100 + 1;
        printf("Push %i", data);
        cola.enqueueRear(data);
        printf("\n");
    }

    printf("\n Vaciando la cola \n\n");

    // Mostramos y vaciamos la pila
    while(!cola.empty()){
        // Mostramos el tamaño de la cola y el valor obtenido
        printf("[%i]: Pop %i\n", cola.size(), cola.dequeueFront());
    }

    return 0;
}
