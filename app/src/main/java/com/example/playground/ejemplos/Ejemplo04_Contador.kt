
package com.example.playground.ejemplos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Ejemplo04_Contador() {

    // Creamos una variable que recuerda su valor y que pasa a estar vigilada por compose
    var contador by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = Modifier.padding(24.dp)
    ) {
        // Mostramos el valor actual del contador
        Text(
            text = "Contador: $contador"
        )

        // Creamos un botón que modifica el contador
        Button(
            onClick = {
                contador++
            }
        ) {
            Text("Incrementar")
        }
    }
}
