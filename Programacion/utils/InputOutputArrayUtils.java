/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.utils;


import java.util.Scanner;

/**
 * Utilidades de arrays de diferentes tipos de datos con operaciones de entrada y salida. Inicialización, impresión, etc.
 * @author jsanm
 */
public class InputOutputArrayUtils {

    public static void main(String[] args){
    
    }
    
    //variable global para leer de TECLADO
    private final static Scanner TECLADO = new Scanner(System.in);
    
    /**
     * Inicializa un array de enteros por teclado. La creación del array, la petición del tamaño al usuario y los datos de cada elemento
     * corren a cargo del sistema.
     * @return El array inicializado por el usuario en base a la interacción con el mismo.
     */
    public static int[] inicializarArrayTeclado(){
        
        System.out.print("Introduzca el tamaño del array a inicializar: ");
        int tamanyo = Integer.parseInt(TECLADO.nextLine());
        return inicializarArrayTeclado(tamanyo);
    }
    
    /**
     * Inicializa un array de enteros por teclado. La creación del array y los datos de cada elemento
     * corren a cargo del sistema.
     * @param tamanyo Tamaño del array a inicializar
     * @return El array inicializado por el usuario en base a la interacción con el mismo.
     */
    public static int[] inicializarArrayTeclado(int tamanyo){
        
        int[] array = new int[tamanyo];
        inicializarArrayTeclado(array);
        return array;
    }
    
    
    /**
     * Función para inicializar un array de enteros desde TECLADO
     * @param array Array de enteros a inicializar. Variable de entrada y salida.
     */
    public static void inicializarArrayTeclado(int[] array){
        
        if(array!=null){
            System.out.println("Inicializando array de enteros de tamaño " + array.length);
            for (int i = 0; i < array.length; i++) {
                System.out.print("\tIntroduzca el elemento " + (i+1) + ": ");
                array[i] = Integer.parseInt(TECLADO.nextLine());

            }
        }
    }
    
    /**
     * Función para inicializar un array de valores alfanuméricos desde TECLADO.La cantidad
 de elementos alfanuméricos y la creación del array corren a cuenta del sistema.
     * @return Array de frases. Cada frase es introducida por el usuario. El número de frases contenida también la elige
     * el usuario
     */
    public static String[] inicializarArrayAlfanumericoTeclado(){
        
        System.out.print("Introduzca el tamaño del array de frases a inicializar: ");
        int tamanyo = Integer.parseInt(TECLADO.nextLine());
        String[] frases = new String[tamanyo];
        for (int i = 0; i < frases.length; i++) {
            System.out.print("\tIntroduzca el elemento " + (i+1) + ": ");
            frases[i] = TECLADO.nextLine();
        }
        return frases;
    }
    
    /**
     * Función para inicializar un array de caracteres desde teclado. Se solicita una frase al usuario
     * y se devuelve como vector de caracters
     * @return 
     */
    public static char[] inicializarArrayCharTeclado(){
        
        System.out.print("Introduzca una frase para partirla caracter a caracter: ");
        return TECLADO.nextLine().toCharArray();
           
    }
    
    /**
     * Imprime un array de enteros elemento a elemento
     * @param array Array a imprimir
     */
    public static void imprimirArray(int[] array){
        
        if(array!=null){
            System.out.println("Impresión de conjunto de elementos de tipo " + array.getClass().getSimpleName());
            for (int i = 0; i < array.length; i++){
                System.out.println("\tElemento " + (i+1) + ": " +array[i]);
            }
        }
        
    }
    
    /**
     * Imprime un array de caracteres elemento a elemento
     * @param array Array a imprimir
     */
    public static void imprimirArray(char[] array){
        
        if(array!=null){
            System.out.println("Impresión de conjunto de elementos de tipo " + array.getClass().getSimpleName());
            for (int i = 0; i < array.length; i++){
                System.out.println("\tElemento " + (i+1) + ": '" +array[i]+"'");
            }
        }
        
    }
    
     /**
     * Imprime un array de valores alfanuméricos elemento a elemento
     * @param array Array a imprimir
     */
    public static void imprimirArray(String[] array){
        imprimirArray(array, 0, 1);
    }
    
    /**
     * Imprime un array de valores alfanuméricos desde una posición y de forma incremental
     * @param array Array a imprimir
     * @param desdeIndice Posición inicial
     * @param incremento
     */
    public static void imprimirArray(String[] array, int desdeIndice, int incremento){
        
        if(array!=null){
            System.out.println("Impresión de conjunto de elementos de tipo " + array.getClass().getSimpleName());
            for (int i = desdeIndice; i < array.length; i+=incremento){
                System.out.println("\tElemento " + (i+1) + ": " +array[i]);
            }
        }
    }
    
    /**
     * Imprime un array de enteros en bloques de <code>m</code> elementos por línea
     * @param array array de enteros
     * @param m cantidad de elementos por bloque o línea
     */
    public static void imprimirArray(int[] array, int m){
        
        //evitamos parámetros incorrectos del método público
        if(array!=null && m>0){
            //cabecera del vector
            System.out.println("Impresión de conjunto de elementos de tipo " + array.getClass().getSimpleName());
            
            //iteramos por bloques de m elementos
            for(int i=0; i<array.length; i+=m){
                
                //de cada fila, tabulamos al inicio
                System.out.print("\t");
                
                //iteramos de 0..(m-1) desde i
                for(int j=0; j<m && (j+i)<array.length; j++){
                    //imprimimos el elemento j+1
                    System.out.print(array[j+i]);
                    //si no es el último elemento del bloque y si no hemos llegado al final del vector, añadimos una coma
                    if((j+1)%m!=0 && (j+i+1)<array.length){                        
                        System.out.print(", ");
                    }
                }
                
                //tras cada bloque, salto de línea
                System.out.println();
            }
        }        
    }
    
    /**
     * Busca la primera aparición de un elemento en un vector
     * @param vector Vector en el cual buscar. 
     * @param elemento Valor a buscar en el vector.
     * @return La posición en la que aparece el elemento por primera vez o -1, si no se encuentra
     */
    public static int buscarPrimeraAparicionElemento(int[] vector, int elemento){
        int posicion = -1;
        if(vector!=null){
            for(int i=0; i<vector.length; i++){
                if(vector[i]==elemento){
                    posicion = i;
                    break;
                }
            }
        }
        return posicion;
    }
    
    /**
     * Busca la primera aparición de un elemento en un vector
     * @param vector Vector en el cual buscar. 
     * @param elemento Valor a buscar en el vector.
     * @return La posición en la que aparece el elemento por primera vez o -1, si no se encuentra
     */
    public static int buscarPrimeraAparicionElemento(char[] vector, char elemento){
        int posicion = -1;
        if(vector!=null){
            for(int i=0; i<vector.length; i++){
                if(vector[i]==elemento){
                    posicion = i;
                    break;
                }
            }
        }
        return posicion;
    }
    


    /**
     * Devuelve la primera posicion de un vector donde se contiene (y en el mismo orden) el contenido
     * de otro vector al completo
     * @param contenedor Vector contenedor
     * @param contenido Vector contenido
     * @return La posición donde se inicia contenido en contenedor o -1, si no se contiene
     */
    public static int contieneIndice(char[] contenedor, char[] contenido) {
        
        int posicionResultado = -1;
        if(contenedor!=null && contenido!=null){
            for(int i=0; i<contenedor.length; i++){
                int j=0;
                for(; j<contenido.length && (i+j)<contenedor.length && contenedor[i+j]==contenido[j]; j++){
                    //nothing TODO. En la condición del for interno ya se comparan posiciones seguras
                    // de 'contenedor' y 'contenido'
                }
                //si llegamos al final del bucle interno, es que hemos comparado 
                //todos los elementos de 'contenido' y están contenidos a partir de la posición 'i'
                //de 'contenedor'
                if(j==contenido.length){
                    posicionResultado = i;
                    break;
                }
            }
        }
        return posicionResultado;
    }
    
    /**
     * Ídem que {@link #contieneIndice(char[], char[])} pero devolviendo cierto o falso
     * @param contenedor Vector contenedor
     * @param contenido Vector contenido
     * @return Cierto, si el contenedor contiene al contenido. Falso en caso contrario.
     */
    public static boolean contiene(char[] contenedor, char[] contenido) {
        return contieneIndice(contenedor, contenido)>=0;
    }
    
    
}

