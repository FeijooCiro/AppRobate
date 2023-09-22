package com.mardelapps.apprueba.Exercises

// En el mundo, se usan tres escalas de temperatura principales:
// Celsius, Fahrenheit y Kelvin.
//
// En el código inicial, escribe un programa que convierta una temperatura
// de una escala a otra con estas fórmulas:
//
// * De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
// * Kelvin a Celsius: °C = K - 273.15
// * De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
// Ten en cuenta que el método String.format("%.2f", /* measurement */ )
// se usa para convertir un número en un tipo String con 2 decimales.
//
// Completa la función main() para que llame a la función printFinalTemperature() e
// imprima las siguientes líneas. Debes pasar argumentos para la fórmula de conversión
// y temperatura. Sugerencia: Te recomendamos usar valores Double para evitar el
// truncamiento de Integer durante las operaciones de división.

fun main() {
    printFinalTemperature(27.0, "°C", "°F")
    printFinalTemperature(350.0, "K", "°C")
    printFinalTemperature(10.0, "°F", "K")
    printFinalTemperature(45.0, "°T", "°B")
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String
) {
    val finalMeasurement = calculate(initialMeasurement, initialUnit, finalUnit)
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

fun calculate(num:Double, unit:String, fUnit:String): String {
    val Ans:Double
    return when (unit) {
        "°C" -> {
            when (fUnit) {
                "°F" -> {
                    //Formula: (0 °C × 9/5) + 32 = 32 °F
                    Ans = (num * 9 / 5) + 32
                    return "$Ans"
                }

                "K" -> {
                    //Formula: 0 °C + 273.15 = 273,15 K
                    Ans = num + 273.15
                    return "$Ans"
                }

                else -> "Undefined"
            }
        }

        "°F" -> {
            when (fUnit) {
                "°C" -> {
                    //Formula: (32 °F − 32) × 5/9 = 0 °C
                    Ans = (num - 32) * 5 / 9
                    return "$Ans"
                }

                "K" -> {
                    //Formula: (0 °F − 32) × 5/9 + 273.15 = 255,372 K
                    Ans = (num - 32) * 5 / 9 + 273.15
                    return "$Ans"
                }

                else -> "Undefined"
            }
        }

        "K" -> {
            when (fUnit) {
                "°F" -> {
                    //Formula: (0 K − 273.15) × 9/5 + 32 = -459,7 °F
                    Ans = (num - 273.15) * 9 / 5 + 32
                    return "$Ans"
                }

                "°C" -> {
                    //Formula: 0 K − 273.15 = -273,1 °C
                    Ans = num - 273.15
                    return "$Ans"
                }

                else -> "Undefined"
            }
        }
        else -> "Undefined"
    }
}