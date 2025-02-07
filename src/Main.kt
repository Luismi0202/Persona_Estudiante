

fun main(){
    val persona1 = Persona("Luismi",20)
    println(persona1.nombre)
    println(persona1.edad)

    persona1.cumple()
    println(persona1.nombre)
    println(persona1.edad)
    println(persona1)

    val estudiante1 = Estudiante("Luismi",20,"la más bonita de todas")
    estudiante1.actividad()
    persona1.actividad()

    try{
        val personaNegativa = Persona("Pablo",-5)
    }catch(e: Exception){
        println("Error ${e.message}")
    }
}