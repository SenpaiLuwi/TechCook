package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.finalproject.databinding.ActivityLoadingBinding


class Loading : AppCompatActivity() {
    private lateinit var binding: ActivityLoadingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        val timer = object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // Update the progress bar on each tick
                binding.loading.progress = (millisUntilFinished / 1000).toInt()
            }

            override fun onFinish() {
                // Start the next activity
                val intent = Intent(this@Loading, login::class.java)
                startActivity(intent)
                finish()
            }
        }.start()

    }

}
