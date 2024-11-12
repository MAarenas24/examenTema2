package com.mycompany.examenprogramacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Antes de nada, debes comentar la clase, y los métodos usando la nomenclatura
 * de javadoc. No te extiendas. Que sea algo breve (incluso puedes copiarlo del
 * enunciado). Escribe un programa que pida por teclado un número entero.
 * Nuestro programa debe comprobar que cada número introducido tenga al menos
 * una cantidad mínimo de números impares. Por ejemplo, si el número tecleado es
 * 78532 y el programa tiene establecido un 3 como mínimo de impares, la salida
 * del programa debe ser: El número 78532 tiene las 3 cifras impares requeridas
 * O, si no cumple dicha condición: El número 78532 no tiene las 3 cifras
 * impares requeridas Nota: el 3 no debe hardcodearse, sino guardarse en una
 * variable para poder modificarlo. Para hacer dicha comprobación debes añadir a
 * tu código el método minimoDeImpares que admitirá como parámetro el número
 * introducido por teclado. El método devolverá true si se cumple que el número
 * alcanza el mínimo de dígitos impares indicados. Usa este método o función en
 * el main para hacer tu programa. IMPORTANTE: se deben controlar las
 * excepciones que sean necesarias.
 *
 * @author Miguel Angel Arenas
 */
public class Ejercicio01 {

    static Scanner entradaTeclado = new Scanner(System.in);

    static final int MINIMO_DE_IMPARES = 3;

    public static void main(String[] args) {

        System.out.println("PROGRAMA QUE DICE SI TU NUMERO TIENES MAS DE 3 CIFRAS IMPARES");
        int numero = leerEnteroDeTeclado();

        if (minimoDeImpares(numero)) {
            System.out.println("El número " + numero + " tiene las " + MINIMO_DE_IMPARES + " cifras impares requeridas");
        } else {
            System.out.println("El número " + numero + " no tiene las " + MINIMO_DE_IMPARES + " cifras impares requeridas");
        }

    }

    /**
     * devuelve si tiene 3 pares el numero o no
     * @param num numero que introduce el usuario por telado
     * @return si tiene 3 impares o no
     */
    public static boolean minimoDeImpares(int num) {
        boolean cumpleMinimoImpares = false;
        int contadorDeImpares = 0;

        while (num > 1) {
            if (num % 10 != 0) {
                contadorDeImpares++;
            }
            num = num / 10;
        }

        if (contadorDeImpares >= MINIMO_DE_IMPARES) {
            cumpleMinimoImpares = true;
        }

        return cumpleMinimoImpares;
    }

    /**
     * lee un nuemro por teclado
     * @return 
     */
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
