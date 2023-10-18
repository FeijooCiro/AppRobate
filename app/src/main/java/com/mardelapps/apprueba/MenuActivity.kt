package com.mardelapps.apprueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mardelapps.apprueba.AppRobate.AppRobateActivity
import com.mardelapps.apprueba.todoapp.TodoActivity
import com.mardelapps.apprueba.imccalculator.imcCalculatorActivity
import com.mardelapps.apprueba.settings.SettingsActivity
import com.mardelapps.apprueba.superheroapp.SuperHeroListActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val SaludApp = findViewById<Button>(R.id.SaludApp)
        val IMCapp = findViewById<Button>(R.id.IMCapp)
        val TODO = findViewById<Button>(R.id.TODO)
        val SuperHero = findViewById<Button>(R.id.SuperHero)
        val Settings = findViewById<Button>(R.id.btnSettings)

        SaludApp.setOnClickListener { navigateToSaludApp() }
        IMCapp.setOnClickListener { navigateToIMCapp() }
        TODO.setOnClickListener { navigateToTodoApp() }
        SuperHero.setOnClickListener { navigateToSuperHeroApp() }
        Settings.setOnClickListener { navigateToSettings() }
    }
    private fun navigateToSaludApp(){
        val intent = Intent(this, AppRobateActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCapp(){
        val intent = Intent(this, imcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp(){
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperHeroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSettings(){
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}