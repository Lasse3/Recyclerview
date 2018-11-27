package com.example.lager.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Initializing an empty ArrayList to be filled with animals
    val animals: ArrayList<AnimalsData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addAnimals()

        rv_animal_list.layoutManager = LinearLayoutManager(this)

        rv_animal_list.adapter = AnimalAdapter(animals, this)

    }

    // Adds animals to the empty animals ArrayList
    fun addAnimals() {
        animals.add(AnimalsData("Lassie", "1", "Brown", "Dog"))
        animals.add(AnimalsData("Tiddles", "2", "Black", "Cat"))
        animals.add(AnimalsData("Hoot", "20", "Grey", "Owl"))
        animals.add(AnimalsData("Speedy", "5", "Yellow", "Cheetah"))
        animals.add(AnimalsData("Kalvin", "8", "Grey", "Raccoon"))
        animals.add(AnimalsData("Malvin", "4", "Green", "Snake"))
        animals.add(AnimalsData("Gertrud", "1", "White", "Bird"))
        animals.add(AnimalsData("Contad", "1", "Green", "Lizard"))
        animals.add(AnimalsData("Alvin", "6", "Brown", "Hamster"))
    }

}