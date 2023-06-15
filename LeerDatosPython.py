#Proyecto semestral 1.2 Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.
FILAS = 50
COLUMNAS = 4

# Primero llenaremos la matriz para Iris-Setosa ------------------------------------------------------------
print("Iris-Setosa")
MSetosa = [[0 for j in range(COLUMNAS)] for i in range(FILAS)]

with open("setosa.data", "r") as setosa:
    for i in range(FILAS):
        linea = setosa.readline().strip()
        datos = linea.split(' ')
        for j in range(COLUMNAS):
            MSetosa[i][j] = float(datos[j])

# Imprimir la matriz MSetosa
for i in range(FILAS):
    for j in range(COLUMNAS):
        print(MSetosa[i][j], end=" ")
    print()

# Después llenaremos la matriz para Iris-Versicolor ------------------------------------------------------------
print("\nIris-Versicolor")
MVersicolor = [[0 for j in range(COLUMNAS)] for i in range(FILAS)]

with open("versicolor.data", "r") as versicolor:
    for i in range(FILAS):
        linea = versicolor.readline().strip()
        datos = linea.split(' ')
        for j in range(COLUMNAS):
            MVersicolor[i][j] = float(datos[j])

# Imprimir la matriz Mversicolor
for i in range(FILAS):
    for j in range(COLUMNAS):
        print(MVersicolor[i][j], end=" ")
    print()

# Y por último para Iris-Virginica ------------------------------------------------------------
print("\nIris-Virginica")
MVirginica = [[0 for j in range(COLUMNAS)] for i in range(FILAS)]

with open("virginica.data", "r") as virginica:
    for i in range(FILAS):
        linea = virginica.readline().strip()
        datos = linea.split(' ')
        for j in range(COLUMNAS):
            MVirginica[i][j] = float(datos[j])

# Imprimir la matriz MVirginica
for i in range(FILAS):
    for j in range(COLUMNAS):
        print(MVirginica[i][j], end=" ")
    print()
