package com.example.newapplicationproject.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.newapplicationproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {
     lateinit var binding: ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      val map :Map<String , String> = mapOf(
          "abderahman" to "abdo123abdo",
          "ali" to "ali123ali"
      )

        val username = "abderahman"
        val password = "abdo123abdo"

        binding.btnLogin.setOnClickListener{
            var et_username = binding.etUsername.text.toString()
            var et_password = binding.etPassword.text.toString()
            if (et_username == username && et_password == password){
                Toast.makeText(this ,"Login successful" ,Toast.LENGTH_LONG ).show()
            }else{
                Toast.makeText(this , "Login feild" , Toast.LENGTH_LONG).show()
            }
            var intent : Intent = Intent(this , SecondActivity::class.java)
            intent.putExtra("username" , binding.etUsername.text.toString())
            startActivity(intent)
        }


    }


}