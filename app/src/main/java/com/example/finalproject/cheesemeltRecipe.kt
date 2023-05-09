package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.databinding.ActivityCheesemeltRecipeBinding

class cheesemeltRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityCheesemeltRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheesemeltRecipeBinding.inflate(layoutInflater)
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