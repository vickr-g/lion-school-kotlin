package br.senai.sp.jandira.lion_school

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.ui.theme.LionschoolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         loginLion()
            }
        }
    }



@Preview(showSystemUi = true)
@Composable
fun loginLion() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp)
        ) {
            Spacer(modifier = Modifier.size(150.dp))
            Text(
                text = "Lion" +
                        " School",
                fontWeight = FontWeight(700),
                fontSize = 50.sp,
                color = Color(50, 67, 128),
                modifier = Modifier.padding(30.dp)

            )
            Image(
                painter = painterResource(id = R.drawable.logoimage),
                contentDescription = null,
                modifier = Modifier
                    .width(140.dp)
                    .height(180.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "FIND YOUR IDEAL CURSE",
                fontWeight = FontWeight(700),
                fontSize = 20.sp,
                color = Color(50, 67, 128),
                modifier = Modifier.padding(30.dp)

            )
            Spacer(modifier = Modifier.height(70.dp))
            Column(
                modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    modifier = Modifier
                        .height(48.dp)
                        .width(190.dp),
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(Color(168, 189, 231))
                ) {
                    Text(text = "Let's Go", color = Color(50, 67, 128));

                }
            }
        }
    }
}



