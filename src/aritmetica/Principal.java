/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aritmetica;

/**
 *
 * @author IFC303_1
 */
public class Principal {
    public static void main(String[] args) {
        // Ejemplo de uso de la clase Aritmetica
        Aritmetica aritmetica = new Aritmetica();
        int suma1 = aritmetica.sumar(10, 5);
        System.out.println("Resultado de la suma: " + suma1);

        int resta1 = aritmetica.restar(20, 8);
        System.out.println("Resultado de la resta: " + resta1);

        int multiplicacion1 = aritmetica.multiplicar(7, 3);
        System.out.println("Resultado de la multiplicación: " + multiplicacion1);

        try {
            double division1 = aritmetica.dividir(15, 4);
            System.out.println("Resultado de la división: " + division1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Ejemplo de uso de la clase Operaciones
        Operaciones operaciones = new Operaciones();
        int modulo1 = operaciones.modulo(25, 7);
        System.out.println("Resultado del módulo: " + modulo1);

        int cuadrado1 = operaciones.calcularCuadrado(6);
        System.out.println("Cuadrado de 6: " + cuadrado1);

        try {
            double raiz1 = operaciones.calcularRaizCuadrada(25);
            System.out.println("Raíz cuadrada de 25: " + raiz1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
