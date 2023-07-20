@file:OptIn(ExperimentalMaterial3Api::class)

package com.dblaz.coffeemasters

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dblaz.coffeemasters.pages.InfoPage
import com.dblaz.coffeemasters.pages.MenuPage
import com.dblaz.coffeemasters.pages.OffersPage
import com.dblaz.coffeemasters.pages.OrderPage
import com.dblaz.coffeemasters.ui.theme.CoffeeMastersTheme
import com.dblaz.coffeemasters.ui.theme.Primary


@Composable
fun AppTitle() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Primary)
        .padding(16.dp),
        contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Coffee Masters Logo"
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App(dataManager: DataManager) {
    var selectedRoute = remember {
        mutableStateOf("menu")
    }
    Scaffold(
        topBar = {
            AppTitle()
        },

        content = {
            when(selectedRoute.value){
                Routes.MenuPage.route -> MenuPage(dataManager)
                Routes.OffersPage.route -> OffersPage()
                Routes.OrderPage.route -> OrderPage(dataManager)
                Routes.InfoPage.route -> InfoPage()
            }
        },

        bottomBar = {
            NavBar(
                selectedRoute = selectedRoute.value,
                onChange = { newRoute ->
                    selectedRoute.value = newRoute

            })
        }
    )
}