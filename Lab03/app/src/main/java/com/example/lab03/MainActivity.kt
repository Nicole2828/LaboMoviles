package com.example.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fivecentimage: ImageView
    private lateinit var tencentimage: ImageView
    private lateinit var quartercentimage: ImageView
    private lateinit var dollarcentimage: ImageView
    private lateinit var cashtext: TextView
    private var num = 0.00;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fivecentimage = findViewById(R.id.Five_cent_Image)
        tencentimage = findViewById(R.id.Ten_cent_Image)
        quartercentimage = findViewById(R.id.Quarter_cent_Image)
        dollarcentimage = findViewById(R.id.dollar_cent_Image)

        fivecentimage.setOnClickListener(){
            num += 0.05
            num = String.format("%.2f",num).toDouble()
            cashtext.text = "$${num}"
        }

        tencentimage.setOnClickListener(){
            num += 0.10
            num = String.format("%.2f",num).toDouble()
            cashtext.text = "$${num}"
        }

        quartercentimage.setOnClickListener(){
            num += 0.25
            num = String.format("%.2f",num).toDouble()
            cashtext.text = "$${num}"
        }

        dollarcentimage.setOnClickListener(){
            num += 1.00
            num = String.format("%.2f",num).toDouble()
            cashtext.text = "$${num}"
        }

    }
}