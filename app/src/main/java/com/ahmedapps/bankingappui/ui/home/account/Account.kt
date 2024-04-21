package com.ahmedapps.bankingappui.ui.home.account

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ahmedapps.bankingappui.ui.navigation.BottomNavigationBar
import com.ahmedapps.bankingappui.ui.home.FinanceSection
import com.ahmedapps.bankingappui.ui.home.WalletSection


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Account(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            WalletSection()
            Spacer(modifier = Modifier.height(16.dp))
            FinanceSection()
        }


    }
}
