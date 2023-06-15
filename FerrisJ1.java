/*Ejercicio de laboratorio 5.1. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/ 
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class FerrisJ1 {
    private Stack<String> portos;
    private Queue<String> celebrian;

    public FerrisJ1() {
        portos = new Stack<>();
        celebrian = new LinkedList<>();
    }

    public void embarcarAuto(String matricula, String ferris) {
        if (ferris.equalsIgnoreCase("P")) {
            if (portos.size() < 10) {
                portos.push(matricula);
            } else {
                System.out.println("-----El ferris Portos está lleno, auto no añadido.-----");
            }
        } else if (ferris.equalsIgnoreCase("C")) {
            if (celebrian.size() < 10) {
                celebrian.add(matricula);
            } else {
                System.out.println("-----El ferris Celebrian está lleno, auto no añadido.-----");
            }
        } else {
            System.out.println("Opción inválida. Intente nuevamente.");
        }
        
        System.out.println("Contenido de Portos: " + portos.toString());
        System.out.println("Contenido de Celebrian: " + celebrian.toString());
    }

    public void partirFerris() {
        System.out.println("Los ferris acaban de partir...");
        System.out.println("Los ferris completaron su viaje, desembarcando...\n");

        while (!portos.isEmpty() || !celebrian.isEmpty()) {
            if (!portos.isEmpty()) {
                String auto = portos.pop();
                System.out.println("\nAuto " + auto + " salió del ferris Portos.");
                System.out.println("Contenido de Portos: " + portos.toString());
                System.out.println("Contenido de Celebrian: " + celebrian.toString());
            }

            if (!celebrian.isEmpty()) {
                String auto = celebrian.poll();
                System.out.println("\nAuto " + auto + " salió del ferris Celebrian.");
                System.out.println("Contenido de Portos: " + portos.toString());
                System.out.println("Contenido de Celebrian: " + celebrian.toString());
            }
        }
    }
}