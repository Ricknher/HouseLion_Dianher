class ReservaController {
    private val reservasRealizadas = mutableListOf<Reserva>()

    fun hacerReserva(reserva: Reserva) {
        reservasRealizadas.add(reserva)
    }
}