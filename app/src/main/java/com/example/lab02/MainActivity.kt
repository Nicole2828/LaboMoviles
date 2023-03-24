package com.example.lab02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var weight_EditText: EditText
    private lateinit var height_EditText: EditText
    private lateinit var calculate_Button: Button
    private lateinit var bmiTV: TextView
    private lateinit var resultTV: TextView
    private lateinit var informationTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()

        setListener()
    }

