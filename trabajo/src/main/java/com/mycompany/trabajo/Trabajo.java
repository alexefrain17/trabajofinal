/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Trabajo {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Pregunta 1
    System.out.println("que es Microsoft ");
    String respuesta1 = scanner.nextLine();
    if (respuesta1.equalsIgnoreCase("es una compañía estadounidense vinculada al desarrollo, fabricación")) {
        System.out.println("¡Correcto!");

    }else{
        System.out.println("Respuesta incorrecta. La respuesta correcta es una compañia.");
    }
     // Pregunta 2
     System.out.println("¿En qué año se fundó Google?");
     String respuesta2 = scanner.nextLine();
     if (respuesta2.equals("1998")) {
          System.out.println("¡Correcto!");
     }else{
          System.out.println("Respuesta incorrecta. La respuesta correcta es 1998.");
     }
     scanner.close();
    }
}
