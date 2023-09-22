package com.mardelapps.apprueba.Basics

//Variables Globales

fun main(){
    println("¡Hola mundooooo!");

    //Variables
    val word:String = "What is it?"

    //Calculos
    val Num1:Double = 134.0
    val Num2:Double = 56.0
    Calculator(Num1, Num2)

    //Concatenación
    /*println(NumCalc + word)*/                 //ERROR
    var world:String = "in this world, "
    var who:String = "Who will know "
    var die:String = "If i die "
    var me:String = "something of me?."

    Concat(die, world, who, me)
}

fun Concat(One:String, Two:String, Three:String, Four:String){
    var conc:String = "$One$Two"
    var concTwo:String = "$Three$Four"

    println(One + Two + Three + Four)
    println(conc + concTwo)
}

fun Calculator(Num1:Double, Num2:Double){
    println("Sumar")
    println(Num1 + Num2)
    var NumCalc = Num1 + Num2

    println("Restar")
    println(Num1 - Num2)

    println("Multiplicar")
    println(Num1 * Num2)

    println("Dividir")
    println(Num1 / Num2)
}