#!/usr/bin/env python

numero_cadena = input("Escribe un numero hexadecimal: ")

numero_hexa=int(numero_cadena, 16)
    
print("Numero decimal: ", int(numero_hexa))

print("Numero binario: ", bin(numero_hexa))

print("Numero octal: ", oct(numero_hexa))