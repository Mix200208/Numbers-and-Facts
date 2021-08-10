package com.example.numbersandfacts

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.numbersandfacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        dataBinding.text = "Hello!"

    }
}