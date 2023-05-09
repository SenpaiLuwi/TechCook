package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import com.example.finalproject.databinding.ActivityLoginScreensBinding


class login : AppCompatActivity() {
    private lateinit var binding : ActivityLoginScreensBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityLoginScreensBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonID.setOnClickListener {
            val username = binding.userID.text.toString()
            val password = binding.passID.text.toString()

            if (username == "admin" && password == "admin123") {
                // do something if login is successful
                val intent = Intent(this@login, loginLoadingScreen::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Username or Password doesn't match, Try Again!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}