package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SearchView
import com.example.finalproject.databinding.ActivityHomePageBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHomePageBinding
    private lateinit var salads: List<Button>
    private lateinit var appetizers: List<Button>
    private lateinit var snacks: List<Button>
    private lateinit var recipes: List<Button>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //CATEGORIES
        var viewOnly:String = ""
        viewOnly = intent.getStringExtra("viewOnly").toString()
        //SALADS
        salads = listOf(binding.Salad1, binding.Salad2, binding.Salad3, binding.Salad4)
        //APPETIZERS
        appetizers = listOf(binding.Appetizer1, binding.Appetizer2, binding.Appetizer3, binding.Appetizer4)
        //SNACKS
        snacks = listOf(binding.Snack1, binding.Snack2, binding.Snack3, binding.Snack4)

        if(viewOnly == "Appetizers"){
            makeButtonsVisible(appetizers)
            makeButtonsInvisible(salads)
            makeButtonsInvisible(snacks)
        }else if(viewOnly == "Salads"){
            makeButtonsVisible(salads)
            makeButtonsInvisible(appetizers)
            makeButtonsInvisible(snacks)
        }else if(viewOnly == "Snacks"){
            makeButtonsVisible(snacks)
            makeButtonsInvisible(salads)
            makeButtonsInvisible(appetizers)
        }


        //CATEGORY BUTTONS
        binding.appetizerButton.setOnClickListener(){
            val intent = Intent(this, this::class.java)
            val viewOnly = "Appetizers"

            intent.putExtra("viewOnly" , viewOnly)
            startActivity(intent)
        }

        binding.saladButton.setOnClickListener(){
            val intent = Intent(this, this::class.java)
            val viewOnly = "Salads"

            intent.putExtra("viewOnly" , viewOnly)
            startActivity(intent)
        }

        binding.snackButton.setOnClickListener(){
            val intent = Intent(this, this::class.java)
            val viewOnly = "Snacks"

            intent.putExtra("viewOnly" , viewOnly)
            startActivity(intent)
        }
        binding.aboutusButton.setOnClickListener(){
            val intent = Intent(this, aboutus::class.java)
            startActivity(intent)
        }


        //SEARCH ENGINE
        recipes = listOf(binding.Salad1, binding.Salad2, binding.Salad3, binding.Salad4,
                            binding.Appetizer1, binding.Appetizer2, binding.Appetizer3, binding.Appetizer4,
                            binding.Snack1, binding.Snack2, binding.Snack3, binding.Snack4)

        binding.searchButton.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                val searchQuery = newText.toLowerCase(Locale.getDefault())
                recipes.forEach {
                        recipe -> val recipeName = recipe.text.toString().toLowerCase(Locale.getDefault())
                    if (recipeName.contains(searchQuery)) {
                        recipe.visibility = View.VISIBLE
                    } else {
                        recipe.visibility = View.GONE
                    }
                }
                return true
            }
        })


        //RECIPE BUTTONS
        binding.Salad1.setOnClickListener(){
            val intent = Intent(this, kanisaladRecipe::class.java)
            startActivity(intent)
        }
        binding.Salad2.setOnClickListener(){
            val intent = Intent(this, pakosaladRecipe::class.java)
            startActivity(intent)
        }
        binding.Salad3.setOnClickListener(){
            val intent = Intent(this, caesarsaladRecipe::class.java)
            startActivity(intent)
        }
        binding.Salad4.setOnClickListener(){
            val intent = Intent(this, macaronisaladRecipe::class.java)
            startActivity(intent)
        }


        binding.Snack1.setOnClickListener(){
            val intent = Intent(this, minipizzaRecipe::class.java)
            startActivity(intent)
        }
        binding.Snack2.setOnClickListener(){
            val intent = Intent(this, porksandwichRecipe::class.java)
            startActivity(intent)
        }
        binding.Snack3.setOnClickListener(){
            val intent = Intent(this, frenchfriesRecipe::class.java)
            startActivity(intent)
        }
        binding.Snack4.setOnClickListener(){
            val intent = Intent(this, calamaresRecipe::class.java)
            startActivity(intent)
        }


        binding.Appetizer1.setOnClickListener(){
            val intent = Intent(this, cheesemeltRecipe::class.java)
            startActivity(intent)
        }
        binding.Appetizer2.setOnClickListener(){
            val intent = Intent(this, creamyeggsRecipe::class.java)
            startActivity(intent)
        }
        binding.Appetizer3.setOnClickListener(){
            val intent = Intent(this, riceballsRecipe::class.java)
            startActivity(intent)
        }
        binding.Appetizer4.setOnClickListener(){
            val intent = Intent(this, creamyprawnsRecipe::class.java)
            startActivity(intent)
        }



    }
    private fun makeButtonsVisible(cards:List<Button>){
        for (card in cards){
            card.visibility = View.VISIBLE
        }
    }
    private fun makeButtonsInvisible(cards:List<Button>){
        for (card in cards){
            card.visibility = View.GONE
        }
    }
}