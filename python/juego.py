# 1. Escribimos la partida guardada
print("Guardando partida...")
archivo = open("partida.txt", "w")
archivo.write("¡Hola Damián! Tu puntaje es 500.")
archivo.close()

# 2. Inmediatamente después, la leemos
print("Leyendo la partida guardada...")
archivo = open("partida.txt", "r")
contenido = archivo.read()
archivo.close()

# 3. Mostramos el resultado en pantalla
print("¡Listo! Esto encontré en el archivo:")
print(contenido)