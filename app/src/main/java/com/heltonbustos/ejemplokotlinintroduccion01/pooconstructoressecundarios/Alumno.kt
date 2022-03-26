package com.heltonbustos.ejemplokotlinintroduccion01.pooconstructoressecundarios

class Alumno:Persona {

    var materia: String = "Sin materia"

    constructor(materia:String, rut:String):super(rut){
        this.materia = materia
    }

    override fun actuar() {
        println("El alumno actua <3")
    }
}