
package com.example.playground.ejemplos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Ejemplo06_ListaPersonas() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Mis panas")

        Ejemplo05_TarjetaPersona(
            nombre = "Ana",
            edad = 25
        )

        Ejemplo05_TarjetaPersona(
            nombre = "Luis",
            edad = 42
        )

        Ejemplo05_TarjetaPersona(
            nombre = "Marta",
            edad = 19
        )
    }
}

