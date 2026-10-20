
package com.example.playground.ejemplos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

//tenemos que añadir en gradle la expresion
//implementation("androidx.navigation:navigation-compose:2.9.4")

@Composable
fun Ejemplo08_Navegacion() {

    // Nuestros datos
    val personas = listOf(
        Persona("Ana", 25),
        Persona("Luis", 42),
        Persona("Marta", 19),
        Persona("Carlos", 31),
        Persona("Elena", 28)
    )

    // Objeto que controla la navegación
    val navController = rememberNavController()

    // Definimos las pantallas de la aplicación, navhost hace de "pizarra"
    NavHost(
        navController = navController,
        startDestination = "directorio"
    ) {
        // Primera pantalla: lista de personas
        composable("directorio") {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Directorio de personas",
                    style = MaterialTheme.typography.headlineSmall
                )

                personas.forEachIndexed { indice, persona ->
                    Card(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(12.dp)
                        ) {
                            Text("Nombre: ${persona.nombre}")
                            Text("Edad: ${persona.edad}")

                            Button(
                                onClick = {
                                    navController.navigate("detalle/$indice")
                                }
                            ) {
                                Text("Ver detalle")
                            }
                        }
                    }
                }
            }
        }

        // Segunda pantalla: detalle de una persona
        composable(
            route = "detalle/{indice}",
            arguments = listOf(
                navArgument("indice") {
                    type = NavType.IntType
                }
            )
        ) { entrada ->

            val indice = entrada.arguments?.getInt("indice")
            val persona = indice?.let {
                personas.getOrNull(it)
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "Detalle de la persona",
                    style = MaterialTheme.typography.headlineSmall
                )

                if (persona != null) {
                    Text("Nombre: ${persona.nombre}")
                    Text("Edad: ${persona.edad} años")
                } else {
                    Text("No se ha encontrado la persona.")
                }

                Button(
                    onClick = {
                        navController.popBackStack()
                    }
                ) {
                    Text("Volver al directorio")
                }
            }
        }
    }
}

