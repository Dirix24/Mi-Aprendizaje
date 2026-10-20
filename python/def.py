# 1. Definimos la función primero
def mostrar_RESULTADO(puntuacion):
    if puntuacion >= 50:
        print(f"nivel superado con puntuación: {puntuacion}")
    else:
        print(f"nivel no superado con puntuación: {puntuacion}")

# 2. Esto va FUERA de la función (sin sangría/indentación)
niveles = [20, 60, 90, 40]

print("Resultados de los niveles:")
for nivel in niveles:
    mostrar_RESULTADO(nivel)