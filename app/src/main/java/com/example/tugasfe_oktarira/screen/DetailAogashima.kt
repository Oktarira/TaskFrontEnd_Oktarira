package com.example.tugasfe_oktarira.screen

import Back
import BottomNavigationBar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasfe_oktarira.component.Aogashima
import com.example.tugasfe_oktarira.component.RajaAmpat

@Composable
fun ScreenKeduabelas(navController: NavController) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            Back(navController)
        },
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(Color(0xFFFFFFF))
        ) {
            Aogashima(navController)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewScreenKeduabelas() {
    ScreenKeduabelas(navController = rememberNavController())
}