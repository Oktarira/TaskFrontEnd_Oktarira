import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasfe_oktarira.R
import com.example.tugasfe_oktarira.Routes

@Composable
fun LazyGrid(navController: NavController) {
    var searchQuery by remember { mutableStateOf("") }
    val destinations = listOf(
        Destination("Taj Mahal", R.drawable.img_6),
        Destination("Gunung Bromo", R.drawable.img_7),
        Destination("Eiffel Tower", R.drawable.img_8),
        Destination("Machu Picchu", R.drawable.img_9),
        Destination("Colosseum", R.drawable.img_10),
        Destination("Bali", R.drawable.img_11),
        Destination("Danau Toba", R.drawable.img_12),
        Destination("Raja Ampat", R.drawable.img_13),
        Destination("Candi Prambanan", R.drawable.img_15),
        Destination("Crystalline Turquoise Lake", R.drawable.img_16),
        Destination("Angel Falls", R.drawable.img_18),
        Destination("Bamboo Forest", R.drawable.img_19)
    )

    val filteredDestinations = destinations.filter {
        it.name.contains(searchQuery, ignoreCase = true)
    }

    Column(modifier = Modifier.fillMaxSize().padding(8.dp)) {
        Text(text = "Jelajahi Dunia Mu!", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp))
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Search") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(filteredDestinations) { destination ->
                Card(
                    modifier = Modifier
                        .size(150.dp)
                        .padding(8.dp)
                        .clickable {
                            val route = when (destination.name) {
                                "Taj Mahal" -> Routes.DetailTajMahal
                                "Gunung Bromo" -> Routes.DetailGunungBromo
                                "Eiffel Tower" -> Routes.DetailEiffel
                                "Machu Picchu" -> Routes.DetailMachu
                                "Colosseum" -> Routes.DetailColosseum
                                "Bali" -> Routes.DetailBali
                                "Danau Toba" -> Routes.DetailDanauToba
                                "Raja Ampat" -> Routes.DetailRajaAmpat
                                "Candi Prambanan" -> Routes.DetailCandi
                                "Crystalline Turquoise Lake" -> Routes.DetailCrystalline
                                "Angel Falls" -> Routes.DetailAngel
                                "Bamboo Forest" -> Routes.DetailBamboo
                                else -> Routes.Beranda
                            }
                            navController.navigate(route)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = destination.imageRes),
                            contentDescription = null,
                            modifier = Modifier.size(90.dp)
                        )
                        Text(text = destination.name, fontSize = 18.sp)
                    }
                }
            }
        }
    }
}

data class Destination(val name: String, val imageRes: Int)

@Preview(showBackground = true)
@Composable
fun LazyGridPreview() {
    val navController = rememberNavController()
    LazyGrid(navController = navController)
}
