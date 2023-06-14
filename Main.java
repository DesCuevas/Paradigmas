/*Ejercicio de laboratorio 4.2. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/ 
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EjercicioMatrices matriz1 = new EjercicioMatrices();
        EjercicioMatrices matriz2 = new EjercicioMatrices();

        System.out.println("Matriz 1:");
        matriz1.pedirDimensiones();
        matriz1.inicializarMatriz();
        System.out.println("\nContenido de la matriz 1:");
        matriz1.imprimirMatriz();
        System.out.println("\nElemento máximo de la matriz 1: " + matriz1.getElementoMaximo());
        System.out.println("Elemento mínimo de la matriz 1: " + matriz1.getElementoMinimo());

        System.out.println();

        System.out.println("Matriz 2:");
        matriz2.pedirDimensiones();
        matriz2.inicializarMatriz();
        System.out.println("\nContenido de la matriz 2:");
        matriz2.imprimirMatriz();
        System.out.println("\nElemento máximo de la matriz 2: " + matriz2.getElementoMaximo());
        System.out.println("Elemento mínimo de la matriz 2: " + matriz2.getElementoMinimo());

        System.out.println();

        if (matriz1.puedenSumarse(matriz2)) {
            System.out.println("\nSuma de matrices:");
            double[][] matrizSuma = matriz1.sumarMatrices(matriz2);
            imprimirMatriz(matrizSuma);

            System.out.println();
        } else {
            System.out.println("\nLas matrices no pueden sumarse debido a dimensiones incompatibles.");
        }

        if (matriz1.puedenRestarse(matriz2)) {
            System.out.println("\nResta de matrices:");
            double[][] matrizResta = matriz1.restarMatrices(matriz2);
            imprimirMatriz(matrizResta);

            System.out.println();
        } else {
            System.out.println("\nLas matrices no pueden restarse debido a dimensiones incompatibles.");
        }

        if (matriz1.puedenMultiplicarse(matriz2)) {
            System.out.println("\nMultiplicación de matrices:");
            double[][] matrizMultiplicacion = matriz1.multiplicarMatrices(matriz2);
            imprimirMatriz(matrizMultiplicacion);
        } else {
            System.out.println("\nLas matrices no pueden multiplicarse debido a dimensiones incompatibles.");
        }
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
