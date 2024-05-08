/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aritmetica;

/**
 *
 * Esta clase proporciona m�todos para realizar operaciones matem�ticas.
 */
public class Aritmetica {

    /**
     * Suma dos n�meros enteros.
     *
     * @param a El primer n�mero entero.
     * @param b El segundo n�mero entero.
     * @return La suma de los dos n�meros enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }
    
    /**
     * Resta dos n�meros enteros.
     *
     * @param a El n�mero del que se resta.
     * @param b El n�mero que se resta.
     * @return La diferencia entre los dos n�meros enteros.
     */
    public int restar(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplica dos n�meros enteros.
     *
     * @param a El primer n�mero entero.
     * @param b El segundo n�mero entero.
     * @return El producto de los dos n�meros enteros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Divide dos n�meros enteros.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El resultado de la divisi�n como un n�mero de punto flotante.
     * @throws IllegalArgumentException Si el divisor es cero.
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}
