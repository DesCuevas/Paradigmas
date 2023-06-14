/*Ejercicio de laboratorio 4.2. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/ 
import java.util.Random;
import java.util.Scanner;

public class EjercicioMatrices {
    private double[][] matriz;

    public void pedirDimensiones() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();
        matriz = new double[filas][columnas];
    }

    public void inicializarMatriz() {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextDouble();
            }
        }
    }

    public void imprimirMatriz() {
        for (double[] fila : matriz) {
            for (double elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public double getElementoMaximo() {
        double maximo = matriz[0][0];
        for (double[] fila : matriz) {
            for (double elemento : fila) {
                if (elemento > maximo) {
                    maximo = elemento;
                }
            }
        }
        return maximo;
    }

    public double getElementoMinimo() {
        double minimo = matriz[0][0];
        for (double[] fila : matriz) {
            for (double elemento : fila) {
                if (elemento < minimo) {
                    minimo = elemento;
                }
            }
        }
        return minimo;
    }

    public boolean puedenSumarse(EjercicioMatrices otraMatriz) {
        return matriz.length == otraMatriz.matriz.length && matriz[0].length == otraMatriz.matriz[0].length;
    }

    public boolean puedenRestarse(EjercicioMatrices otraMatriz) {
        return matriz.length == otraMatriz.matriz.length && matriz[0].length == otraMatriz.matriz[0].length;
    }

    public boolean puedenMultiplicarse(EjercicioMatrices otraMatriz) {
        return matriz[0].length == otraMatriz.matriz.length;
    }

    public double[][] sumarMatrices(EjercicioMatrices otraMatriz) {
        if (!puedenSumarse(otraMatriz)) {
            throw new IllegalArgumentException("Las dimensiones de las matrices no son compatibles para la suma");
        }

        double[][] matrizSuma = new double[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizSuma[i][j] = matriz[i][j] + otraMatriz.matriz[i][j];
            }
        }
        return matrizSuma;
    }

    public double[][] restarMatrices(EjercicioMatrices otraMatriz) {
        if (!puedenRestarse(otraMatriz)) {
            throw new IllegalArgumentException("Las dimensiones de las matrices no son compatibles para la resta");
        }

        double[][] matrizResta = new double[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizResta[i][j] = matriz[i][j] - otraMatriz.matriz[i][j];
            }
        }
        return matrizResta;
    }

    public double[][] multiplicarMatrices(EjercicioMatrices otraMatriz) {
        if (!puedenMultiplicarse(otraMatriz)) {
            throw new IllegalArgumentException("Las dimensiones de las matrices no son compatibles para la multiplicación");
        }

        int filas = matriz.length;
        int columnas = otraMatriz.matriz[0].length;
        int dimensionComun = otraMatriz.matriz.length;

        double[][] matrizMultiplicacion = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                double sum = 0;
                for (int k = 0; k < dimensionComun; k++) {
                    sum += matriz[i][k] * otraMatriz.matriz[k][j];
                }
                matrizMultiplicacion[i][j] = sum;
            }
        }

        return matrizMultiplicacion;
    }
}
