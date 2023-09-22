package com.mardelapps.apprueba.Exercises

/*
Las entradas de cine suelen tener un precio diferente según la
edad de los espectadores.

En el código inicial que se proporciona en el siguiente fragmento
de código, escribe un programa que calcule los precios de estas
entradas basados en la edad:

* Un precio de entrada infantil es de USD15 para personas de 12 años o menos.

* Un precio de entrada estándar de USD30 para personas de entre 13 y 60 años.
  Los lunes, un precio estándar con descuento de USD25 para el mismo grupo etario.

* Un precio de USD20 para personas de 61 años o más (asumimos que la edad máxima de
  un espectador es de 100 años).

* Un valor de -1 para indicar que el precio no es válido cuando un usuario
  ingresa una edad fuera de las especificaciones.
*/

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val monster = 1348

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    println("The movie ticket price for a person aged $monster is \$${ticketPrice(monster, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when(age){
        in 0..12 -> 15
        in 13..60 -> if(isMonday) 30 else 25
        in 61..100 -> 20
        else -> 678699008
    }
}