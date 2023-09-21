#!/usr/bin/env python

numero_binario = input("Escribe un numero binario: ")

numero_decimal = 0

for posicion, digito_string in enumerate(numero_binario[::-1]):
	numero_decimal += int(digito_string) * 2 ** posicion
 
print(f'El número decimal que buscamos es {numero_decimal}')

print("Numero hexadecimal: ", hex(numero_decimal))

print("Numero octal: ", oct(numero_decimal))