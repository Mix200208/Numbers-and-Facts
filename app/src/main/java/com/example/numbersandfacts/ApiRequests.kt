package com.example.numbersandfacts

import com.example.numbersandfacts.api.NumbersJson
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequests {

    @GET("/random/trivia?json")
    fun getTriviaFact():Call<NumbersJson>

    @GET("/random/year?json")
    fun getYearFact():Call<NumbersJson>

    @GET("/random/date?json")
    fun getDateFact():Call<NumbersJson>

    @GET("/random/math?json")
    fun getMathFact():Call<NumbersJson>


}