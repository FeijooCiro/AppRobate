package com.mardelapps.apprueba.Basics

fun main() {
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    //Tamaños
    println(weekDays[0])
    println(weekDays.size)

    //Modificar elementos del array
    weekDays[0] = "Mayumbos"
    println(weekDays[0])

    //Condicionales
    if(weekDays.size >= 8){
        println(weekDays[7])
    } else {
        println("No hay más valores en el array")
    }

    //Bucles con arrays
    for (position in weekDays.indices){
        println("Estoy en la posición " + position + " del día " + weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()){
        println("La posición $position contiene $value")
    }

    for (SUSCRIBETE in weekDays){
        println("Ahora es $SUSCRIBETE")
    }

    weekDays.forEach { it }
}