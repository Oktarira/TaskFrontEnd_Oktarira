import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.background
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.rememberNavController

class NavigationViewModel: ViewModel(){
    val previousRoute = mutableStateOf<String?>(null)
}
@Composable
fun ScreenPertama(navController: NavController, navViewModel: NavigationViewModel) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            NavbarTop()
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
            LazyRowLazyColumn(navController)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewScreenPertama() {
    val navViewModel = NavigationViewModel()
    val navController = rememberNavController()
    ScreenPertama(navController = navController, navViewModel = navViewModel)
}
