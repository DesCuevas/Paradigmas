/*Ejercicio de laboratorio 6.1.1. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/ 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Seleccione una figura:");
            System.out.println("1. Triángulo");
            System.out.println("2. Círculo");
            System.out.println("3. Rectángulo");
            System.out.println("4. Hexágono");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseT = scanner.nextDouble();
                    System.out.print("Ingrese el lado 2 del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Ingrese el lado 3 del triángulo: ");
                    double lado3 = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaT = scanner.nextDouble();

                    Triangulo triangulo = new Triangulo(baseT, lado2, lado3, alturaT);
                    System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                    System.out.println("Área del triángulo: " + triangulo.calcularArea());
                    break;

                case 2:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();

                    Circulo circulo = new Circulo(radio);
                    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    break;

                case 3:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double altura = scanner.nextDouble();

                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    break;

                case 4:
                    System.out.print("Ingrese el lado del hexágono: ");
                    double lado = scanner.nextDouble();
                    System.out.print("Ingrese el apotema del hexágono: ");
                    double apotema = scanner.nextDouble();

                    Hexagono hexagono = new Hexagono(lado, apotema);
                    System.out.println("Perímetro del hexágono: " + hexagono.calcularPerimetro());
                    System.out.println("Área del hexágono: " + hexagono.calcularArea());
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            
            System.out.println();
        }
    }
}
