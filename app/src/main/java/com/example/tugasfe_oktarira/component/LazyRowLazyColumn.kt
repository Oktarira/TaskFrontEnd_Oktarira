import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun LazyRowLazyColumn(navController: NavController) {

    ///lAZY ROW
    Column(modifier = Modifier.fillMaxSize() .padding(top = 16.dp) ) {
        Text(text = "Wisata Populer!", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp))
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            items((1..10).toList()) { item ->
                ///ITEM 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailTajMahal)
                        }
                    ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_6),
                            contentDescription = null,
                            modifier = Modifier.size(130.dp)
                        )
                        Text(text = "Taj Mahal", fontSize = 18.sp)
                    }
                }
                ///ITEM 2
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                        .padding(8.dp)
                        .clickable {
                           navController.navigate(Routes.DetailGunungBromo)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = null,
                            modifier = Modifier.size(130.dp)
                        )
                        Text(text = "Gunung Bromo", fontSize = 18.sp)
                    }
                }
                ///ITEM 3
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailEiffel)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_8),
                            contentDescription = null,
                            modifier = Modifier.size(130.dp)
                        )
                        Text(text = "Eiffel Tower", fontSize = 18.sp)
                    }
                }
                ///ITEM 4
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailMachu)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            contentDescription = null,
                            modifier = Modifier.size(130.dp)
                        )
                        Text(text = "Machu Picchu", fontSize = 18.sp)
                    }
                }
                ///ITEM 5
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailColosseum)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_10),
                            contentDescription = null,
                            modifier = Modifier.size(130.dp)
                        )
                        Text(text = "Colosseum", fontSize = 18.sp)
                    }
                }
                ///ITEM 6
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailBali)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_11),
                            contentDescription = null,
                            modifier = Modifier.size(130.dp)
                        )
                        Text(text = "Bali", fontSize = 18.sp)
                    }
                }
                ///ITEM 7
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailDanauToba)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_12),
                            contentDescription = null,
                            modifier = Modifier.size(130.dp)
                        )
                        Text(text = "Danau Toba", fontSize = 18.sp)
                    }
                }
                ///ITEM 8
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailRajaAmpat)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_13),
                            contentDescription = null,
                            modifier = Modifier.size(130.dp)
                        )
                        Text(text = "Raja Ampat", fontSize = 18.sp)
                    }
                }
                ///ITEM 9
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailAogashima)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_14),
                            contentDescription = null,
                            modifier = Modifier.size(130.dp)
                        )
                        Text(text = "Aogashima Volcano", fontSize = 18.sp)
                    }
                }
                ///ITEM 10
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailCandi)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_15),
                            contentDescription = null,
                            modifier = Modifier.size(130.dp)
                        )
                        Text(text = "Candi Prambanan", fontSize = 18.sp)
                    }
                }
            }
        }
        ///LAZY COLUMN
        Text(text = "Rekomendasi Khusus Untuk Mu!", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp))
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            items((1..10).toList()) { item ->
                ///ITEM 1
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailCandi)
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_15),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Column(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Text(
                                text = "Candi Prambanan",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Yogyakarta",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Indonesia",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
                ///ITEM 2
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailCrystalline)
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_17),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Column(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Text(
                                text = "Crystalline Turquoise Lake",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Jiuzhaigou Valley",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Cina",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
                ///ITEM 3
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailAogashima)
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_14),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Column(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Text(
                                text = "Aogashima Volcano",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Jepang",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Jepang",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
                ///ITEM 4
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailAngel)
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_18),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Column(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Text(
                                text = "Angel Falls",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Gran Sabana",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Venezuela",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
                ///ITEM 5
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailColosseum)
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_10),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Column(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Text(
                                text = "Colosseum",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Roma",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Italia",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
                ///ITEM 6
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailDanauToba)
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_12),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Column(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Text(
                                text = "Danau Toba",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Sumatera Utara",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Indonesia",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
                ///ITEM 7
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailRajaAmpat)
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_13),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Column(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Text(
                                text = "Raja Ampat",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Papua Barat",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Indonesia",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
                ///item 8
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailBamboo)
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_19),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Column(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Text(
                                text = "Bamboo Forest",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Kyoto",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Jepang",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
                ///item 9
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailMachu)
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Column(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Text(
                                text = "Machu Picchu",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Cusco",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Peru",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
                ///item 10
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.DetailHan)
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_20),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Column(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Text(
                                text = "Han Song Doong",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Quảng Bình",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                            Text(
                                text = "Vietnam",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewLazyRowLazyColumn() {
    LazyRowLazyColumn(navController = rememberNavController())
}
