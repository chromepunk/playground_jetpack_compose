// Ejemplo01_HolaCompose.kt

//package, indicamos que el codigo siguiente está en ese paquete. Evitamos conflicto de nombres
package com.example.playground.ejemplos

//import nos traemos codigo de otros paquetes (asi solo usamos lo que necesitamos)
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
//para que sirve material3? nos da materialTheme (mira setContent en mainActiviy), esto trae
// ciertos estilos predefinidos, podrias crear tu propio theme si quisieras o modificar este
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Ejemplo03_HolaComposeParametro(
    color: Color = Color.Black
) {

    //Text, componente visual que muestra texto en pantalla
    Text(
        text = "Adios, Jetpack Compose"
        ,color = color

        //Modifier, es muy importante, define como se va a comportar un componente!!!
        ,modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .padding(16.dp)
    )
}
