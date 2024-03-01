/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;


import java.util.Calendar;
import java.util.Scanner;

/**
 * Escribe un programa que solicite los datos del asegurado (nombre, apellidos y año de nacimiento) 
 * y le pregunte si desea contratar un seguro de decesos o de vida y muestre el importe de la prima anual correspondiente. 
 * @author jsanm
 */
public class TestApp {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        //1º - Solicitamos los datos de entrada del asegurado. Nótse que permitimos no introducir algún dato al usuario
        System.out.println("*** INFORMACIÓN DE ENTRADA DEL ASEGURADO ***");
        System.out.println("Indique, por orden, el nombre, primer apellido, segundo apellido y año de nacimiento del asegurado.");
        System.out.println("->Si no conoce algún dato, pulse simplemente ENTER");
        String nombre = input.nextLine();
        String apellido1 = input.nextLine();
        String apellido2 = input.nextLine();
        String anyoDeNacimientoStr = input.nextLine();
        int anyoDeNacimiento = Calendar.getInstance().get(Calendar.YEAR);
        if(anyoDeNacimientoStr!=null && !"".equals(anyoDeNacimientoStr))
            anyoDeNacimiento = Integer.parseInt(anyoDeNacimientoStr);
        
        //2º - Creamos el asegurado en base al contenido introducido. Aquí internamente se valida si algún dato 
        //es incorrecto ya que las propiedades están bien encapsuladas
        Asegurado asegurado = new Asegurado(anyoDeNacimiento, nombre, apellido1, apellido2);
        
       
        //3º - Solicitamos la modalidad de seguro (vida o decesos?)
        Seguro seguro;
        System.out.println("*** SELECCIÓN DE MODALIDAD DE SEGURO ***");
        System.out.println("¿Qué tipo de modalidad de seguro desea?");
        System.out.print("->(V)ida o (D)ecesos: ");
        String modalidadSeguro = input.nextLine();
        
        //4º - Creamos el objeto polimórfico dinámicamente en base a la decisión del usuario
        if ("v".equalsIgnoreCase(modalidadSeguro)){
            seguro = new SeguroVida(asegurado);
            
        } else {
            seguro = new SeguroDecesos(asegurado);
            
        }
        
        //5º - Calculamos con el método abstracto el importe de prima. En tiempo de ejecución
        //se ejecutará el cálculo de Vida o Decesos en base a la elección del usuario
        System.out.println("*** CÁLCULO DE PRIMA ***");
        System.out.printf("->El importe anual a abonar será de %.2f€\n",seguro.calcularPrimaAnual()); 
    }    
}
