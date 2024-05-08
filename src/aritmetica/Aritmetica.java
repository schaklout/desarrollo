/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aritmetica;

/**
 *
 * Esta clase proporciona métodos para realizar operaciones matemáticas.
 */
public class Aritmetica {

    /**
     * Suma dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La suma de los dos números enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }
    
    /**
     * Resta dos números enteros.
     *
     * @param a El número del que se resta.
     * @param b El número que se resta.
     * @return La diferencia entre los dos números enteros.
     */
    public int restar(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplica dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El producto de los dos números enteros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Divide dos números enteros.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El resultado de la división como un número de punto flotante.
     * @throws IllegalArgumentException Si el divisor es cero.
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}
