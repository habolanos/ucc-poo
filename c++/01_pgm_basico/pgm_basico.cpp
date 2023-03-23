#include <stdio.h>
#include <math.h>
#include <iostream>

using namespace std;

int main() {

	int ivalor = 0;
	int icontador= 0;
	int i = 0;

	cout << "+-----------------------------------------+";
	cout << "| PGM: pgm_basico                         |";
	cout << "| Language: C++                           |";
	cout << "| Autor: Harold Adrian                    |";
	cout << "+-----------------------------------------+";
	cout << "";
	cout << "Ingrese un valor para calcular una suma en serie.\n";
	cin >> ivalor;
	cout << "Usted ingreso: " << ivalor << endl;

	for (i = 1; i <= ivalor; i++) {
		icontador+=i;
	}

	cout << "El resultado sumado en serie es: " << icontador << endl; 

	return 0;
}
