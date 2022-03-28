package com.heltonbustos.ejemplokotlinintroduccion01.colecciones

fun main(){

    var lista = listOf<String>("Uno", "Dos", "Tres", "Cuatro")
    var arreglo:IntArray = intArrayOf(1,2,3,4,5,6)
    var mapa = mapOf("111-1" to "Juan Perez", "222-2" to "Ana Guzman", "333-3" to "Camilo Casas")

    println(lista)
    println(arreglo.contentToString())
    println(mapa["333-3"])

    var xx = arreglo.filter { it > 4 }

    var largoMayorA3 = lista.filter { it.endsWith("o") }

    println(largoMayorA3)
    println(xx)
    println(lista.filter { it.startsWith("U") })
}