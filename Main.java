/*Ejercicio de laboratorio 4.1. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/ 
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        Arreglos arre = new Arreglos(4);
        arre.imprimirArreglo();
        arre.llenarArreglo();
        System.out.println("");
        arre.imprimirArreglo();
        
        double[] array=arre.devolverArreglo();
        System.out.println("");
        
        for(double x:array)
        {
            System.out.println("Elem -> "+x);
        }
        
        double[][] array2=new double[2][];
        array2[0]=new double[3];
        array2[1]=new double[5];
        
        double maximo = arre.obtenerElementoMaximo();
        double minimo = arre.obtenerElementoMinimo();
        
        System.out.println(" ");
        
        System.out.println("a) Elemento máximo: " + maximo);
        System.out.println("b) Elemento mínimo: " + minimo);
    
        double suma = arre.sumarElementos();
        System.out.println("c) Suma de elementos: " + suma);
        
        System.out.println(" ");
        System.out.println("Generar otro arreglo para sumarlos y calcular el producto punto ");
        System.out.println("Arreglo generado: ");
        
        Arreglos otroArreglo = new Arreglos(4);
        otroArreglo.llenarArreglo();
        otroArreglo.imprimirArreglo();
        
        double[] arreSuma = arre.sumarArreglo(otroArreglo);
        double productoPunto = arre.productoPunto(otroArreglo);
        
        System.out.println(" ");

        System.out.println("d) Suma de los arreglos:");
        for (double elemento : arreSuma) {
            System.out.println(elemento);
        }
        
        System.out.println(" ");

        System.out.println("e) Producto punto: " + productoPunto);
        
        System.out.println(" ");
        
        System.out.println("f) Ordenar el arreglo inicial: ");
        arre.ordenarArreglo();
        arre.imprimirArreglo();
        
        System.out.println(" ");
        
        double media = arre.calcularMedia();
        System.out.println("g) Media del arreglo: " + media);
    }
}