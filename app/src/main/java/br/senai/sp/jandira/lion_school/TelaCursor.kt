package br.senai.sp.jandira.lion_school

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TelaCursor : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            home()
            }
        }
    }


@Preview(showSystemUi = true)
@Composable
fun home() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(255, 255, 255, 255))

    ) {

        Box(
            modifier = Modifier
                .height(96.dp)
                .fillMaxSize()
                .background(color = Color(50, 67, 128))
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.logoimage),
                contentDescription = null,
                modifier = Modifier
                    .width(90.dp)
                    .height(90.dp)
                    .padding(5.dp)
            )


            Text(
                text = "Lion School",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.width(100.dp)

            )
            Spacer(modifier = Modifier.width(80.dp))

            Icon(
                painter = painterResource(id = R.drawable.sair),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .width(60.dp)
                    .height(20.dp)
            )

            Text(
                text = "Sair",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,

                )
        }


        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.size(150.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally


            ) {

                Text(
                    text = "To get started, choose a course:",
                    fontSize = 25.sp,
                    color = Color(50, 67, 128),
                    modifier = Modifier.padding(7.dp)
                )

            }
            Spacer(modifier = Modifier.size(70.dp))

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                items(2) {
                    Spacer(modifier = Modifier.size(20.dp))
                    Card(
                        modifier = Modifier
                            .width(280.dp)
                            .height(110.dp)
                            .border(
                                2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(20.dp)
                            ),
                        backgroundColor = Color(50, 67, 128),
                        shape = RoundedCornerShape(20.dp),




                    ) {


                        Row(modifier = Modifier.padding(8.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.sair),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(30.dp)
                            )

                            Spacer(modifier = Modifier.size(5.dp))

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "DS",
                                    fontSize = 28.sp,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = FontFamily.Serif
                                )

                                Spacer(modifier = Modifier.size(9.dp))

                                Text(
                                    text = "Desenvolvimento de Sistemas",
                                    fontSize = 13.sp,
                                    color = Color.White,
                                    fontFamily = FontFamily.Serif

                                )
                            }


                        }
                    }

                }
            }
        }
    }
}

