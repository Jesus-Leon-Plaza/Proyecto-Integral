/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarray1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class EjercicioArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int TAM = 5;
        int[] num = new int[TAM];
        int opcion;

        System.out.println();

        do {
            menu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    definirArray();
                    break;
                case 2:

                    for (int i = 0; i < TAM; i++) {
                        System.out.println("Introduce los datos para el vector");
                        num[i] = sc.nextInt();
                    }

                    System.out.println("Array ");
                    mostrar(num, TAM);
                    System.out.println();
                    System.out.println("Array inverso");
                    mostrar_Inversa(num, TAM);
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    rellenar_Array_Char();
                    break;
                case 5:
                    array_Reversa();
                    break;
                case 6:
                    numero_Cuadrado_Cubo();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;

            }
        } while (opcion != 0);
    }

    public static void menu() {
        System.out.println("--------------------");
        System.out.println("Escoja el ejercicio para hacer:");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
        System.out.println("--------------------");
        System.out.print("Opcion:  ");
        System.out.println();
    }

    public static int[] rellenar_Array() {
        Scanner sc = new Scanner(System.in);

        System.out.println("De que tamaño es el array?");
        int tamanno = sc.nextInt();
        int[] num = new int[tamanno];

        for (int i = 0; i < tamanno; i++) {
            System.out.println("Introduce los datos para el vector");
            num[i] = sc.nextInt();
        }
        return num;
    }

    public static void definirArray() {
        int[] num = new int[12];
        for (int i = 0; i < num.length; i++) {
            num[1] = 40;
            num[2] = -2;
            num[4] = 0;
            num[6] = 66;
            num[8] = 50;
            num[9] = 130;
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void mostrar(int[] num, int TAM) {

        for (int i = 0; i < TAM; i++) {
            System.out.print("[ " + num[i] + " ]");

        }
        System.out.println();
    }

    public static void mostrar_Inversa(int[] num, int TAM) {
        for (int i = TAM - 1; i >= 0; i--) {
            System.out.print("[ " + num[i] + " ]");
        }
        System.out.println();
    }

    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        int[] array = null;
        do {
            System.out.println("---------------");
            System.out.println("1. Pedir numeros para array");
            System.out.println("2. Visualizar array");
            System.out.println("3. Visualizar array inverso");
            System.out.println("4. Cambiar dato de una posicion a otra del array");
            System.out.println("0. Salir");
            System.out.println("---------------");
            System.out.println();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    array = rellenar_Array();
                    break;
                case 2:
                    if (array != null) {
                        mostrar(array, array.length);
                    } else {
                        System.out.println("El array esta vacio, rellena el array con la opcion 1");
                    }
                    break;
                case 3:
                    if (array != null) {
                        mostrar_Inversa(array, array.length);
                    } else {
                        System.out.println("El array esta vacio, rellena el array con la opcion 1");
                    }
                    break;
                case 4:
                    if (array != null) {
                        System.out.println("Que posicion quieres mover?");
                        int pos1 = sc.nextInt();
                        System.out.println("A que posicion quieres moverlo?");
                        int pos2 = sc.nextInt();

                        if (pos1 >= 0 && pos1 < array.length && pos2 >= 0 && pos2 < array.length) {
                            int aux = array[pos1];
                            array[pos1] = array[pos2];
                            array[pos2] = aux;
                            System.out.println("Posciciones cambiadas");
                        } else {
                            System.out.println("Posiciones no validas");
                        }
                        mostrar(array, array.length);
                    } else {
                        System.out.println("El array esta vacio, rellena el array con la opcion 1");
                    }
                    break;
            }
        } while (opcion != 0);
    }

    public static char[] rellenar_Array_Char() {

        Scanner sc = new Scanner(System.in);
        int tamanno = 10;

        char[] simbolo = new char[tamanno];

        for (int i = 0; i < simbolo.length; i++) {
            simbolo[0] = 'a';
            simbolo[1] = '@';
            simbolo[4] = 'x';
            simbolo[6] = '"';
            simbolo[8] = 'p';
            simbolo[9] = '*';

            System.out.print(simbolo[i] + " , ");
        }
        System.out.println();

        return simbolo;
    }

    public static int[] array_Reversa() {

        Scanner sc = new Scanner(System.in);
        int tamanno = 10;

        int[] array = new int[tamanno];
        int[] array_Reverso = new int[tamanno];

        for (int i = 0; i < array.length; i++) {//Array
            System.out.println("Introduce un numero");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {//Array inverso
            array_Reverso[i] = array[array.length - 1 - i];
        }

        System.out.println("El array es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion: " + i + ": " + array[i]);
        }

        System.out.println("El array invertido es: ");
        for (int i = 0; i < array_Reverso.length; i++) {
            System.out.println("Posicion: " + i + ": " + array_Reverso[i]);
        }
        return array;
    }

    public static void numero_Cuadrado_Cubo() {

        Scanner sc = new Scanner(System.in);

        int tamanno = 20;

        int[] numero = new int[tamanno];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 101);
        }

        int[] cuadrado = new int[numero.length];
        int[] cubo = new int[numero.length];

        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Array numero: " + i + numero[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Array cuadrado: " + i + cuadrado[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Array cubo: " + i + cubo[i] + " ");
        }

    }
}
