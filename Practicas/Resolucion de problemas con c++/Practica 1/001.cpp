/*
* Fecha: 26/05/2016
* Nombre:
* Nota: Una tonelada m�trica equivale a 35,273.92 onzas. Escriba un programa que lea el peso de un paquete de
* cereal para desayunos en onzas y que obtenga como salida el peso en toneladas m�tricas as� como el
* n�mero de cajas necesarias para llenar una tonelada m�trica de cereal. El programa deber� permitir al
* usuario repetir este c�lculo las veces que desee.
*/

#include <iostream>

using namespace std;

int main()
{
    int cajas;
    double tonelaMetrica = 35273.92, pesoCereal, pesoTonelada;

    // Configuracion de los decimales
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);

    while(true){
        cout << "Ingrese el peso de la caja de cereal (en onzas): ";
        cin >> pesoCereal;

        // Calculamos el peso del cereal en tonelada metrica
        pesoTonelada = (pesoCereal / tonelaMetrica) * 100;

        // Calculamos el numero de cajas
        cajas = tonelaMetrica / pesoCereal;

        cout << "\nPeso: " << pesoTonelada << " tonelada metrica\n";
        cout << "Cajas para llenar una tonelada metrica: " << cajas << "\n\n";
    }

    return 0;
}
