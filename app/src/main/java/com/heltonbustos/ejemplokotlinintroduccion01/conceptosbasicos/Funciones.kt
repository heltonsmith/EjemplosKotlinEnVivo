package com.heltonbustos.ejemplokotlinintroduccion01

fun main(){

    mostrarNombreCompleto("Juan", "Perez")

    imprimirFrutas("Cereza", "Sandia")
    imprimirFrutas("Uva", "Manzana", "Frutilla", "Platano", "Melon", "Piña")

    var x = 3

    when(x){
        1-> {
            println("Feliz lunes")
        }
        2-> println("Feliz martes")
        3-> println("Feliz miércoles")
        else->{
            println("Día inválido!...")
        }
    }

    val op = "rgfd"
    val res = when(op){
       "+"-> 3+2
       "-"-> 3-2
       "*"-> 3*2
       "/"-> 3/2
        else->{
            -9999
        }
    }

    println(res)
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