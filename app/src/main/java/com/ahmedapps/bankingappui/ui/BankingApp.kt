package com.ahmedapps.bankingappui.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahmedapps.bankingappui.ui.home.Home
import com.ahmedapps.bankingappui.ui.home.account.Account
import com.ahmedapps.bankingappui.ui.home.notification.Notifications
import com.ahmedapps.bankingappui.ui.home.wallet.Wallet
import com.ahmedapps.bankingappui.ui.theme.BankingAppUITheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun BankingApp() {
    val navController = rememberNavController()

    BankingAppUITheme {
        // A surface container using the 'background' color from the theme

        SetBarColor(color = MaterialTheme.colorScheme.background)
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            NavHost(navController = navController, startDestination = "home") {
                composable("Home") { Home(navController) }
                composable("Account") { Account(navController) }
                composable("Wallet") { Wallet(navController) }
                composable("Notifications") { Notifications(navController) }
            }
        }
    }
}

@Composable
private fun SetBarColor(color: Color) {
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setSystemBarsColor(
            color = color
        )
    }
}