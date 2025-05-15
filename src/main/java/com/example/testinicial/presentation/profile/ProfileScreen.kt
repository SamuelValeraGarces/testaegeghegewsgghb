package com.example.testinicial.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testinicial.R

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .padding(16.dp),
            contentAlignment = Alignment.BottomEnd
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_icon),
                contentDescription = "Foto de perfil",
                modifier = Modifier
                    .fillMaxSize()
            )
            Icon(
                imageVector = Icons.Default.AddAPhoto,
                contentDescription = "Subir imagen",
                tint = Color.White,
                modifier = Modifier
                    .size(24.dp)
                    .clickable { /* referencial */ }
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF1E1E1E),
                contentColor = Color.White
            ),
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Nombre de usuario: usertest1")
                Text(text = "Correo: usertest1@gmail.com")
                Text(text = "Teléfono: +51 965965965")
                Text(text = "Descripción: Amante de los autos y los viajes compartidos.")
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { /* referencial */ },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Icon(Icons.Default.AddAPhoto, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Subir publicación")
                }
            }
        }
    }
}
