//Proyecto semestral 1.1 Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.
/*Implementa un programa en C que lea el archivo de texto bezdekIris.dat;
Los datos leídos del archivo deberán almacenarse en una matriz.
Para mayor facilidad se dividió en 3 el archivo fuente.*/
#include <stdio.h>
#define FILAS 50
#define COLUMNAS 4

int main() {

    //Primero llenaremos la matriz para Iris-Setosa------------------------------------------------------------
    printf("Iris-Setosa\n");

    FILE *setosa;
    float MSetosa[FILAS][COLUMNAS];
    int i, j;

    //Abrimos el archivo
    setosa = fopen("setosa.data", "r");
    if (setosa == NULL) {
        printf("Error al abrir el archivo\n");
        return -1;
    }

    //Llenamos la matriz
    for (i = 0; i < FILAS; i++) {
        for (j = 0; j < COLUMNAS; j++) {
            fscanf(setosa, "%f", &MSetosa[i][j]);
        }
    }

    //Cerramos el archivo
    fclose(setosa);

    // Imprimir la matriz MSetosa
    for (i = 0; i < FILAS; i++) {
        for (j = 0; j < COLUMNAS; j++) {
            printf("%.1f ", MSetosa[i][j]);
        }
        printf("\n");
    }


    //Hacemos lo mismo para la matriz para Iris-Versicolor------------------------------------------------------------
    printf("\nIris-Versicolor\n");

    FILE *versicolor;
    float MVersicolor[FILAS][COLUMNAS];
    int k, l;

    //Abrimos el archivo
    versicolor = fopen("versicolor.data", "r");
    if (versicolor == NULL) {
        printf("Error al abrir el archivo\n");
        return -1;
    }

    //Llenamos la matriz
    for (k = 0; k < FILAS; k++) {
        for (l = 0; l < COLUMNAS; l++) {
            fscanf(versicolor, "%f", &MVersicolor[k][l]);
        }
    }

    //Cerramos el archivo
    fclose(versicolor);

    // Imprimir la matriz MVersicolor
    for (k = 0; k < FILAS; k++) {
        for (l = 0; l < COLUMNAS; l++) {
            printf("%.1f ", MVersicolor[k][l]);
        }
        printf("\n");
    }


    //Y lo mismo para la matriz para Iris-Virginica------------------------------------------------------------
    printf("\nIris-Virginica\n");

    FILE *virginica;
    float MVirginica[FILAS][COLUMNAS];
    int m, n;

    //Abrimos el archivo
    virginica = fopen("virginica.data", "r");
    if (virginica == NULL) {
        printf("Error al abrir el archivo\n");
        return -1;
    }

    //Llenamos la matriz
    for (m = 0; m < FILAS; m++) {
        for (n = 0; n < COLUMNAS; n++) {
            fscanf(virginica, "%f", &MVirginica[m][n]);
        }
    }

    //Cerramos el archivo
    fclose(virginica);

    // Imprimir la matriz MVirginica
    for (m = 0; m < FILAS; m++) {
        for (n = 0; n < COLUMNAS; n++) {
            printf("%.1f ", MVirginica[m][n]);
        }
        printf("\n");
    }


    return 0;
}
