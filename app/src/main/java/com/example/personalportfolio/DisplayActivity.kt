package com.example.personalportfolio

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity;


class DisplayActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
    }
}