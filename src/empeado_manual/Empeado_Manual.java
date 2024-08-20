/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empeado_manual;

/**
 *
 * @author Usuario
 */
public class Empeado_Manual {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una instancia de la clase Scanner para leer la entrada del usuario
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Leer el sueldo actual del empleado
        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        // Crear una instancia de la clase Empleado
        Empleado empleado = new Empleado ();

        // Calcular el aumento de sueldo
        double aumento = empleado.calcularAumento(sueldoActual);

        // Calcular el nuevo sueldo
        double nuevoSueldo = sueldoActual + aumento;

        // Imprimir el aumento y el nuevo sueldo
        System.out.println("El aumento de sueldo es: $" + aumento);
        System.out.println("El nuevo sueldo es: $" + nuevoSueldo);
    }
  }
    
