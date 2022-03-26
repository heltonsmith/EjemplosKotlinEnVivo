package com.heltonbustos.ejemplokotlinintroduccion01.pooconstructoressecundarios

open class Persona {

    var rut: String = "Sin rut"
    var nombre: String = "Sin nombre"
    var edad: Int = 0

    constructor(rut:String){
        this.rut = rut
    }

    constructor(rut:String, nombre:String, edad:Int){
        this.rut = rut
        this.nombre = nombre
        this.edad = edad
    }

    open fun actuar(){
        println("La persona actua")
    }

}