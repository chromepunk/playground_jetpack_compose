
package com.example.playground.ejemplos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Ejemplo02_Columna() {
    Column(
        // Prueba a comentar y descomentar estas líneas:
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Ejemplo01_HolaCompose()
        //una pregunta que pasaria si quisieramos que este
        //texto tuviera otro color?
        //Ejemplo03_HolaComposeParametro(color = Color.Blue)
        Ejemplo01_HolaCompose()
        Ejemplo01_HolaCompose()
    }
}
