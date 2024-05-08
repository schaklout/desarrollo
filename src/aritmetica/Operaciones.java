/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aritmetica;

/**
 *
 * @author IFC303_1
 */
/**
 * Esta clase proporciona m�todos para realizar operaciones matem�ticas.
 */
public class Operaciones {

    /**
     * Calcula el m�dulo de dos n�meros enteros.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El residuo de la divisi�n entera entre a y b.
     * @throws IllegalArgumentException Si el divisor es cero.
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a % b;
    }

    /**
     * Calcula el cuadrado de un n�mero entero.
     *
     * @param a El n�mero del que se calcular� el cuadrado.
     * @return El cuadrado del n�mero dado.
     */
    public int calcularCuadrado(int a) {
        return a * a;
    }

    /**
     * Calcula la ra�z cuadrada de un n�mero.
     *
     * @param a El n�mero del que se calcular� la ra�z cuadrada.
     * @return La ra�z cuadrada del n�mero dado.
     * @throws IllegalArgumentException Si el n�mero es negativo.
     */
    public double calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la ra�z cuadrada de un n�mero negativo");
        }
        return Math.sqrt(a);
    }
}

