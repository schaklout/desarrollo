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
 * Esta clase proporciona métodos para realizar operaciones matemáticas.
 */
public class Operaciones {

    /**
     * Calcula el módulo de dos números enteros.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El residuo de la división entera entre a y b.
     * @throws IllegalArgumentException Si el divisor es cero.
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a % b;
    }

    /**
     * Calcula el cuadrado de un número entero.
     *
     * @param a El número del que se calculará el cuadrado.
     * @return El cuadrado del número dado.
     */
    public int calcularCuadrado(int a) {
        return a * a;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     *
     * @param a El número del que se calculará la raíz cuadrada.
     * @return La raíz cuadrada del número dado.
     * @throws IllegalArgumentException Si el número es negativo.
     */
    public double calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}

