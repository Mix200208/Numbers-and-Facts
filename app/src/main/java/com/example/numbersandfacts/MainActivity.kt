package com.example.numbersandfacts

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.numbersandfacts.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private val BASE_URL = "http://numbersapi.com"

    val api: ApiRequests? = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiRequests::class.java)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        initButtonFunction(dataBinding)


    }


    private fun initButtonFunction(dataBinding: ActivityMainBinding) {
        dataBinding.triviaButton.setOnClickListener {
            getTriviaFact(dataBinding)
        }

        dataBinding.yearButton.setOnClickListener {
            getYearFact(dataBinding)
        }

        dataBinding.dateButton.setOnClickListener {
            getDateFact(dataBinding)
        }

        dataBinding.mathButton.setOnClickListener {
            getMathFact(dataBinding)
        }
    }


    private fun getTriviaFact(dataBinding: ActivityMainBinding) {


        GlobalScope.launch(Dispatchers.IO) {
            val response = api!!.getTriviaFact().awaitResponse()

            if (response.isSuccessful) {

                val data = response.body()!!

                withContext(Dispatchers.Main) {
                    dataBinding.text = data.text

                }
            }
        }
    }

    private fun getYearFact(dataBinding: ActivityMainBinding) {


        GlobalScope.launch(Dispatchers.IO) {
            val response = api!!.getYearFact().awaitResponse()

            if (response.isSuccessful) {

                val data = response.body()!!

                withContext(Dispatchers.Main) {
                    dataBinding.text = data.text

                }
            }
        }
    }

    private fun getDateFact(dataBinding: ActivityMainBinding) {


        GlobalScope.launch(Dispatchers.IO) {
            val response = api!!.getDateFact().awaitResponse()

            if (response.isSuccessful) {

                val data = response.body()!!

                withContext(Dispatchers.Main) {
                    dataBinding.text = data.text

                }
            }
        }
    }

    private fun getMathFact(dataBinding: ActivityMainBinding) {


        GlobalScope.launch(Dispatchers.IO) {
            val response = api!!.getMathFact().awaitResponse()

            if (response.isSuccessful) {

                val data = response.body()!!

                withContext(Dispatchers.Main) {
                    dataBinding.text = data.text

                }
            }
        }
    }

}