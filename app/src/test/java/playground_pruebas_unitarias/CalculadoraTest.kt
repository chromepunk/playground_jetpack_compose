package playground_pruebas_unitarias

import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals

class CalculadoraTest {

    // PRUEBAS DE LA FUNCION SUMAR

    @Test
    fun sumar_dosNumerosPositivos() {

        // ARRANGE: preparamos los datos
        val numero1 = 3
        val numero2 = 5

        // ACT: ejecutamos la función
        val resultado = sumar(numero1, numero2)

        // ASSERT: comprobamos el resultado
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

    // PRUEBAS DE LA FUNCION ES MAYOR DE EDAD

    @Test
    fun esMayorDeEdad_conEdadDe20_devuelveTrue() {
        val resultado = esMayorDeEdad(20)

        assertTrue(resultado)
    }

    @Test
    fun esMayorDeEdad_conEdadDe15_devuelveFalse() {
        val resultado = esMayorDeEdad(15)

        assertFalse(resultado)
    }

    @Test
    fun esMayorDeEdad_conEdadDe18_devuelveTrue() {
        val resultado = esMayorDeEdad(18)

        assertTrue(resultado)
    }

    @Test
    fun esMayorDeEdad_conEdadDe17_devuelveFalse() {
        val resultado = esMayorDeEdad(17)

        assertFalse(resultado)
    }

    @Test
    fun esMayorDeEdad_conEdadDe20_noEsIgualAFalse() {
        val resultado = esMayorDeEdad(20)

        assertNotEquals(false, resultado)
    }
}