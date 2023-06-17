#Ejercicio de laboratorio 6.2.2. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/ 
class Persona:
    def getID(self):
        pass
    
    def getNombre(self):
        pass
    
    def getCURP(self):
        pass
    
    def getDomicilio(self):
        pass

class Estudiante(Persona):
    def __init__(self, id, nombre, curp, domicilio):
        self.id = id
        self.nombre = nombre
        self.curp = curp
        self.domicilio = domicilio
    
    def getID(self):
        return self.id
    
    def getNombre(self):
        return self.nombre
    
    def getCURP(self):
        return self.curp
    
    def getDomicilio(self):
        return self.domicilio

class Docente(Persona):
    def __init__(self, id, nombre, curp, domicilio):
        self.id = id
        self.nombre = nombre
        self.curp = curp
        self.domicilio = domicilio
    
    def getID(self):
        return self.id
    
    def getNombre(self):
        return self.nombre
    
    def getCURP(self):
        return self.curp
    
    def getDomicilio(self):
        return self.domicilio

class PAAE(Persona):
    def __init__(self, id, nombre, curp, domicilio):
        self.id = id
        self.nombre = nombre
        self.curp = curp
        self.domicilio = domicilio
    
    def getID(self):
        return self.id
    
    def getNombre(self):
        return self.nombre
    
    def getCURP(self):
        return self.curp
    
    def getDomicilio(self):
        return self.domicilio

def main():
    opcion = 0
    registros = []

    while opcion != 5:
        print("Seleccione una opción:")
        print("1. Ingresar Estudiante")
        print("2. Ingresar Docente")
        print("3. Ingresar PAAE")
        print("4. Ver registros")
        print("5. Salir")
        opcion = int(input("Opción: "))

        if opcion == 1:
            idEstudiante = input("Ingrese el ID del estudiante: ")
            nombreEstudiante = input("Ingrese el nombre del estudiante: ")
            curpEstudiante = input("Ingrese el CURP del estudiante: ")
            domicilioEstudiante = input("Ingrese el domicilio del estudiante: ")

            registros.append(Estudiante(idEstudiante, nombreEstudiante, curpEstudiante, domicilioEstudiante))
        elif opcion == 2:
            idDocente = input("Ingrese el ID del docente: ")
            nombreDocente = input("Ingrese el nombre del docente: ")
            curpDocente = input("Ingrese el CURP del docente: ")
            domicilioDocente = input("Ingrese el domicilio del docente: ")

            registros.append(Docente(idDocente, nombreDocente, curpDocente, domicilioDocente))
        elif opcion == 3:
            idPAAE = input("Ingrese el ID del PAAE: ")
            nombrePAAE = input("Ingrese el nombre del PAAE: ")
            curpPAAE = input("Ingrese el CURP del PAAE: ")
            domicilioPAAE = input("Ingrese el domicilio del PAAE: ")

            registros.append(PAAE(idPAAE, nombrePAAE, curpPAAE, domicilioPAAE))
        elif opcion == 4:
            print("Registros ingresados:")
            print("Estudiantes:")
            for persona in registros:
                if isinstance(persona, Estudiante):
                    print("ID:", persona.getID())
                    print("Nombre:", persona.getNombre())
                    print("CURP:", persona.getCURP())
                    print("Domicilio:", persona.getDomicilio())
                    print()

            print("Docentes:")
            for persona in registros:
                if isinstance(persona, Docente):
                    print("ID:", persona.getID())
                    print("Nombre:", persona.getNombre())
                    print("CURP:", persona.getCURP())
                    print("Domicilio:", persona.getDomicilio())
                    print()

            print("PAAEs:")
            for persona in registros:
                if isinstance(persona, PAAE):
                    print("ID:", persona.getID())
                    print("Nombre:", persona.getNombre())
                    print("CURP:", persona.getCURP())
                    print("Domicilio:", persona.getDomicilio())
                    print()
        elif opcion == 5:
            print("Saliendo del programa...")
        else:
            print("Opción inválida. Intente nuevamente.")

        print()

if __name__ == "__main__":
    main()
