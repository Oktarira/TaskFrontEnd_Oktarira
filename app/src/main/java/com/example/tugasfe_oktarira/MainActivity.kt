package com.example.tugasfe_oktarira

import Back
import NavigationViewModel
import ScreenKedua
import ScreenKetiga
import ScreenPertama
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tugasfe_oktarira.Routes.Beranda
import com.example.tugasfe_oktarira.screen.ScreenKedelapan
import com.example.tugasfe_oktarira.screen.ScreenKeduabelas
import com.example.tugasfe_oktarira.screen.ScreenKeempat
import com.example.tugasfe_oktarira.screen.ScreenKeempatbelas
import com.example.tugasfe_oktarira.screen.ScreenKeenam
import com.example.tugasfe_oktarira.screen.ScreenKeenambelas
import com.example.tugasfe_oktarira.screen.ScreenKelima
import com.example.tugasfe_oktarira.screen.ScreenKelimabelas
import com.example.tugasfe_oktarira.screen.ScreenKesebelas
import com.example.tugasfe_oktarira.screen.ScreenKesembilan
import com.example.tugasfe_oktarira.screen.ScreenKesepuluh
import com.example.tugasfe_oktarira.screen.ScreenKetigabelas
import com.example.tugasfe_oktarira.screen.ScreenKetujuh
import com.example.tugasfe_oktarira.screen.ScreenKetujuhbelas
import com.example.tugasfe_oktarira.ui.theme.TugasFE_OktariraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = Routes.Beranda,
                enterTransition = { EnterTransition.None },
                exitTransition = { ExitTransition.None }
            ) {
                composable(
                    route = Routes.Beranda,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    val navViewModel: NavigationViewModel = viewModel()
                    ScreenPertama(navController = navController, navViewModel = navViewModel)
                }
                composable(
                    route = Routes.Explore,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    val navViewModel: NavigationViewModel = viewModel()
                    ScreenKedua(navController = navController)
                }
                composable(
                    route = Routes.About,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    val navViewModel: NavigationViewModel = viewModel()
                    ScreenKetiga(navController = navController)
                }
                composable(
                    route = Routes.DetailTajMahal,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    val navViewModel: NavigationViewModel = viewModel()
                    ScreenKeempat(navController = navController)
                }
                composable(
                    route = Routes.DetailGunungBromo,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKelima(navController = navController)
                }
                composable(
                    route = Routes.DetailAngel,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKelimabelas(navController = navController)
                }
                composable(
                    route = Routes.DetailAogashima,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKeduabelas(navController = navController)
                }
                composable(
                    route = Routes.DetailBali,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKesembilan(navController = navController)
                }
                composable(
                    route = Routes.DetailBamboo,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKeenambelas(navController = navController)
                }
                composable(
                    route = Routes.DetailCandi,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKetigabelas(navController = navController)
                }
                composable(
                    route = Routes.DetailColosseum,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKedelapan(navController = navController)
                }
                composable(
                    route = Routes.DetailCrystalline,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKeempatbelas(navController = navController)
                }
                composable(
                    route = Routes.DetailDanauToba,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKesepuluh( navController = navController)
                }
                composable(
                    route = Routes.DetailEiffel,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKeenam(navController = navController)
                }
                composable(
                    route = Routes.DetailHan,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKetujuhbelas(navController = navController)
                }
                composable(
                    route = Routes.DetailMachu,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKetujuh(navController = navController)
                }
                composable(
                    route = Routes.DetailRajaAmpat,
                    enterTransition = { EnterTransition.None },
                    exitTransition = { ExitTransition.None },
                ) {
                    ScreenKesebelas(navController = navController)
                }
                composable("detail") {
                    Back(navController = navController)
                }
            }
        }
    }
}



