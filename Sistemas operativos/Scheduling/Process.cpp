/*
Fecha: 03/04/2017
Integrantes:
    Andrade Gonzalez Paulo Cesar
    Lazo Godinez Maria Ines
    Lopez Gacia Romina Arantxa
    Sanchez Gutierrez Alejandra Amaranta
Nota: Implementacion de la clase Process
*/

#include <cstdio>
#include <cstdlib>
#include <iostream>
#include "Process.hpp"
#include "Queue.hpp"

using namespace std;

/***********************************************
Clase Process
***********************************************/

// Constructor
Process::Process() {}

// Metodo que muestra el menu principal del programa
void Process::menu()
{
    // Corremos el ciclo infinitamente
    while(true){
        // Inicializamos option para elegir opcion del menu
        char *option = new char;

        do{
            // Limpiamos la pantalla
            system("clear");

            // Nombre del programa y opciones
            puts("*****************************************");
            puts("                SHEDULING");
            puts("*****************************************");
            puts("\n1.- FIFO");
            puts("2.- SJF");
            puts("3.- Round Robin");
            puts("4.- Prioridad");
            puts("0.- Salir");
            printf("\nElija una opcion: ");

            // Capturamos el valor de option
            cin >> option;

            // Verificamos si es un numero
        } while(*option < 47 || *option > 53);

        // Elegimos un algoritbo con base a option
        switch(*option){
            case '1': // FIFO
                fifo();
                break;
            case '2': // SJF
                sjf();
                break;
            case '3': // Round Robin
                roundrobin();
                break;
            case '4': // Prioridad
                priority();
                break;
            case '0': // salir
                exit(EXIT_SUCCESS);
                break;
        }
    }
}

// Metodo para ingresar datos
// @param type Tipo de ordenamiento [0 - normal, 1 - prioridad, 2 - tiempo]
Queue *Process::push(int type)
{
    char x; // ID del proceso
    int n; // Capacidad
    int y; // Tiempo del proceso
    int z; // Prioridad del proceso

    // Obtenemos la capacidad
    printf("\nIngrese el total de procesos: ");
    cin >> n;

    // Inicializamos una cola
    Queue *q = new Queue(n);

    // Ingresamos los datos
    puts("\nIngrese el proceso, ej.- A 5 10 [ID Time Prioridad]:");
    for(int i = 0; i < n; i++){
        cin >> x >> y >> z;
        // Decidimos el ordenamiento de la cola
        if(type == 0) q->enqueue(x, y, z);
        else if(type == 1) q->orderbypriority(x, y, z);
        else if(type == 2) q->orderbytime(x, y, z);
    }

    return q;
}

// Metodo con el algoritmo de fifo
void Process::fifo()
{
    // Limpiamos la pantalla
    system("clear");

    printf("*** Metodo FIFO ***\n");
    Queue *q = push(0);

    q->fifo();

    cin.ignore(256,'\n'); // Limpiamos el buffer
    puts("\n\nPresione cualquier tecla para continuar");
    getchar();
}

// Metodo con el algoritmo de sjf
void Process::sjf()
{
    // Limpiamos la pantalla
    system("clear");

    printf("*** Metodo SJF ***\n");
    Queue *q = push(2);

    q->fifo();

    cin.ignore(256,'\n'); // Limpiamos el buffer
    puts("\n\nPresione cualquier tecla para continuar");
    getchar();
}

// Metodo con el algoritmo de round robin
void Process::roundrobin()
{
    // Limpiamos la pantalla
    system("clear");

    printf("*** Metodo Round Robin ***\n");
    Queue *q = push(0);

    int quantum = q->quantum();

    q->processroundrobin(quantum);

    cin.ignore(256,'\n'); // Limpiamos el buffer
    puts("\n\nPresione cualquier tecla para continuar");
    getchar();
}

// Metodo con el algoritmo de prioridad
void Process::priority()
{
    // Limpiamos la pantalla
    system("clear");

    printf("*** Metodo Prioridad ***\n");
    // Ingresamos los datos a la cola
    Queue *q = push(1);

    // Obtenemos el quantum
    int quantum = q->quantum();

    // Relizamos el proceso
    q->processpriority(quantum);

    // Limpiamos el buffer
    cin.ignore(256,'\n');
    puts("\n\nPresione cualquier tecla para continuar");
    getchar();
}
