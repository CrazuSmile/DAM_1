#!/usr/bin/env python3

# Obtiene una cadena de caracteres escrita por teclado
numero_cadena = input("Escribe un número entero: ")

# Transforma la cadena en un número entero
numero_decimal = int(numero_cadena)

# Muestra la codificación binaria, octal y hexadecimal
print("En binario es", bin(numero_decimal))

print("En octal es", oct(numero_decimal))

print("En hexadecimal es", hex(numero_decimal))