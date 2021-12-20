    package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

    class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var weightET: EditText
    private lateinit var heightET: EditText
    private lateinit var resultTV: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.addButtonId)
        heightET = findViewById(R.id.editText1)
        weightET = findViewById(R.id.editText2)
        resultTV = findViewById(R.id.textViewId)

        btn.setOnClickListener {
            val height = heightET.text.toString().toDouble()
            val weight = weightET.text.toString().toDouble()

            resultTV.text = (weight / (height * height)).toString()

        }
    }
}