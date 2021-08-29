package com.example.diceplay

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button =findViewById(R.id.button)
        rollButton.setOnClickListener { luck() }

    }

    private fun luck() {
        val myFirstDice=Dice(6)
        val rollResult=myFirstDice.roll()
        val luckyNumber=4

        when (rollResult) {
            luckyNumber -> {
                val t="You Won!!!!"
                val resultTextView: TextView = findViewById(R.id.textView)
                resultTextView.text = t
            }
            1 -> {
                val t="So sorry! You rolled 1. Try again!"
                val resultTextView: TextView = findViewById(R.id.textView)
                resultTextView.text = t
            }
            2 -> {
                val t="Sadly, you rolled 2. Try again!"
                val resultTextView: TextView = findViewById(R.id.textView)
                resultTextView.text = t

            }
            3 -> {
                val t="Unfortunately, you rolled 3. Try again!"
                val resultTextView: TextView = findViewById(R.id.textView)
                resultTextView.text = t
            }
            5 -> {
                val t = "Don't cry! You rolled 5. Try again!"
                val resultTextView: TextView = findViewById(R.id.textView)
                resultTextView.text = t
            }
            6 -> {
                val t="Apologies! You rolled 6. Try again!"
                val resultTextView: TextView = findViewById(R.id.textView)
                resultTextView.text = t
            }
        }
    }
}
class Dice(private val numSides:Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}