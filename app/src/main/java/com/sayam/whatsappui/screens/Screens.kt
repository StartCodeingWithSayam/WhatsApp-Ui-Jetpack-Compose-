package com.sayam.whatsappui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@RootNavGraph(start = true)
@Destination
@Composable
fun HomeScreen(
    navigation: DestinationsNavigator
) {
    Box(modifier = Modifier.fillMaxSize()) {
        OutlinedButton(onClick = { },
            content = {
                Text(text = "Profile Screen")
            })
    }
}

@Destination
@Composable
fun ProfileScreen() {

}
