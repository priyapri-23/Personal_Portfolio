package com.example.personalportfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import android.view.View

class ResumeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume)
    }
    fun View_Resume(view: View) {
        val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://drive.google.com/file/d/1daEN_3__cGBBt-ja2HHVsQ8mPqEePGEP/view?usp=share_link"))
        startActivity(intent)
    }
}
