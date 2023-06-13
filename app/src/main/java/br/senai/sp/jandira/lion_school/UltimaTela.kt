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
import androidx.compose.material.*
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

class UltimaTela : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            inicio()
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun inicio() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(255, 255, 255, 255))

    ) {
        Column(modifier = Modifier
            .fillMaxSize()) {
            Column(
                modifier = Modifier
                    .height(96.dp)
                    .fillMaxSize()
                    .background(color = Color(50, 67, 128))
            ){
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

            }
            Spacer(modifier = Modifier.padding(2.dp))
            Column(
                modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.Start
            ) {
                Button(
                    modifier = Modifier
                        .height(55.dp)
                        .width(170.dp)
                        .padding(10.dp),
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(Color(255, 194, 62))
                ) {
                    Text(text = "Let's Go", color = Color(255, 255, 255));

                }
            }

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                items(1) {
                    Spacer(modifier = Modifier.size(50.dp))
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
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
                                painter = painterResource(id = R.drawable.person),
                                contentDescription = "imagem do aluno",
                                modifier = Modifier
                                    .size(90.dp)
                            )

                            Spacer(modifier = Modifier.size(40.dp))

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "NOME DO ALUNO",
                                    fontSize = 18.sp,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = FontFamily.Serif
                                )

                                Spacer(modifier = Modifier.size(20.dp))

                                Text(
                                    text = "Curso do aluno",
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