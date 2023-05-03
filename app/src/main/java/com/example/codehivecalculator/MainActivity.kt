package com.example.codehivecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var add: Button
    private lateinit var subtract: Button
    private lateinit var multiply: Button
    private lateinit var modulus: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castViews()
        validateSIgnUp()

        add.setOnClickListener { add() }
        subtract.setOnClickListener { subtract() }
        multiply.setOnClickListener { multiply() }
        modulus.setOnClickListener { modulus() }
    }

    fun castViews() {
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        add = findViewById(R.id.add)
        subtract = findViewById(R.id.subtract)
        multiply = findViewById(R.id.multiply)
        modulus = findViewById(R.id.modulus)
        result = findViewById(R.id.result)
    }

    private fun add() {
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val sum = n1 + n2
        result.text = sum.toString()
    }

    private fun subtract() {
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val diff = n1 - n2
        result.text = diff.toString()
    }

    private fun multiply() {
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val product = n1 * n2
        result.text = product.toString()
    }

    private fun modulus() {
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val modulus = n1 % n2
        result.text = modulus.toString()
    }

    fun validateSIgnUp() {
        var first = num1.text.toString()
        var second = num2.text.toString()



        if (TextUtils.isEmpty(first) ){
            num1.error = "REQUIRED"

        }
        if(TextUtils.isEmpty(second)) {
            num2.error = "REQUIRED"

        }
    }
}





