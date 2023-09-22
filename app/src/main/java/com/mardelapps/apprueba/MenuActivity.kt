package com.mardelapps.apprueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mardelapps.apprueba.AppRobate.AppRobateActivity
import com.mardelapps.apprueba.imccalculator.imcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val SaludApp = findViewById<Button>(R.id.SaludApp)
        val IMCapp = findViewById<Button>(R.id.IMCapp)
        SaludApp.setOnClickListener { navigateToSaludApp() }
        IMCapp.setOnClickListener { navigateToIMCapp() }
    }
    private fun navigateToSaludApp(){
        var intent = Intent(this, AppRobateActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCapp(){
        var intent = Intent(this, imcCalculatorActivity::class.java)
        startActivity(intent)
    }
}