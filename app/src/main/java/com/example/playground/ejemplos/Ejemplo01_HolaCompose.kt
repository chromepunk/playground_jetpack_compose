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
fun Ejemplo01_HolaCompose() {

    //Text, componente visual que muestra texto en pantalla
    Text(
        text = "Hola, Jetpack Compose"
        // ,fontSize = 30.sp
        // ,color = Color.Red
        // ,fontWeight = FontWeight.Bold
        // ,fontStyle = FontStyle.Italic
        // ,fontFamily = FontFamily.Serif
        // ,textDecoration = TextDecoration.Underline
        // ,textAlign = TextAlign.Center
        // ,letterSpacing = 3.sp

        //Modifier, es muy importante, define como se va a comportar un componente!!!
        ,modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .padding(16.dp)
    )
}
