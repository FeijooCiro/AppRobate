package com.mardelapps.apprueba.Exercises

import com.mardelapps.apprueba.Exercises.Song as Song

class Song{
    private var titulo:String = "man"
    private var nombreArtista:String = "Roberto"
    private var anioPublicacion:Int = 1945
    private var reproducciones:Int = 304

    fun popularidad(): String {
        if(this.reproducciones < 1000){
            return " poco popular."
        } else {
            return " popular."
        }
    }

    fun mostrarDatos(){
        println("$titulo, interpretada por $nombreArtista, lanzada en $anioPublicacion. Fue ${popularidad()}")
    }
}

fun main(){
    val cancion = Song()
    cancion.mostrarDatos()
}