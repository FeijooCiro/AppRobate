package com.mardelapps.apprueba.AppRobate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.mardelapps.apprueba.R

class AppRobateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_robate)
        val Rogelio = findViewById<AppCompatButton>(R.id.RogelioElBotOM)
        val Mandi = findViewById<AppCompatEditText>(R.id.Mandingas)

        Rogelio.setOnClickListener {
            Log.i("Malañaz", "Esto es lo que pusiste: ${Mandi.text.toString()}")
        }
    }
}