# Practica 1.2

## Sistemas de representación numéricos y alfanuméricos

### 1. Crea un fichero llamado ejemplo.py que tenga el siguiente contenido:
```sh
    print (“Hola”)
```

#### a. Guarda el fichero, abre el terminal (Ctrl+Alt+T), accede al directorio donde hayas guardado el fichero y ejecuta “python2 ejemplo.py”. Obtén una captura del resultado obtenido.

![hola](Imagenes/hola.png)

#### b. Modifica el print del fichero anterior para que aparezca por pantalla “Hola Raúl”. Vuelve a ejecutar “python2 ejemplo.py”. ¿Qué significa el error que aparece por pantalla? Busca como solucionar el problema para que python2 acepte caracteres en UTF-8.

![hola raul](Imagenes/hola_raul.png)

Significa que la tilde en el Raúl no esta en la codificación que la que python esta trabajando, para solucionarlo se puede poner el codigo del ú, o cambiando la codificación con el que trabaja python. 

![Cambio en codigo](Imagenes/cambio_UTF8.png)
![Muestra de resultados](Imagenes/cambio_UTF.png)