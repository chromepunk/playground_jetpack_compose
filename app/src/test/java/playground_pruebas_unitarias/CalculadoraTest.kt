package playground_pruebas_unitarias

import org.junit.Test
import org.junit.Assert.assertEquals

class CalculadoraTest {

    @Test
    fun sumar_dosNumerosPositivos() {
        val resultado = sumar(3, 5)

        assertEquals(8, resultado)
    }
}