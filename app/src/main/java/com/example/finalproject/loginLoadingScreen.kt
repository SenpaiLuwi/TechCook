package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.finalproject.databinding.ActivityLoginLoadingScreenBinding


class loginLoadingScreen : AppCompatActivity() {
    private lateinit var binding: ActivityLoginLoadingScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityLoginLoadingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

            val timer = object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // Update the progress bar on each tick
                binding.loading.progress = (millisUntilFinished / 1000).toInt()
            }

            override fun onFinish() {
                // Start the next activity
                val intent = Intent(this@loginLoadingScreen, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }
}