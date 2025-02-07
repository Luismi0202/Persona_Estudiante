class Estudiante(
    nombre: String,
    edad: Int,
    var carrera: String
):Persona(nombre,edad) {
    override fun toString(): String {
        return "Estudiante(Nombre: $nombre Edad: $edad Carrera: $carrera)"
    }

    override fun actividad() {
        println("$nombre se está pegando una pechá de estudiar...")
    }
}