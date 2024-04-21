package com.ahmedapps.bankningappui.ui.home.notification

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.ahmedapps.bankningappui.ui.navigation.BottomNavigationBar
import com.ahmedapps.bankningappui.ui.home.FinanceSection


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Notifications(navController: NavHostController) {
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
            FinanceSection()
        }


    }
}
