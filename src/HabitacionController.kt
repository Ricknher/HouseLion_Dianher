class HabitacionController {
    private val habitacionesDisponibles = mutableListOf<Habitacion>()

    fun agregarHabitacion(habitacion: Habitacion) {
        habitacionesDisponibles.add(habitacion)
    }
}