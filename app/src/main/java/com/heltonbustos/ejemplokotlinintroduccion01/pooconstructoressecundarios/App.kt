package com.heltonbustos.ejemplokotlinintroduccion01.pooconstructoressecundarios

fun main() {

    var a1 = Alumno("Mate", "111-1")
    a1.actuar()

    var textoMensaje = mensaje.ERR01.m
    println(textoMensaje)

    var x = "Helton"
    x.saludo()

    var nnn:Int = 5
    nnn.factorial()
}

fun Int.factorial(){
    var fac:Int = 1

    for (cont in 1..this){
        fac=fac*cont
    }
    println("El número factorial de $this es: $fac")
}

fun String.saludo(){
    println("Hola $this")
}

enum class mensaje(val m:String){
    ERR01("ERROR DE BD"),
    ERR02("ERROR DE SERVIDOR WEB"),
    ERRO3("ERROR DE RED")
}