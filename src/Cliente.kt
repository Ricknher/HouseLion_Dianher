class Cliente(
    val nombre: String,
    val apellido: String,
    val correo: String,
    val telefono: String
) {
    private val bookings = mutableListOf<Reserva>()

    fun addBooking(booking: Reserva) {
        bookings.add(booking)
    }
}