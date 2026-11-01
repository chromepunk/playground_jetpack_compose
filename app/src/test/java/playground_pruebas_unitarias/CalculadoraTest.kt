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
}