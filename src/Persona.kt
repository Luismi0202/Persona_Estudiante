open class Persona(
    open val nombre: String,
    open var edad: Int = 16
) {
    init{
        require(!nombre.isEmpty()){"El nombre no puede estar vacío"}
        require(edad > 0){"Las edades no pueden ser negativas"}
    }

    fun cumple() = edad++

    open fun actividad(){
        println("$nombre está realizando una actividad.")
    }

    fun mostrarEdad(){
        println("La edad de $nombre es $edad ")
    }


    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad) "
    }

}