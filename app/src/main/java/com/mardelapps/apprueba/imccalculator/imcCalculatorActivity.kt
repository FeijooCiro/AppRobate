package com.mardelapps.apprueba.imccalculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.mardelapps.apprueba.R

class imcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false

    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponents()
        initListeners()
        initUI()
    }

    private fun initComponents(){
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
    }

    private fun initListeners(){
        viewMale.setOnClickListener {
            changeColor()
            setGenderColor()
        }
        viewFemale.setOnClickListener {
            changeColor()
            setGenderColor()
        }
    }

    private fun changeColor(){
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent:Boolean) : Int{
        val colorReference = if(isSelectedComponent){
            R.color.background_component_selected
        } else {
            R.color.background_component
        }

        return ContextCompat.getColor(this, colorReference)
    }

    private fun initUI() {
        setGenderColor()
    }
}