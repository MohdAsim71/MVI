package com.example.mvi.viewModel

import androidx.lifecycle.ViewModel
import com.example.mvi.intent.CounterIntent
import com.example.mvi.model.CounterState
import com.example.mvi.reducer.counterReducer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CounterViewModel:ViewModel() {

    private  val _uiState = MutableStateFlow(CounterState())
    val uiState: StateFlow<CounterState> = _uiState

    fun handleIntent(intent: CounterIntent){
        _uiState.value = counterReducer(_uiState.value,intent)
    }
}