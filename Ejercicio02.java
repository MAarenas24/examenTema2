package com.mycompany.examenprogramacion;

import java.util.InputMismatchException;
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
    
    static Scanner entradaTeclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        final int INTENTOS_PERMITIDOS = 4;
        final int CONTRASENIA_CORRECTA = 1534;
        
        int contraseniaIntroducida = 0;
        int numerosDeIntentos = 0;
        boolean claveCorrecta = (contraseniaIntroducida == CONTRASENIA_CORRECTA);
        
        while (!claveCorrecta && numerosDeIntentos < INTENTOS_PERMITIDOS) {
            contraseniaIntroducida = leerEnteroDeTeclado();
            numerosDeIntentos++;
            System.out.println("Intento " + numerosDeIntentos + " de " + INTENTOS_PERMITIDOS);
            
            if (tiene4Digitos(contraseniaIntroducida) && contraseniaIntroducida == CONTRASENIA_CORRECTA) {
                claveCorrecta = true;
            }
        }
        
        if (claveCorrecta) {
            System.out.println("Caja abierta");
        } else {
            System.out.println("Caja bloqueada");
        }
        
    }
    
    /**
     * 
     * @param num
     * @return 
     */
    public static boolean tiene4Digitos(int num) {
        boolean tiene4Digitos = false;
        if (num > 999 && num < 10000) {
            tiene4Digitos = true;
        }
        return tiene4Digitos;
    }
    
    public static int leerEnteroDeTeclado() {
        int num = 0;
        boolean esNumero = false;

        do {
            try {
                System.out.println("Introduce un numero: ");
                num = entradaTeclado.nextInt();

                esNumero = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR! Intentelo de nuevo");

                esNumero = false;
            }
            entradaTeclado.nextLine();
        } while (!esNumero);
        return num;
    }
    
}
