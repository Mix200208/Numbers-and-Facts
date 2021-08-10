package com.example.numbersandfacts.api

data class NumbersJson(
    val date: String,
    val found: Boolean,
    val number: Int,
    val text: String,
    val type: String
)