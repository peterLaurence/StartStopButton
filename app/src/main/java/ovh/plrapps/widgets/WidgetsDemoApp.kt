package ovh.plrapps.widgets

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import ovh.plrapps.widgets.ui.MainDestinations
import ovh.plrapps.widgets.ui.screens.Home
import ovh.plrapps.widgets.ui.screens.MarkerDemo
import ovh.plrapps.widgets.ui.screens.StartStopDemo

@Composable
fun WidgetsDemoApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = MainDestinations.HOME.name) {
        composable(MainDestinations.HOME.name) { Home(demoListState = rememberLazyListState()) {
            navController.navigate(it.name)
        }}
        composable(MainDestinations.START_STOP_BTN.name) { StartStopDemo() }
        composable(MainDestinations.MARKER.name) { MarkerDemo() }
    }
}