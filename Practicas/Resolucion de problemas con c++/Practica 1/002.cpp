/*
* Fecha: 26/05/2016
* Nombre:
* Nota: Un laboratorio de investigaci�n del gobierno concluy� que un endulzante artificial de uso com�n en gaseosas
* diet�ticas provoc� la muerte en ratones de laboratorio. Un amigo suyo est� desesperado por perder peso
* pero no puede renunciar a dicho refresco. Su amigo quiere saber cu�nta gaseosa diet�tica puede beber sin
* morir a consecuencia de ello. Escriba un programa que d� la respuesta. La entrada del programa es la
* cantidad de endulzante artificial necesaria para matar a un rat�n, el peso del rat�n y el peso del sujeto a
* dieta. Para que su amigo est� fuera de peligro, aseg�rese de que el programa pida el peso en el que el sujeto
* a dieta termina con ella, en lugar del peso actual del sujeto. Asuma que la gaseosa diet�tica contiene 1/10
* del 1% de endulzante artificial. Utilice una declaraci�n de variable con el modificador const para darle
* nombre a esa fracci�n. Podr�a expresar el porcentaje como el valor double 0.001. Su programa debe permitir
* la repetici�n del c�lculo las veces que desee.
*/

#include <iostream>

using namespace std;

int main()
{
    // Cantidad de enduzalte artifical
    const double endulzante = 0.001; // 1/10 1%

    int total;
    double cantidadEndulzante, pesoRaton, pesoSujeto, limiteRaton, limiteSujeto;

    while(true){
        cout << "Ingrese la cantidad de endulzante artifical para matar a un raton: ";
        cin >> cantidadEndulzante;
        cout << "Ingrese el peso del raton: ";
        cin >> pesoRaton;
        cout << "Ingrese el peso en el que el sujeto termina la dieta: ";
        cin >> pesoSujeto;

        // Calculamos relacion endulzate - peso raton
        limiteRaton = (pesoRaton / cantidadEndulzante) * 100;

        // Calculamos relacion contra peso del sujeto
        limiteSujeto = (pesoSujeto / limiteRaton) * 100;

        // Calculamos maximo de gaseosa a tomar
        total = limiteSujeto / endulzante;

        cout << "\n\nEl total de gaseosas a tomar es: " << total << "\n\n";
    }

    return 0;
}
