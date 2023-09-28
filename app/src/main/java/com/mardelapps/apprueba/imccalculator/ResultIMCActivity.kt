package com.mardelapps.apprueba.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.mardelapps.apprueba.R
import com.mardelapps.apprueba.R.string
import com.mardelapps.apprueba.imccalculator.imcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var tvIMC:TextView
    private lateinit var tvDescription:TextView
    private lateinit var btnRecalculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()
    }

    private fun initComponents(){
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when (result) {
            in 0.00..18.50 -> {     //Peso bajo
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.low_weight))
                tvResult.text = getString(R.string.title_low_weigth)
                tvDescription.text = getString(R.string.description_low_weigth)
            }

            in 18.51..24.99 -> {     //Peso normal
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.normal_weight))
                tvResult.text = getString(R.string.title_normal_weight)
                tvDescription.text = getString(R.string.description_normal_weight)
            }

            in 25.00..29.99 -> {     //Sobrepeso
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.high_weight))
                tvResult.text = getString(R.string.title_high_weight)
                tvDescription.text = getString(R.string.description_high_weight)
            }

            in 30.00..99.00 -> {     //Obesidad
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesity_weight))
                tvResult.text = getString(R.string.title_obesity)
                tvDescription.text = getString(R.string.description_obesity)
            }

            else -> {                         //Error
                tvIMC.text = getString(string.error)
                tvResult.text = getString(string.error)
                tvDescription.text = getString(string.error)
            }
        }
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressed() }
    }
}
