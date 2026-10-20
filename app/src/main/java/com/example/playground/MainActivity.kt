package com.example.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.playground.ejemplos.Ejemplo01_HolaCompose
import com.example.playground.ejemplos.Ejemplo02_Columna
import com.example.playground.ejemplos.Ejemplo04_Contador
import com.example.playground.ejemplos.Ejemplo06_ListaPersonas
import com.example.playground.ejemplos.Ejemplo07_ListaPersonasDatos
import com.example.playground.ejemplos.Ejemplo08_Navegacion
import com.example.playground.ui.theme.PlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme{
                //Ejemplo01_HolaCompose()
                //Ejemplo02_Columna()
                //Ejemplo04_Contador()
                //Ejemplo06_ListaPersonas()
                //Ejemplo07_ListaPersonasDatos()
                Ejemplo08_Navegacion()
            }
        }
    }
}