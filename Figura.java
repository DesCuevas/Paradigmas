/*Ejercicio de laboratorio 6.1.1. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/ 
import java.util.Scanner;

abstract class Figura {
    abstract double calcularPerimetro();
    abstract double calcularArea();
}

class Triangulo extends Figura {
    private double baseT;
    private double lado2;
    private double lado3;
    private double alturaT;
    
    public Triangulo(double baseT, double lado2, double lado3, double alturaT) {
        this.baseT = baseT;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.alturaT = alturaT;
    }
    
    public double calcularPerimetro() {
        return baseT + lado2 + lado3;
    }
    
    public double calcularArea() {
        return (baseT * alturaT)/2;
    }
}

class Circulo extends Figura {
    private double radio;
    private final double PI = 3.14159;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
    
    public double calcularArea() {
        return PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    
    public double calcularArea() {
        return base * altura;
    }
}

class Hexagono extends Figura {
    private double lado;
    private double apotema;
    
    public Hexagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }
    
    public double calcularPerimetro() {
        return 6 * lado;
    }
    
    public double calcularArea() {
        return ((6 * lado)*apotema)/2;
    }
}