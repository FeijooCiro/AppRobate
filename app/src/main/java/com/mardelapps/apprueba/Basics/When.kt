package com.mardelapps.apprueba.Basics

fun main(){
    inMonth(2)
    inTR(2)
    inCTR(2)
    isAny(1)
    inVal(5)
    inReturn(3)
    inWhenAbr(9)
}

fun inMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("Número inválido")
    }
}

fun inTR(month:Int){
    when(month){
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("Número inválido")
    }
}

fun inCTR(month:Int){
    when(month){
        in 1..6 -> println("Primer Semestre")
        in 7..12 -> println("Segundo Semestre")
        //else -> println("Número inválido")
        !in 1..12 -> println("Número inválido")
    }
}

fun isAny(value:Any) {
    when(value){
        is Int -> println(value + value)
        is String -> println(value + " es un String.")
        is Boolean -> if(value) println("Es un Booleano.")
    }
}

fun inVal(month:Int){
    val WhenVal = when(month){
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("Número inválido")
    }
}

fun inReturn(month:Int){
    return when(month){
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("Número inválido")
    }
}

fun inWhenAbr(month:Int) =
    when(month){
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("Número inválido")
    }