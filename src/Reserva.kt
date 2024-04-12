class Reserva(
    val propiedad: Propiedad,
    val cliente: Cliente,
    val fechaInicio: String,
    val fechaFin: String,
    var totalNoches: Int,
    var estaCancelada: Boolean = false
) {
    private var precioTotal = 0.0

    fun calcularPrecio() {
        precioTotal = propiedad.precio * totalNoches
    }

    fun cancelarReserva() {
        estaCancelada = true
    }

    fun actualizarNoches(totalNoches: Int) {
        this.totalNoches = totalNoches
    }

    fun getTotal(): Double = precioTotal

    fun obtenerDatosReserva(): String {
        return "Cliente: ${cliente.nombre} ${cliente.apellido}\n" +
                "Propiedad: ${propiedad.direccion}\n" +
                "Fechas: $fechaInicio - $fechaFin\n" +
                "Total de noches: $totalNoches\n" +
                "Precio total: $precioTotal"
    }
}