package com.example.mvi.reducer

import com.example.mvi.intent.CounterIntent
import com.example.mvi.model.CounterState


fun counterReducer (state:CounterState,intent: CounterIntent): CounterState {

    return when(intent){
        is CounterIntent.Increment -> state.copy(count = state.count+1)
        is CounterIntent.Decrement -> state.copy(count = state.count-1)
    }

}