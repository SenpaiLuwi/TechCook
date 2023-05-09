package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.MainActivity
import com.example.finalproject.databinding.ActivityCalamaresRecipeBinding


class calamaresRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityCalamaresRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalamaresRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.appetizerbutton.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            val viewOnly = "Appetizers"

            intent.putExtra("viewOnly" , viewOnly)
            startActivity(intent)
        }

        binding.saladbutton.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            val viewOnly = "Salads"

            intent.putExtra("viewOnly" , viewOnly)
            startActivity(intent)
        }

        binding.snackbutton.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            val viewOnly = "Snacks"

            intent.putExtra("viewOnly" , viewOnly)
            startActivity(intent)
        }
    }
}