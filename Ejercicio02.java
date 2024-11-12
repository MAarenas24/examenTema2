package com.mycompany.examenprogramacion;

import java.util.Scanner;

/**
 * Antes de nada, debes comentar la clase, y los métodos usando la nomenclatura 
 * de javadoc. No te extiendas. Que sea algo breve (incluso puedes copiarlo 
 * del enunciado).
 * Escribe un programa que realice el control de acceso a una caja fuerte. 
 * Para ello vas a reutilizar el código del ejercicio anterior (que indica si 
 * el número introducido tiene el mínimo de dígitos impares indicado).
 * La combinación es un número de 4 dígitos (que vas a establecer en la 
 * declaración de variables). El programa pedirá al usuario que introduzca 
 * la combinación para abrirla.
 * Si se introduce un número que no tenga exactamente 4 dígitos se mostrará 
 * por pantalla el mensaje: "La combinación debe ser de 4 dígitos". Hacer el 
 * método tiene4Digitos(), al que se le pasará como parámetro el número 
 * introducido por el usuario. Esto supondrá un intento fallido.
 * Si el número introducido no tiene el mínimo de dígitos impares establecido 
 * (puedes ponerlo en una variable) se mostrará por pantalla el mensaje: 
 * "La combinación no cumple con los parámetros de seguridad establecidos". 
 * Como ya se ha indicado antes, reutiliza el método que hayas implementado en 
 * ejercicios anteriores y haz los cambios necesarios. Esto supondrá un intento 
 * fallido.
 * Si el usuario no acierta, se le mostrará el mensaje "Lo siento, esa no es 
 * la combinación" y si acierta se le dirá "La caja fuerte se ha abierto 
 * satisfactoriamente".
 * En cada intento, acierte o no, se mostrará por pantalla la expresión 
 * ""Intento X de Y", donde X es el intento actual (1 para el primero, 2 para 
 * el segundo, etc.) e Y es el máximo de intentos permitidos. 
 * El usuario tendrá cuatro oportunidades para abrir la caja fuerte. Al agotar 
 * los cuatro intentos, se mostrará por pantalla el mensaje "Caja bloqueada".
 * IMPORTANTE: aunque no es lo correcto, usa sólo la excepción genérica para 
 * capturar cualquier posible problema y muestra en ella un mensaje de error.
 * 
 * @author Miguel Angel Arenas Cuevas
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        final int INTENTOS_PERMITIDOS = 4;
        final int CONTRASENIA_CORRECTA = 1534;
        
        int contrasenia = 0;
        int numerosDeIntentos = 0;
        
        do {
            System.out.println("Introduce contraseña: ");
            contrasenia = entradaTeclado.nextInt();
            
        } while (contrasenia != CONTRASENIA_CORRECTA || numerosDeIntentos >= 4);
        
    }
    
    public static void tiene4Digitos(int num) {
        if (num < 999 || num > 10000) {
            System.out.println("El numero tiene que ser de de 4 digitos");
        }
    }
    
}
