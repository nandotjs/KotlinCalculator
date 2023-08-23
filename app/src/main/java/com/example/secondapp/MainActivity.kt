package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var number1: TextView
    private lateinit var number2: TextView
    private lateinit var res: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1 = findViewById(R.id.firstNumber)
        number2 = findViewById(R.id.secondNumber)
        res = findViewById(R.id.res)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)

        btn1.setOnClickListener{
            calc('+')
        }
        btn2.setOnClickListener{
            calc('-')
        }
        btn3.setOnClickListener{
            calc('*')
        }
        btn4.setOnClickListener{
            calc('/')
        }
    }
    
    // Calculator
    private fun calc(c: Char) {
        val n1 = number1.text.toString().toIntOrNull() ?: 0
        val n2 = number2.text.toString().toIntOrNull() ?: 0
        val result = when(c) {
            '+' -> n1 + n2
            '-' -> n1 - n2
            '*' -> n1 * n2
            '/' -> n1 / n2 .toDouble()
            else -> 0
        }
        res.text = result.toString()

    }
    
    // Light/Dark mode
    
}