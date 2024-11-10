package com.example.crm

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController

@Composable
fun NavigationWrapper(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = "pantallaInicio") {

    }


}