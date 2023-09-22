package com.mardelapps.apprueba.AppRobate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mardelapps.apprueba.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val Result = findViewById<TextView>(R.id.Result)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        Result.text = "Hola $name"
    }
}