package com.example.to_docompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.to_docompose.navigation.destinations.listComposable
import com.example.to_docompose.navigation.destinations.taskComposable
import com.example.to_docompose.ui.viewmodels.SharedViewModel
import com.example.to_docompose.utils.Contants.LIST_SCREEN

@Composable
fun SetUpNavigation(
    navHostController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navHostController) {
        Screens(navController = navHostController)
    }

    NavHost(navController = navHostController, startDestination = LIST_SCREEN) {
        listComposable(navigateToTaskScreen = screen.task, sharedViewModel = sharedViewModel)
        taskComposable(navigateToListScreen = screen.list)
    }
}