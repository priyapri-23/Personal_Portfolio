package com.example.personalportfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflator =menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.pf -> {
                val intent = Intent(this@MainActivity , DisplayActivity ::class.java)
                startActivity(intent)
            }
            R.id.res ->{
                val intent =Intent(this@MainActivity, ResumeActivity::class.java)
                startActivity(intent)
            }
            R.id.ex -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun LinkedIn(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/priya-priya-14980122b/"))
        startActivity(intent)
    }
    fun Github(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/priyapri-23"))
        startActivity(intent)
    }
    fun GMail(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/?authuser=priyap25112003@gmail.com"))
        startActivity(intent)
    }

    fun switchActivity(view: View) {
        val intent= Intent(this@MainActivity, DisplayActivity::class.java )
        startActivity(intent)
    }


}