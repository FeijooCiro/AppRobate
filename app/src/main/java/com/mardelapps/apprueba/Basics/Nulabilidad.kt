package com.mardelapps.apprueba.Basics

fun main(){
    var name:String? = null
    var name2:String? = "Mondongo."

    println(name?.get(3) ?: "Es nulísimo: " + name)
    println(name2?.get(0) ?: "Es nulísimo: " + name)
}