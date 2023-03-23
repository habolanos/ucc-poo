#include <stdio.h>
#include <math.h>
#include <iostream>

using namespace std;

int main() {

	int ivalor = 0;
	int icontador= 0;
	int i = 0;

	cout << "+-----------------------------------------+\n";
	cout << "| PGM: pgm_basico                         |\n";
	cout << "| Language: C++                           |\n";
	cout << "| Autor: Harold Adrian                    |\n";
	cout << "+-----------------------------------------+\n";
	cout << "";
	cout << "💾 Ingrese un valor: ";
	cin >> ivalor;
	cout << "💽 Usted ingreso: " << ivalor << endl;

	for (i = 1; i <= ivalor; i++) {
		icontador+=i;
	}

	cout << "🔥 El resultado sumado en serie es: " << icontador << endl; 

	return 0;
}
