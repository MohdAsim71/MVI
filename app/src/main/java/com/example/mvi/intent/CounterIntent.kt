package com.example.mvi.intent

sealed class CounterIntent{
    object Increment:CounterIntent()
    object Decrement:CounterIntent()
}