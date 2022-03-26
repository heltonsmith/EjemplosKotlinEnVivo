package com.heltonbustos.ejemplokotlinintroduccion01

fun main(){

    mostrarNombreCompleto("Juan", "Perez")

    imprimirFrutas("Cereza", "Sandia")
    imprimirFrutas("Uva", "Manzana", "Frutilla", "Platano", "Melon", "Piña")

}


fun imprimirFrutas(vararg x: String){

    for(i in 0..x.size-1){
        println(x[i])
    }

    for(item in x){
        println(item)
    }

}

fun mostrarNombreCompleto(nombre:String, apellido:String){
    println("Hola $nombre $apellido ¿Cómo estás?")
}