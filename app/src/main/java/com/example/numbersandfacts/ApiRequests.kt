package com.example.numbersandfacts

import com.example.numbersandfacts.api.NumbersJson
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequests {
    @GET("/random/trivia/")
    fun getTriviaFact():Call<NumbersJson>

    @GET("/random/year/")
    fun getYearFact():Call<NumbersJson>

    @GET("/random/date/")
    fun getDateFact():Call<NumbersJson>

    @GET("/random/math/")
    fun getMathFact():Call<NumbersJson>


}