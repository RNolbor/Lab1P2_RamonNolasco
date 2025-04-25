/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class Lab1P2_RamonNolasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("--- Laboratorio de Java ---");
            System.out.println("1. Jugar Numberle");
            System.out.println("2. Verificar Palindromo");
            System.out.println("3. Salir");
            System.out.println("Elige una opcion: ");
            
            opcion = input.nextInt();
            while (opcion < 1 || opcion < 3) {
                System.out.println("Ingrese opcion valida!: ");
                    opcion = input.nextInt();
            }
            switch ( opcion ) {           
                case 1: 
                    jugarNumberle(input);
                    break;
                case 2: 
                    verificarPalindromo(input);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
            }
                      
        } while ( opcion != 3);
              
    }
    
    // METODOS EJERCICIO 1
    public static void jugarNumberle(Scanner input) {
        System.out.println("Selecciona dificultad:");
        System.out.println("1. Facil (Intentos 8, Longitud 3, Rango 1-6)");
        System.out.println("2. Media (Intentos 6, Longitud 4, Rango 1-8)");
        System.out.println("3. Dificil (Intentos 5, Longitud 5, Rango 1-9)");
        
        int dificultad = input.nextInt();
        while (dificultad < 1 || dificultad > 3) {
            System.out.println("Ingrese una dificultad valida!: ");
            dificultad = input.nextInt();
        }
        
        int longitud = 0;
        int intentos = 0; 
        int maxDigito = 0;
    
        if (dificultad == 1) {
            longitud = 3; intentos = 8; maxDigito = 6;
        } else if (dificultad == 2) {
            longitud = 4; intentos = 6; maxDigito = 8;
        } else {
            longitud = 5; intentos = 5; maxDigito = 9;
        }
        Random rand = new Random();
        int[] secreto = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            secreto[i] = rand.nextInt(maxDigito) + 1;
        }
        input.nextLine();
        ArrayList<String> historial = new ArrayList<>();
        
    }    
        
        
    // METDOS EJERCICIO 2
    public static void verificarPalindromo(Scanner input) {
        System.out.print("Ingresa una palabra o frase: ");
        input.nextLine();
        String frase = input.nextLine().toLowerCase().replaceAll(" ", "");

        if (esPalindromo(frase, 0, frase.length() - 1)) {
            System.out.println("Es un palindromo.");
        } else {
            System.out.println("No es un palindromo.");
        }
    }

    public static boolean esPalindromo(String str, int i, int j) {
        if (i >= j) {
            return true;
        }
        if ( str.charAt(i) != str.charAt(j) ) {
            return false;
        }
        return esPalindromo( str, i + 1, j - 1 );
    }
}