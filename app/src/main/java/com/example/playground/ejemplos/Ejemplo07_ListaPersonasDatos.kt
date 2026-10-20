
package com.example.playground.ejemplos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Ejemplo07_ListaPersonasDatos() {

    // Los datos se definen fuera de la interfaz visual.
    //fijate en el archivo Persona.kt
    val personas = listOf(
        Persona("Ana", 25),
        Persona("Luis", 42),
        Persona("Marta", 19),
        Persona("Carlos", 31),
        Persona("Elena", 28)
    )

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Directorio de personas")

        // Recorremos la lista y creamos una tarjeta por persona.
        personas.forEach { persona ->
            Ejemplo05_TarjetaPersona(
                nombre = persona.nombre,
                edad = persona.edad
            )
        }
    }
}

