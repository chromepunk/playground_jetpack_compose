package playground_pruebas_unitarias

import org.junit.Test
import org.junit.Assert.assertEquals

class CalculadoraTest {

    @Test
    fun sumar_dosNumerosPositivos() {
        val resultado = sumar(3, 5)

        assertEquals(8, resultado)
    }

    @Test
    fun sumar_dosNumerosNegativos() {
        val resultado = sumar(-3, -5)

        assertEquals(-8, resultado)
    }

    @Test
    fun sumar_unNumeroPositivoYUnoNegativo() {
        val resultado = sumar(10, -4)

        assertEquals(6, resultado)
    }

    @Test
    fun sumar_dosCeros() {
        val resultado = sumar(0, 0)

        assertEquals(0, resultado)
    }

    @Test
    fun sumar_unNumeroYUnCero() {
        val resultado = sumar(25, 0)

        assertEquals(25, resultado)
    }

    @Test
    fun sumar_numerosGrandes() {
        val resultado = sumar(1000000, 2000000)

        assertEquals(3000000, resultado)
    }

    @Test
    fun sumar_superaElLimiteDeInt() {
        val resultado = sumar(Int.MAX_VALUE, 1)

        assertEquals(Int.MAX_VALUE.toLong() + 1L, resultado.toLong())
    }
}