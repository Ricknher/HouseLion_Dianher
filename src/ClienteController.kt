class ClienteController {
    private val clientesRegistrados = mutableListOf<Cliente>()

    fun registrarCliente(cliente: Cliente) {
        clientesRegistrados.add(cliente)
    }

    fun obtenerClientePorCorreo(correo: String): Cliente? {
        return clientesRegistrados.find { it.correo == correo }
    }
}