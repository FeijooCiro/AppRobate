package com.mardelapps.apprueba.Exercises

import com.mardelapps.apprueba.Exercises.Song as Song

class Song{
    private var titulo:String = "man"
    private var nombreArtista:String = "Roberto"
    private var anioPublicacion:Number = 1945
    private var reproducciones:Number = 304

    fun popularidad(reproduc:Number): String {
        /*reproduc = this.reproducciones
        if(reproduc < 1000){
            return " poco popular."
        } else {
            return " popular."
        }*/
        return "a";
    }

    fun mostrarDatos(){
        //println("$titulo, interpretada por $nombreArtista, lanzada en $anioPublicacion. Fue ${popularidad()}")
    }
}

fun main(){
    //val cancion = Song()
    //cancion.mostrarDatos()
}