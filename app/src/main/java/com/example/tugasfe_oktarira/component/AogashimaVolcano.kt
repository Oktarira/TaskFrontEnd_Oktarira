package com.example.tugasfe_oktarira.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasfe_oktarira.R

@Composable
fun Aogashima(navController: NavController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
    ) {
        item {
            Column(
                modifier = Modifier.fillMaxSize().padding(top = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_14),
                    contentDescription = null,
                    modifier = Modifier.size(300.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = " Aogashima Volcano",
                    fontSize = 30.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Aogashima, Tokyo Mteropolis, Japan",
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 23.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Card(
                        modifier = Modifier
                            .padding(8.dp)
                            .size(width = 100.dp, height = 90.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_27),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(30.dp)
                                    .clip(RoundedCornerShape(0.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                text = "Sauna",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier.padding(top = 8.dp),
                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .padding(8.dp)
                            .size(width = 100.dp, height = 90.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_27),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(30.dp)
                                    .clip(RoundedCornerShape(0.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                text = "Area Parkir",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier.padding(top = 8.dp),
                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .padding(8.dp)
                            .size(width = 100.dp, height = 90.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_27),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(30.dp)
                                    .clip(RoundedCornerShape(0.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                text = "Penginapan",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier.padding(top = 8.dp),
                            )
                        }
                    }
                }
            }
        }
        item {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Deskripsi",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 23.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .wrapContentHeight()
                        .wrapContentWidth(),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "Aogashima adalah sebuah pulai vulkanis yang terletak di kepualauan izu di Jepang. Aogashima dikelilingi tebing curam serta gunung berapi yang masih aktif. Aogashima buka sepanjang tahun, namun pengunjung harus memastikan cuaca dan kondisi laut memungkinkan akses menuju pulau ini. ",
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(16.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun AogashimaPreview() {
    Aogashima(navController = rememberNavController())
}

