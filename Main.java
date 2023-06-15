/*Ejercicio de laboratorio 5.1. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/ 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FerrisJ1 ferris = new FerrisJ1();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("E")) {
            System.out.println("Ingrese la matrícula del auto (E para salir):");
            input = scanner.nextLine();

            if (!input.equals("E")) {
                System.out.println("¿En cuál ferris desea ir? (P para Portos, C para Celebrian):");
                String choice = scanner.nextLine();
                ferris.embarcarAuto(input, choice);
            }
        }

        ferris.partirFerris();
    }
}