package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usertxt.text = "Enter the temperature in Celcius"
        editText.setOnClickListener{
            val tempInKelvin = findViewById<EditText>(R.id.editText)
            val showButton = findViewById<Button>(R.id.button2)
        }
        button2.setOnClickListener{

        }
    }
}