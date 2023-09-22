package com.mardelapps.apprueba.AppRobate

import android.content.Intent
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
            val name = Mandi.text.toString()

            if(name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    }
}