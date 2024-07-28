package com.example.mvi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mvi.intent.CounterIntent
import com.example.mvi.model.CounterState

@Composable
fun CounterScreen(uiState: CounterState, onIntent: (CounterIntent) -> Unit) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Count: ${uiState.count}", style = MaterialTheme.typography.bodySmall)

        Row {
           Button(onClick = { onIntent(CounterIntent.Decrement)}) {
               Text(text = "Decrement")
           } 
           
           Spacer(modifier = Modifier.width(16.dp))

            Button(onClick = { onIntent(CounterIntent.Increment)}) {
                Text(text = "Increment")
            }
        }
    }

}