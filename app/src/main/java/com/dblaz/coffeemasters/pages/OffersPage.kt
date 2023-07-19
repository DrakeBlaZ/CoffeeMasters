package com.dblaz.coffeemasters.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dblaz.coffeemasters.ui.theme.Alternative2
import com.dblaz.coffeemasters.R


/**@Preview(showBackground = true, widthDp = 400)
@Composable
private fun Offer_Preview(){
    Offer("My_Title", "This is the description")
}
**/
@Composable
fun OffersPage(){
    Column(Modifier.padding(top = 48.dp, bottom = 48.dp).verticalScroll(rememberScrollState())) {
        Offer("Early Coffee", "10% off. Offer valid from 6 am to 9 am.")
        Offer("Welcome Gift", "25/ off on your first order")
        Offer("Early Coffee", "10% off. Offer valid from 6 am to 9 am.")
        Offer("Early Coffee", "10% off. Offer valid from 6 am to 9 am.")
        Offer("Early Coffee", "10% off. Offer valid from 6 am to 9 am.")


    }
}
@Composable
fun Offer(title: String, description: String){
    Box(
        modifier = Modifier.padding(16.dp)
    ){
        Image(painter = painterResource(R.drawable.background_pattern),
            contentDescription = "Background pattern",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .matchParentSize()
                .fillMaxWidth()
                .height(180.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ){
            Text(text = title,
                modifier = Modifier
                    .background(Alternative2)
                    .padding(16.dp),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = description,
                modifier = Modifier
                    .background(Alternative2)
                    .padding(16.dp),
                style = MaterialTheme.typography.titleMedium)
        }
    }

}