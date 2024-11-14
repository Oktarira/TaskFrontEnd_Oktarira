import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasfe_oktarira.R
import com.example.tugasfe_oktarira.Routes

data class BottomNavigation(
    val title: String,
    val iconRes: Int,
    val iconSelected: Int,
    val route: String
)

val items = listOf(
    BottomNavigation(
        title = "Beranda",
        iconRes = R.drawable.img,
        iconSelected = R.drawable.img_1,
        route = Routes.Beranda
    ),
    BottomNavigation(
        title = "Explore",
        iconRes = R.drawable.img_2,
        iconSelected = R.drawable.img_3,
        route = Routes.Explore
    ),
    BottomNavigation(
        title = "About",
        iconRes = R.drawable.img_4,
        iconSelected = R.drawable.img_5,
        route = Routes.About
    )
)

@Composable
fun BottomNavigationBar(navController: NavController) {
    val currentRoute = navController.currentBackStackEntry?.destination?.route
    val customFont = FontFamily(
        Font(R.font.bold, FontWeight.Bold)
    )
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        NavigationBar(
            containerColor = Color(0xFF7E60BF),
            modifier = Modifier.height(80.dp)
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = currentRoute == item.route,
                    onClick = {
                        if (currentRoute != item.route) {
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(
                                id = if (currentRoute == item.route) {
                                    item.iconSelected
                                } else {
                                    item.iconRes
                                }
                            ),
                            contentDescription = item.title,
                            tint = Color.White,
                            modifier = Modifier.size(22.dp)
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            color = Color.White,
                            fontWeight = if (currentRoute == item.route) {
                                FontWeight.Bold
                            } else {
                                FontWeight.Normal
                            },
                            fontSize = 15.sp
                        )
                    },
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigationBar(navController = rememberNavController())
}
