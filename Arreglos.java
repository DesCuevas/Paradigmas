/*Ejercicio de laboratorio 4.1. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/ 
import java.util.Arrays;

public class Arreglos {
    double[] arreglo;

    public Arreglos(int n) {
        
        
        arreglo = new double[n];
    }

    public void llenarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random();
        }
    }

    public void imprimirArreglo() {
        for (double x : arreglo) {
            System.out.println("Elemento -> " + x);
        }
    }

    public double[] devolverArreglo() {
        return arreglo;
    }

    public double obtenerElementoMaximo() {
        double maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }

    public double obtenerElementoMinimo() {
        double minimo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        return minimo;
    }
    
    public double sumarElementos() {
        double suma = 0;
        for (double elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
    
    public double[] sumarArreglo(Arreglos otroArreglo) {
        double[] arreSuma = new double[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            arreSuma[i] = arreglo[i] + otroArreglo.arreglo[i];
        }
        return arreSuma;
    }

    public double productoPunto(Arreglos otroArreglo) {
        double productoPunto = 0;
        for (int i = 0; i < arreglo.length; i++) {
            productoPunto += arreglo[i] * otroArreglo.arreglo[i];
        }
        return productoPunto;
    }
    
    public void ordenarArreglo() {
        Arrays.sort(arreglo);
    }
    
    public double calcularMedia() {
        double suma = 0;
        for (double elemento : arreglo) {
            suma += elemento;
        }
        return suma / arreglo.length;
    }
    
}
