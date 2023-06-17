#Ejercicio de laboratorio 6.2.1. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/ 
import math

class Figura:
    def calcularPerimetro(self):
        pass
    
    def calcularArea(self):
        pass

class Triangulo(Figura):
    def __init__(self, baseT, lado2, lado3, alturaT):
        self.baseT = baseT
        self.lado2 = lado2
        self.lado3 = lado3
        self.alturaT = alturaT
    
    def calcularPerimetro(self):
        return self.baseT + self.lado2 + self.lado3
    
    def calcularArea(self):
        return (self.baseT * self.alturaT) / 2

class Circulo(Figura):
    def __init__(self, radio):
        self.radio = radio
    
    def calcularPerimetro(self):
        return 2 * math.pi * self.radio
    
    def calcularArea(self):
        return math.pi * self.radio ** 2

class Rectangulo(Figura):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    
    def calcularPerimetro(self):
        return 2 * (self.base + self.altura)
    
    def calcularArea(self):
        return self.base * self.altura

class Hexagono(Figura):
    def __init__(self, lado, apotema):
        self.lado = lado
        self.apotema = apotema
    
    def calcularPerimetro(self):
        return 6 * self.lado
    
    def calcularArea(self):
        return ((6 * self.lado) * self.apotema) / 2

def main():
    opcion = 0
    
    while opcion != 5:
        print("Seleccione una figura:")
        print("1. Triángulo")
        print("2. Círculo")
        print("3. Rectángulo")
        print("4. Hexágono")
        print("5. Salir")
        opcion = int(input("Opción: "))
        
        if opcion == 1:
            baseT = float(input("Ingrese la base del triángulo: "))
            lado2 = float(input("Ingrese el lado 2 del triángulo: "))
            lado3 = float(input("Ingrese el lado 3 del triángulo: "))
            alturaT = float(input("Ingrese la altura del triángulo: "))
            
            triangulo = Triangulo(baseT, lado2, lado3, alturaT)
            print("Perímetro del triángulo:", triangulo.calcularPerimetro())
            print("Área del triángulo:", triangulo.calcularArea())
        elif opcion == 2:
            radio = float(input("Ingrese el radio del círculo: "))
            
            circulo = Circulo(radio)
            print("Perímetro del círculo:", circulo.calcularPerimetro())
            print("Área del círculo:", circulo.calcularArea())
        elif opcion == 3:
            base = float(input("Ingrese la base del rectángulo: "))
            altura = float(input("Ingrese la altura del rectángulo: "))
            
            rectangulo = Rectangulo(base, altura)
            print("Perímetro del rectángulo:", rectangulo.calcularPerimetro())
            print("Área del rectángulo:", rectangulo.calcularArea())
        elif opcion == 4:
            lado = float(input("Ingrese el lado del hexágono: "))
            apotema = float(input("Ingrese el apotema del hexágono: "))
            
            hexagono = Hexagono(lado, apotema)
            print("Perímetro del hexágono:", hexagono.calcularPerimetro())
            print("Área del hexágono:", hexagono.calcularArea())
        elif opcion == 5:
            print("Saliendo del programa...")
        else:
            print("Opción inválida. Intente nuevamente.")
        
        print()

if __name__ == "__main__":
    main()
