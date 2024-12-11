package com.example.newapplicationproject.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.newapplicationproject.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        val username = intent.extras!!.get("username")
        Toast.makeText(this , "hello $username" , Toast.LENGTH_LONG).show()
    }
}