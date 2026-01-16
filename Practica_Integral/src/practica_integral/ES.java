/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_integral;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class ES {

    /**
     * Lee una cadena desde teclado hasta que se pulsa intro
     *
     * @param cadena
     * @return
     */
    public static String leerCadena(String cadena) {
        Scanner Es = new Scanner(System.in);
        System.out.println(cadena);
        return Es.nextLine();
    }

    /**
     * Lee una cadena desde teclado
     *
     * @return
     */
    public static String leerCadena() {
        Scanner Es = new Scanner(System.in);
        return Es.nextLine();
    }

    public static void escribirLn(String cadena) {
        System.out.println(cadena);
    }

    /**
     * Muestra un mensaje pidiendo un numero y lee un numero entero desde
     * teclado
     *
     * @param mensaje
     * @return
     */
    public static int leerEntero(String mensaje) {
        int num;
        boolean correcto = false;

        do {
            System.out.println("Introduce un numero");
            try {
                num = Integer.parseInt(leerCadena(mensaje));
                correcto = true;
            } catch (NumberFormatException e) {
                System.out.println("Error en el formato del numero, se espera un entero");
                num = 0;
            }
        } while (!correcto);

        return num;
    }

    public static byte leerByte(String mensaje) {
        byte num;
        boolean correcto = false;

        do {
            try {
                num = Byte.parseByte(leerCadena(mensaje));
                correcto = true;
            } catch (NumberFormatException e) {
                System.out.println("Error en el formato del numero, se espera un byte");
                num = 0;
            }
        } while (!correcto);

        return num;
    }

    /**
     * Muestra un mensaje pidiendo un numero y lee un numero byte desde teclado
     *
     * @param mensaje
     * @param num
     * @return
     */
    public static byte leerByte(String mensaje, byte min, byte max) {
        Scanner Es = new Scanner(System.in);
        byte num;
        boolean correcto = false;

        do {
            System.out.println(mensaje);
            try {
                num = Es.nextByte();
                if (num < min || num > max) {
                    System.out.println("Numero fuera de rango");
                } else {
                    correcto = true;
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error en el formato del numero, se espera un byte");
                Es.next();
            }
        } while (!correcto);

        return 0;
    }

    public static boolean leerBoolean(String mensaje) {

        Scanner sc = new Scanner(System.in);
        boolean valor;

        boolean correcto = false;
        String palabra;
        do {
            try {
                System.out.println(mensaje.toUpperCase());
                palabra = sc.nextLine();

                switch (palabra) {
                    case "SI":
                        valor = true;
                        correcto = true;
                        break;
                    case "NO":
                        valor = false;
                        correcto = true;
                        break;
                    default:
                        valor = false;
                }
            } catch (Exception e) {
                System.out.println("Error entrada: debería ser (SI|NO)");
                System.out.println("Introduce una entrada valida");
                valor = false;
            }
        } while (!correcto);
        return valor;
    }
}
